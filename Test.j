.source                  Test.java
.class                   public Test
.super                   java/lang/Object


.method                  public <init>()V
   .limit stack          1
   .limit locals         1
   .line                 1
   aload_0               
   invokespecial         java/lang/Object/<init>()V
   return                
.end method              

.method                  public static doSomething(I)Ljava/lang/String;
   .limit stack          1
   .limit locals         1
   .line                 4
   iload_0               
   invokestatic          java/lang/Integer/toString(I)Ljava/lang/String;
   areturn               
.end method              

.method                  public static main([Ljava/lang/String;)V
   .limit stack          2
   .limit locals         2
   .line                 10
   iconst_3              
   invokestatic          Test/doSomething(I)Ljava/lang/String;
   astore_1              
   .line                 11
   getstatic             java/lang/System/out Ljava/io/PrintStream;
   aload_1               
   invokevirtual         java/io/PrintStream/println(Ljava/lang/String;)V
   .line                 12
   return                
   .throws               java/lang/Exception
.end method              

