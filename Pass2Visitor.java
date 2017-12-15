import java.io.PrintWriter;

import wci.intermediate.*;
import wci.intermediate.symtabimpl.*;

import java.util.Arrays;

public class Pass2Visitor extends PirateBaseVisitor<Integer> 
{
    String programName;
    private PrintWriter jFile;
    
    public Pass2Visitor(PrintWriter jFile)
    {
        this.jFile = jFile;
    }
    
    @Override 
    public Integer visitProgram(PirateParser.ProgramContext ctx) 
    { 

        Integer value = visitChildren(ctx); 
        jFile.close();
        return value;
    }

    @Override 
    public Integer visitHeader(PirateParser.HeaderContext ctx) 
    { 
        programName = ctx.IDENTIFIER().toString();       
        return visitChildren(ctx); 
    }

    @Override 
    public Integer visitMainBlock(PirateParser.MainBlockContext ctx) 
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
    public Integer visitStmt(PirateParser.StmtContext ctx) 
    { 
        jFile.println("\n; " + ctx.getText() + "\n");
        
        return visitChildren(ctx); 
    }

    @Override 
    public Integer visitAssign_stmt(PirateParser.Assign_stmtContext ctx)
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
    public Integer visitIntegerConst(PirateParser.IntegerConstContext ctx)
    {
        // Emit a load constant instruction.
        jFile.println("\tldc\t" + ctx.getText());
        
        return visitChildren(ctx); 
    }

    @Override 
    public Integer visitFloatConst(PirateParser.FloatConstContext ctx)
    {
        // Emit a load constant instruction.
        jFile.println("\tldc\t" + ctx.getText());
        
        return visitChildren(ctx); 
    }

    @Override 
    public Integer visitWrite_stmt(PirateParser.Write_stmtContext ctx) 
    {   
        String valueStr = ctx.output().string().getText();
        System.out.println(valueStr);
        jFile.println("\t.limit stack          2");
        jFile.println("\t.limit locals         1");
        jFile.println("\t.line                 6");
        jFile.println("\tgetstatic             java/lang/System/out Ljava/io/PrintStream;");
        jFile.println("\tldc                   \"" + valueStr + "\"");
        jFile.println("\tinvokevirtual         java/io/PrintStream/println(Ljava/lang/String;)V");
        jFile.println("\t.line                 8");
        jFile.println("\treturn");
        jFile.println("\t.throws               java/lang/Exception");
        
        return visitChildren(ctx); 
    }

    @Override 
    public Integer visitIf_stmt(PirateParser.If_stmtContext ctx)
    { 
        return visitChildren(ctx); 
    }



    @Override 
    public Integer visitAddSubExpr(PirateParser.AddSubExprContext ctx)
    {
        Integer value = visitChildren(ctx);
                        
        TypeSpec type1 = ctx.expr(0).type;
        TypeSpec type2 = ctx.expr(1).type;
        
        boolean integerMode =    (type1 == Predefined.integerType)
                              && (type2 == Predefined.integerType);
        boolean realMode    =    (type1 == Predefined.realType)
                              && (type2 == Predefined.realType);
        
        String op = ctx.add_sub_op().getText();
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
    public Integer visitMulDivExpr(PirateParser.MulDivExprContext ctx)
    {
        Integer value = visitChildren(ctx);
                
        TypeSpec type1 = ctx.expr(0).type;
        TypeSpec type2 = ctx.expr(1).type;
        
        boolean integerMode =    (type1 == Predefined.integerType)
                              && (type2 == Predefined.integerType);
        boolean realMode    =    (type1 == Predefined.realType)
                              && (type2 == Predefined.realType);
        
        String op = ctx.mul_div_op().getText();
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

    // @Override 
    // public Integer visitVariableExpr(Pcl2Parser.VariableExprContext ctx)
    // {
    //     String variableName = ctx.variable().IDENTIFIER().toString();
    //     TypeSpec type = ctx.type;
        
    //     String typeIndicator = (type == Predefined.integerType) ? "I"
    //                          : (type == Predefined.realType)    ? "F"
    //                          :                                    "?";
        
    //     // Emit a field get instruction.
    //     jFile.println("\tgetstatic\t" + programName +
    //                   "/" + variableName + " " + typeIndicator);
        
    //     return visitChildren(ctx); 
    // }
    
    // @Override 
    // public Integer visitSignedNumber(Pcl2Parser.SignedNumberContext ctx)
    // {
    //     Integer value = visitChildren(ctx);         
    //     TypeSpec type = ctx.number().type;
        
    //     if (ctx.sign().getChild(0) == ctx.sign().SUB_OP()) {
    //         String opcode = (type == Predefined.integerType) ? "ineg"
    //                       : (type == Predefined.realType)    ? "fneg"
    //                       :                                    "?neg";
            
    //         // Emit a negate instruction.
    //         jFile.println("\t" + opcode);
    //     }
        
    //     return value;
    // }



}