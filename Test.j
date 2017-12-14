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

.method                  public static main([Ljava/lang/String;)V
   .limit stack          2
   .limit locals         2
   .line                 5
   iconst_4              
   invokestatic          java/lang/Integer/valueOf(I)Ljava/lang/Integer;
   astore_1              
   .line                 6
   getstatic             java/lang/System/out Ljava/io/PrintStream;
   aload_1               
   invokevirtual         java/io/PrintStream/println(Ljava/lang/Object;)V
   .line                 7
   return                
   .throws               java/lang/Exception
.end method              

