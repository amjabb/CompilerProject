import java.io.PrintWriter;

import wci.intermediate.*;
import wci.intermediate.symtabimpl.*;

import java.util.*;

public class Pass2Visitor extends BusinessBaseVisitor<Integer> 
{
    String programName;
    private PrintWriter jFile;

    HashMap< String,Integer> hm = new HashMap< String,Integer>();
    
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
     public Integer visitMain(BusinessParser.MainContext ctx) 
     { 
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
        return visitChildren(ctx); 
    }

    
    @Override 
    public Integer visitMainBlock(BusinessParser.MainBlockContext ctx) 
    { 
        // Emit the main program header.
        
        
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
                             :                                    "I";
        
        // Emit a field put instruction.
        jFile.println("\tputstatic\t" + programName
                           +  "/" + ctx.variable().IDENTIFIER().toString() 
                           + " " + typeIndicator);

        return value; 
    }

    @Override 
    public Integer visitFuncAssignmentStmt(BusinessParser.FuncAssignmentStmtContext ctx)
    {
        // Integer value = visit(ctx.expr());
        
        // String typeIndicator = (ctx.expr().type == Predefined.integerType) ? "I"
        //                      : (ctx.expr().type == Predefined.realType)    ? "F"
        //                      :                                    "I";
        
        // Emit a field put instruction.
        Integer value = visitChildren(ctx);

        jFile.println("\tputstatic\t" + programName
                           +  "/" + ctx.variable().IDENTIFIER().toString() 
                           + " I");

        return value; 
    }



    @Override 
    public Integer visitFunctionAssignment(BusinessParser.FunctionAssignmentContext ctx) 
    {   
        Integer value = visitChildren(ctx);
        // Emit a field put instruction.
        jFile.println("\tputstatic\t" + programName
                           +  "/" + ctx.IDENTIFIER().toString() 
                           + " I");
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
                             :                                    "I";
        
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
        Integer iVal = i;
        jFile.print(" L00" + Integer.toString(i+1) + "\n");
        jFile.println("\ticonst_0");
        jFile.println("\tgoto L00" + Integer.toString(i+2));
        jFile.println("\tL00" + Integer.toString(i+1) + ":");
        jFile.println("\ticonst_1");
        jFile.println("\tL00" + Integer.toString(i+2) + ":");
        jFile.println("\tifeq L00" + Integer.toString(i));
        i += 3;
        value = visitChildren(ctx.stmt(0));
        jFile.println("\tL00" + Integer.toString(iVal) + ":");
        return value; 
    }

    @Override 
    public Integer visitForStatement(BusinessParser.ForStatementContext ctx) 
    { 
        String value = ctx.INTEGER().getText();
        jFile.println(".limit stack " + value);
        
        jFile.println("\tldc\t" + value);
        jFile.println("putstatic " + programName + "/z I");

        jFile.println("\tW00" + Integer.toString(i) + ":");
        jFile.println("\ticonst_0");
        jFile.println("getstatic " + programName + "/z I");
        jFile.println("\tif_icmpge\tW00" + Integer.toString(i+1));
        Integer rValue = visit(ctx.compoundStmt());
        jFile.println("ldc -1");
        jFile.println("getstatic " + programName + "/z I");
        jFile.println("iadd");
        jFile.println("putstatic " + programName + "/z I");
        jFile.println("\tgoto W00" + Integer.toString(i));
        jFile.println("\tW00" + Integer.toString(i+1) + ":");
        i += 2;
        return rValue; 
    }

    @Override 
    public Integer visitWhileStatement(BusinessParser.WhileStatementContext ctx) 
    { 
        //String value = ctx.INTEGER().getText();
        jFile.println(".limit stack 4");
        jFile.println("\tW00" + Integer.toString(i) + ":");
        visit(ctx.expr()); jFile.print(" W00" + Integer.toString(i+1) + "\n");
        jFile.println("goto W00" + Integer.toString(i+2));
        jFile.println(" W00" + Integer.toString(i+1) + ":");
        Integer rValue = visit(ctx.compoundStmt());
        jFile.println("\tgoto W00" + Integer.toString(i));
        jFile.println("\tW00" + Integer.toString(i+2) + ":");
        i += 3;
        return rValue; 
    }

    static Integer j = 0;
    @Override 
    public Integer visitFormalParameterList(BusinessParser.FormalParameterListContext ctx) 
    { 
        // for(j = 0; j < ctx.formalParameterSection(0).parameterGroup().varList().varId().size(); j++){
        //     hm.put(ctx.formalParameterSection(0).parameterGroup().varList().varId(j).getText(), j);
        // }
        return visitChildren(ctx); 
    }


    HashMap<String, Integer> varHash = new HashMap<String, Integer>();

   @Override 
    public Integer visitFunctionDeclaration(BusinessParser.FunctionDeclarationContext ctx)
    { 
        String functionName = ctx.funcId().IDENTIFIER().getText();
        jFile.println(".method public static " + functionName + "(II)I");
        for(Integer i = 0; i < ctx.formalParameterList().parameterGroup(0).varList().varId().size(); i++){
            varHash.put(ctx.formalParameterList().parameterGroup(0).varList().varId(i).IDENTIFIER().getText(), i);
        }

        // Set set = varHash.entrySet();
        //   Iterator iterator = set.iterator();
        //   while(iterator.hasNext()) {
        //      Map.Entry mentry = (Map.Entry)iterator.next();
        //      System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
        //      System.out.println(mentry.getValue());
        //   }


        //works
        // jFile.println("iload_0");
        // jFile.println("putstatic    sample/i I"); 
        //figure out a way to return here
        //visit(ctx.compoundStmt().stmtList().stmt(0).returnStmt());
        return visitChildren(ctx); 
    }


    @Override 
    public Integer visitReturnStmt(BusinessParser.ReturnStmtContext ctx) 
    { 
        Integer value = visitChildren(ctx);
        jFile.println("ireturn");
        jFile.println(".limit locals 5");
        jFile.println(".limit stack 5");
        jFile.println(".end method");
        return value; 
    }

    @Override 
    public Integer visitCallStmt(BusinessParser.CallStmtContext ctx) 
    { 
        Integer value = visitChildren(ctx); 
        jFile.println("invokestatic "+ programName + "/" + ctx.functionDesignator().IDENTIFIER().getText() + "(II)I");
        return value; 
    }


    @Override 
    public Integer visitFuncVar(BusinessParser.FuncVarContext ctx)
     { 
        String value;
        try {
            value = ctx.INTEGER().getText().toString();
        } catch(Exception e) {
            value = Integer.toString(varHash.get(ctx.variable().IDENTIFIER().getText().toString()));

        }
        
        jFile.println("iload_" + value);
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


        return 1; 
    }

    @Override 
    public Integer visitPrintDoubleStmt(BusinessParser.PrintDoubleStmtContext ctx) 
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

        jFile.println("\tinvokevirtual java/lang/StringBuilder/append(D)Ljava/lang/StringBuilder;");
        jFile.println("\tinvokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;");
        jFile.println("\tinvokevirtual         java/io/PrintStream/println(Ljava/lang/String;)V");

        return value; 
    }


    @Override 
    public Integer visitPrintStringStmt(BusinessParser.PrintStringStmtContext ctx) 
    { 
        jFile.println("getstatic             java/lang/System/out Ljava/io/PrintStream;");
        jFile.println("ldc " + ctx.string().getText().toString());
        jFile.println("invokevirtual         java/io/PrintStream/println(Ljava/lang/String;)V");
        return visitChildren(ctx); 
    }




}