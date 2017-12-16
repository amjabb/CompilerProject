import java.io.PrintWriter;

import wci.intermediate.*;
import wci.intermediate.symtabimpl.*;

public class Pass2Visitor extends BusinessBaseVisitor<Integer> 
{
    String programName;
    private PrintWriter jFile;
    
    public Pass2Visitor(PrintWriter jFile)
    {
        this.jFile = jFile;
    }
    
    @Override 
    public Integer visitProgram(BusinessParser.ProgramContext ctx) 
    { 
        Integer value = visitChildren(ctx); 
        jFile.close();
        return value;
    }
    
    @Override 
    public Integer visitHeader(BusinessParser.HeaderContext ctx) 
    { 
        programName = ctx.IDENTIFIER().toString();       
        return visitChildren(ctx); 
    }
    
    @Override 
    public Integer visitMainBlock(BusinessParser.MainBlockContext ctx) 
    { 
        // Emit the main program header.
        jFile.println();
        jFile.println(".method public static main([Ljava/lang/String;)V");
        jFile.println();
        jFile.println("\tnew RunTimer");
        jFile.println("\tdup");
        jFile.println("\tinvokenonvirtual RunTimer/<init>()V");
        jFile.println("\tputstatic        " + programName + "/_runTimer LRunTimer;");
        jFile.println("\tnew PascalTextIn");
        jFile.println("\tdup");
        jFile.println("\tinvokenonvirtual PascalTextIn/<init>()V");
        jFile.println("\tputstatic        " + programName + "/_standardIn LPascalTextIn;");
        
        Integer value = visitChildren(ctx);
        
        // Emit the main program epilogue.
        jFile.println();
        jFile.println("\tgetstatic     " + programName + "/_runTimer LRunTimer;");
        jFile.println("\tinvokevirtual RunTimer.printElapsedTime()V");
        jFile.println();
        jFile.println("\treturn");
        jFile.println();
        jFile.println(".limit locals 16");
        jFile.println(".limit stack 16");
        jFile.println(".end method");
        
        return value;
    }

    @Override 
    public Integer visitStmt(BusinessParser.StmtContext ctx) 
    { 
        jFile.println("\n; " + ctx.getText() + "\n");
        
        return visitChildren(ctx); 
    }
    @Override 
    public Integer visitAssignmentStmt(BusinessParser.AssignmentStmtContext ctx)
    {
        Integer value = visit(ctx.expr());
        
        String typeIndicator = (ctx.expr().type == Predefined.integerType) ? "I"
                             : (ctx.expr().type == Predefined.realType)    ? "F"
                             :                                    "?";
        
        // Emit a field put instruction.
        jFile.println("\tputstatic\t" + programName
                           +  "/" + ctx.variable().IDENTIFIER().toString() 
                           + " " + typeIndicator);

        return value; 
    }

    @Override 
    public Integer visitAddSubExpr(BusinessParser.AddSubExprContext ctx)
    {
        Integer value = visitChildren(ctx);
                        
        TypeSpec type1 = ctx.expr(0).type;
        TypeSpec type2 = ctx.expr(1).type;
        
        boolean integerMode =    (type1 == Predefined.integerType)
                              && (type2 == Predefined.integerType);
        boolean realMode    =    (type1 == Predefined.realType)
                              && (type2 == Predefined.realType);
        
        String op = ctx.addSubOp().getText();
        String opcode;

        if (op.equals("+")) {
            opcode = integerMode ? "iadd"
                   : realMode    ? "fadd"
                   :               "????";
        }
        else {
            opcode = integerMode ? "isub"
                   : realMode    ? "fsub"
                   :               "????";
        }
        
        // Emit an add or subtract instruction.
        jFile.println("\t" + opcode);
        
        return value; 
    }

    @Override 
    public Integer visitMulDivExpr(BusinessParser.MulDivExprContext ctx)
    {
        Integer value = visitChildren(ctx);
                
        TypeSpec type1 = ctx.expr(0).type;
        TypeSpec type2 = ctx.expr(1).type;
        
        boolean integerMode =    (type1 == Predefined.integerType)
                              && (type2 == Predefined.integerType);
        boolean realMode    =    (type1 == Predefined.realType)
                              && (type2 == Predefined.realType);
        
        String op = ctx.mulDivOp().getText();
        String opcode;

        if (op.equals("*")) {
            opcode = integerMode ? "imul"
                   : realMode    ? "fmul"
                   :               "f???";
        }
        else {
            opcode = integerMode ? "idiv"
                   : realMode    ? "fdiv"
                   :               "????";
        }
        
        // Emit a multiply or divide instruction.
        jFile.println("\t" + opcode);
        
        return value; 
    }

    @Override 
    public Integer visitVariableExpr(BusinessParser.VariableExprContext ctx)
    {
        String variableName = ctx.variable().IDENTIFIER().toString();
        TypeSpec type = ctx.type;
        
        String typeIndicator = (type == Predefined.integerType) ? "I"
                             : (type == Predefined.realType)    ? "F"
                             :                                    "?";
        
        // Emit a field get instruction.
        jFile.println("\tgetstatic\t" + programName +
                      "/" + variableName + " " + typeIndicator);
        
        return visitChildren(ctx); 
    }
    
    @Override 
    public Integer visitSignedNumber(BusinessParser.SignedNumberContext ctx)
    {
        Integer value = visitChildren(ctx);         
        TypeSpec type = ctx.number().type;
        
        if (ctx.sign().getChild(0) == ctx.sign().SUB_OP()) {
            String opcode = (type == Predefined.integerType) ? "ineg"
                          : (type == Predefined.realType)    ? "fneg"
                          :                                    "?neg";
            
            // Emit a negate instruction.
            jFile.println("\t" + opcode);
        }
        
        return value;
    }

    @Override 
    public Integer visitIntegerConst(BusinessParser.IntegerConstContext ctx)
    {
        // Emit a load constant instruction.
        jFile.println("\tldc\t" + ctx.getText());
        
        return visitChildren(ctx); 
    }

    @Override 
    public Integer visitFloatConst(BusinessParser.FloatConstContext ctx)
    {
        // Emit a load constant instruction.
        jFile.println("\tldc\t" + ctx.getText());
        
        return visitChildren(ctx); 
    }

    @Override 
    public Integer visitStringExpr(BusinessParser.StringExprContext ctx) 
    { 
        String valueStr = ctx.string().getText();
        jFile.println("\tldc                   \"" + valueStr + "\"");
        return visitChildren(ctx); 
    }

    @Override 
    public Integer visitCompareExpr(BusinessParser.CompareExprContext ctx) 
    { 
        Integer value = visitChildren(ctx);

        TypeSpec type1 = ctx.expr(0).type;
        TypeSpec type2 = ctx.expr(1).type;

        boolean integerMode =    (type1 == Predefined.integerType)
                              && (type2 == Predefined.integerType);
        boolean realMode    =    (type1 == Predefined.realType)
                              && (type2 == Predefined.realType);

        String op = ctx.compareOp().getText();
        String op_code = "";

        switch(op){
            case "<":
                op_code = "if_icmplt";
                break;
            case ">":
                op_code = "if_icmpgt";
                break;
            case ">=":
                op_code = "if_icmpge";
                break;
            case "<=":
                op_code = "if_icmple";
                break;
            case "==":
                op_code = "if_icmpeq";
                break;
            case "!=":
                op_code = "if_icmpne";
                break;
        }
        jFile.print("\t" + op_code);
        return value; 
    }

    static Integer i = 1;
    @Override 
    public Integer visitIfStatement(BusinessParser.IfStatementContext ctx) 
    { 
        
        Integer value = visit(ctx.expr());
        jFile.print(" L00" + Integer.toString(i+1) + "\n");
        jFile.println("\ticonst_0");
        jFile.println("\tgoto L00" + Integer.toString(i+2));
        jFile.println("\tL00" + Integer.toString(i+1) + ":");
        jFile.println("\ticonst_1");
        jFile.println("\tL00" + Integer.toString(i+2) + ":");
        jFile.println("\tifeq L00" + Integer.toString(i));
        value = visitChildren(ctx.stmt(0));
        jFile.println("\tL00" + Integer.toString(i) + ":");
        i += 3;
        return value; 
    }

    static Integer j = 1;
    @Override 
    public Integer visitWhileStatement(BusinessParser.WhileStatementContext ctx) 
    { 
        
        jFile.println("\tW00" + Integer.toString(j) + ":");
        Integer value = visit(ctx.expr());
        jFile.print(" W00" + Integer.toString(j+1) + "\n");
        jFile.println("\ticonst_0");
        jFile.println("\tgoto W00" + Integer.toString(j+2));
        jFile.println("\tW00" + Integer.toString(j+1) + ":");
        value = visit(ctx.stmt());
        jFile.println("\tgoto W00" + Integer.toString(j));
        jFile.println("\tW00" + Integer.toString(j+2) +":");
        j += 3;
        return value; 
    }

    @Override 
    public Integer visitFormalParameterList(BusinessParser.FormalParameterListContext ctx) 
    { 
        return visitChildren(ctx); 
    }


    @Override 
    public Integer visitFunctionExpr(BusinessParser.FunctionExprContext ctx) 
    { 
        String functionName = ctx.functionCall().functionDesignator().IDENTIFIER().toString();
        System.out.println(functionName);
        return visitChildren(ctx); 
    }




    @Override 
    public Integer visitPrintStmt(BusinessParser.PrintStmtContext ctx) 
    { 
        
        jFile.println("\t.limit stack          2");
        jFile.println("\t.limit locals         1");
        jFile.println("\t.line                 6");
        jFile.println("\tgetstatic             java/lang/System/out Ljava/io/PrintStream;");
        jFile.println("\tnew       java/lang/StringBuilder");
        jFile.println("\tdup");
        jFile.println("\tldc \"Output = \"");
        jFile.println("\tinvokenonvirtual java/lang/StringBuilder/<init>(Ljava/lang/String;)V");

        Integer value = visitChildren(ctx);

        jFile.println("\tinvokevirtual java/lang/StringBuilder/append(I)Ljava/lang/StringBuilder;");
        jFile.println("\tinvokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;");
        jFile.println("\tinvokevirtual         java/io/PrintStream/println(Ljava/lang/String;)V");
        jFile.println("\t.line                 8");
        jFile.println("\treturn");
        jFile.println("\t.throws               java/lang/Exception");

        return 1; 
    }



}