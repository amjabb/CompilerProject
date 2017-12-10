import java.util.ArrayList;

import wci.intermediate.*;
import wci.intermediate.symtabimpl.*;
import wci.util.*;

import static wci.intermediate.symtabimpl.SymTabKeyImpl.*;
import static wci.intermediate.symtabimpl.DefinitionImpl.*;

public class CompilerVisitor extends HelloBaseVisitor<Integer> 
{
    private SymTabStack symTabStack;
    private SymTabEntry programId;
    private ArrayList<SymTabEntry> stmtList;
    private TypeSpec dataType;
    
    public CompilerVisitor()
    {
        // Create and initialize the symbol table stack.
        symTabStack = SymTabFactory.createSymTabStack();
        Predefined.initialize(symTabStack);
    }
    
    @Override 
    public Integer visitProgram(HelloParser.ProgramContext ctx) 
    { 
        System.out.println("Visiting program");
        Integer value = visitChildren(ctx); 
        
        // Print the cross-reference table.
        //CrossReferencer crossReferencer = new CrossReferencer();
        //crossReferencer.print(symTabStack);
        
        return value;
    }

    @Override
    public Integer visitStmt_list(HelloParser.Stmt_listContext ctx)
    {
        System.out.println("Visiting statement list");
        stmtList = new ArrayList<SymTabEntry>();
        
        return visitChildren(ctx); 

    }

    @Override
    public Integer visitStmt(HelloParser.StmtContext ctx)
    {
        System.out.println("Visiting statement");
        return visitChildren(ctx);
    }

    // @Override 
    // public Integer visitAssign_stmt(HelloParser.Assign_stmtContexInteger ctx) 
    // { 
    //     System.out.println("Visiting assign statement");
    //     return visitChildren(ctx); 
    // }

    // @Override 
    // public Integer visitRead_stmt(HelloParser.Read_stmtContexInteger ctx) 
    // { 
    //     System.out.println("Visiting read statement");
    //     return visitChildren(ctx); 
    // }

    // @Override 
    // public Integer visitWrite_stmt(HelloParser.Write_stmtContexInteger ctx) 
    // { 
    //     System.out.println("Visiting write statement");
    //     return visitChildren(ctx); 
    // }

    // @Override 
    // public Integer visitId_list(HelloParser.Id_listContexInteger ctx) 
    // { 
    //     System.out.println("Visiting id list");
    //     return visitChildren(ctx); 
    // }

    // @Override 
    // public Integer visitExpr_list(HelloParser.Expr_listContexInteger ctx) 
    // { 
    //     System.out.println("Visiting expresion list");
    //     return visitChildren(ctx); 
    // }

    // @Override 
    // public Integer visitExpr(HelloParser.ExprContexInteger ctx) 
    // { 
    //     System.out.println("Visiting expression");
    //     return visitChildren(ctx); 
    // }

    // @Override 
    // public Integer visitFactor(HelloParser.FactorContexInteger ctx) 
    // { 
    //     System.out.println("Visiting factor");
    //     return visitChildren(ctx); 
    // }

    // @Override 
    // public Integer visitInteger(HelloParser.IntegerContexInteger ctx) 
    // { 
    //     System.out.println("Visiting integer");
    //     return visitChildren(ctx); 
    // }

    // @Override 
    // public Integer visitCompare_op(HelloParser.Compare_opContexInteger ctx)
    // { 
    //     System.out.println("Visiting compare operation");
    //     return visitChildren(ctx); 
    // }

    // @Override 
    // public Integer visitCompare_stmt(HelloParser.Compare_stmtContexInteger ctx) 
    // { 
    //     System.out.println("Visiting compare statement");
    //     return visitChildren(ctx); 
    // }

    // @Override 
    // public Integer visitOperator(HelloParser.OperatorContexInteger ctx) 
    // { 
    //     System.out.println("Visiting operator");
    //     return visitChildren(ctx); 
    // }

    // @Override 
    // public Integer visitIdent(HelloParser.IdentContexInteger ctx) 
    // { 
    //     System.out.println("Visiting ident");
    //     return visitChildren(ctx); 
    // }

    // @Override 
    // public Integer visitIf_stmt(HelloParser.If_stmtContexInteger ctx) 
    // { 
    //     System.out.println("Visiting if statement");
    //     return visitChildren(ctx); 
    // }

    // @Override 
    // public Integer visitWhile_stmt(HelloParser.While_stmtContexInteger ctx) 
    // { 
    //     System.out.println("Visiting while statement");
    //     return visitChildren(ctx); 
    // }

    
    // @Override 
    // public Integer visitHeader(PclParser.HeaderContext ctx) 
    // { 
    //     String programName = ctx.IDENTIFIER().toString();
    //     System.out.println("Program name = " + programName);
        
    //     programId = symTabStack.enterLocal(programName);
    //     programId.setDefinition(DefinitionImpl.PROGRAM);
    //     programId.setAttribute(ROUTINE_SYMTAB, symTabStack.push());
    //     symTabStack.setProgramId(programId);
        
    //     return visitChildren(ctx); 
    // }

    // @Override 
    // public Integer visitDecl(PclParser.DeclContext ctx) 
    // { 
    //     System.out.println("Visiting dcl");
    //     return visitChildren(ctx); 
    // }

    // @Override 
    // public Integer visitVar_list(PclParser.Var_listContext ctx) 
    // { 
    //     System.out.println("Visiting variable list");
    //     variableIdList = new ArrayList<SymTabEntry>();
        
    //     return visitChildren(ctx);         
    // }
    
    // @Override 
    // public Integer visitVar_id(PclParser.Var_idContext ctx) 
    // { 
    //     String variableName = ctx.IDENTIFIER().toString();
    //     System.out.println("Declared Id = " + variableName);
        
    //     SymTabEntry variableId = symTabStack.enterLocal(variableName);
    //     variableId.setDefinition(VARIABLE);
    //     variableIdList.add(variableId);
        
    //     return visitChildren(ctx); 
    // }
    
    // @Override 
    // public Integer visitType_id(PclParser.Type_idContext ctx) 
    // { 
    //     String typeName = ctx.IDENTIFIER().toString();
    //     System.out.println("Type = " + typeName);
        
    //     dataType = typeName.equalsIgnoreCase("integer") 
    //                         		? Predefined.integerType
    //              : typeName.equalsIgnoreCase("real")
    //                          	? Predefined.realType
    //                          	: null;
            
    //     for (SymTabEntry id : variableIdList) id.setTypeSpec(dataType);
        
    //     return visitChildren(ctx); 
    // }
}