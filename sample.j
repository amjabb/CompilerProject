.class public sample
.super java/lang/Object

.field private static _runTimer LRunTimer;
.field private static _standardIn LPascalTextIn;
.field private static z I

; i,j,k:integer

.field private static i I
.field private static j I
.field private static k I

; alpha,beta5x:real

.field private static alpha F
.field private static beta5x F

; defadder(n1,n2:integer):integer;s:integer;MAIN{s=n2;RETURNn1;}

.field private static n1 I
.field private static n2 I

; s:integer

.field private static s I

.method public <init>()V

	aload_0
	invokenonvirtual    java/lang/Object/<init>()V
	return

.limit locals 1
.limit stack 1
.end method
.method public static adder(II)I
iload_1
	putstatic	sample/s I
iload_0
ireturn
.limit locals 5
.limit stack 5
.end method

.method public static main([Ljava/lang/String;)V

	new RunTimer
	dup
	invokenonvirtual RunTimer/<init>()V
	putstatic        sample/_runTimer LRunTimer;
	new PascalTextIn
	dup
	invokenonvirtual PascalTextIn/<init>()V
	putstatic        sample/_standardIn LPascalTextIn;

; PRINT_S("ARITHMETIC")

getstatic             java/lang/System/out Ljava/io/PrintStream;
ldc "ARITHMETIC"
invokevirtual         java/io/PrintStream/println(Ljava/lang/String;)V

; i=32

	ldc	32
	putstatic	sample/i I

; j=i

	getstatic	sample/i I
	putstatic	sample/j I

; i=-2+3*j

	ldc	2
	ineg
	ldc	3
	getstatic	sample/j I
	imul
	iadd
	putstatic	sample/i I

; PRINT(i)

	.limit stack          2
	.limit locals         1
	.line                 6
	getstatic             java/lang/System/out Ljava/io/PrintStream;
	new       java/lang/StringBuilder
	dup
	ldc "Output = "
	invokenonvirtual java/lang/StringBuilder/<init>(Ljava/lang/String;)V
	getstatic	sample/i I
	invokevirtual java/lang/StringBuilder/append(I)Ljava/lang/StringBuilder;
	invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
	invokevirtual         java/io/PrintStream/println(Ljava/lang/String;)V

; PRINT_S("NESTED_IF_STATEMENT")

getstatic             java/lang/System/out Ljava/io/PrintStream;
ldc "NESTED_IF_STATEMENT"
invokevirtual         java/io/PrintStream/println(Ljava/lang/String;)V

; IFi>jTHENIF0<1THENi=1

	getstatic	sample/i I
	getstatic	sample/j I
	if_icmpgt L002
	iconst_0
	goto L003
	L002:
	iconst_1
	L003:
	ifeq L001
	ldc	0
	ldc	1
	if_icmplt L005
	iconst_0
	goto L006
	L005:
	iconst_1
	L006:
	ifeq L004
	ldc	1
	putstatic	sample/i I
	L004:
	L001:

; PRINT(i)

	.limit stack          2
	.limit locals         1
	.line                 6
	getstatic             java/lang/System/out Ljava/io/PrintStream;
	new       java/lang/StringBuilder
	dup
	ldc "Output = "
	invokenonvirtual java/lang/StringBuilder/<init>(Ljava/lang/String;)V
	getstatic	sample/i I
	invokevirtual java/lang/StringBuilder/append(I)Ljava/lang/StringBuilder;
	invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
	invokevirtual         java/io/PrintStream/println(Ljava/lang/String;)V

; PRINT_S("DOUBLE_ARITHMETIC")

getstatic             java/lang/System/out Ljava/io/PrintStream;
ldc "DOUBLE_ARITHMETIC"
invokevirtual         java/io/PrintStream/println(Ljava/lang/String;)V

; alpha=9.3

	ldc	9.3
	putstatic	sample/alpha F

; beta5x=alpha

	getstatic	sample/alpha F
	putstatic	sample/beta5x F

; beta5x=alpha/3.7-alpha*2.88

	getstatic	sample/alpha F
	ldc	3.7
	fdiv
	getstatic	sample/alpha F
	ldc	2.88
	fmul
	fsub
	putstatic	sample/beta5x F

; beta5x=8.45*(alpha+9.12)

	ldc	8.45
	getstatic	sample/alpha F
	ldc	9.12
	fadd
	fmul
	putstatic	sample/beta5x F

; i=0

	ldc	0
	putstatic	sample/i I

; PRINT_S("FOR_LOOP")

getstatic             java/lang/System/out Ljava/io/PrintStream;
ldc "FOR_LOOP"
invokevirtual         java/io/PrintStream/println(Ljava/lang/String;)V

; RANGE(20){i=i+1;PRINT(i);}

.limit stack 20
	ldc	20
putstatic sample/z I
	W007:
	iconst_0
getstatic sample/z I
	if_icmpge	W008

; i=i+1

	getstatic	sample/i I
	ldc	1
	iadd
	putstatic	sample/i I

; PRINT(i)

	.limit stack          2
	.limit locals         1
	.line                 6
	getstatic             java/lang/System/out Ljava/io/PrintStream;
	new       java/lang/StringBuilder
	dup
	ldc "Output = "
	invokenonvirtual java/lang/StringBuilder/<init>(Ljava/lang/String;)V
	getstatic	sample/i I
	invokevirtual java/lang/StringBuilder/append(I)Ljava/lang/StringBuilder;
	invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
	invokevirtual         java/io/PrintStream/println(Ljava/lang/String;)V
ldc -1
getstatic sample/z I
iadd
putstatic sample/z I
	goto W007
	W008:

; i=0

	ldc	0
	putstatic	sample/i I

; PRINT_S("WHILE_LOOP")

getstatic             java/lang/System/out Ljava/io/PrintStream;
ldc "WHILE_LOOP"
invokevirtual         java/io/PrintStream/println(Ljava/lang/String;)V

; WHILE(i<10){i=i+1;PRINT(i);}

.limit stack 4
	W009:
	getstatic	sample/i I
	ldc	10
	if_icmplt W0010
goto W0011
 W0010:

; i=i+1

	getstatic	sample/i I
	ldc	1
	iadd
	putstatic	sample/i I

; PRINT(i)

	.limit stack          2
	.limit locals         1
	.line                 6
	getstatic             java/lang/System/out Ljava/io/PrintStream;
	new       java/lang/StringBuilder
	dup
	ldc "Output = "
	invokenonvirtual java/lang/StringBuilder/<init>(Ljava/lang/String;)V
	getstatic	sample/i I
	invokevirtual java/lang/StringBuilder/append(I)Ljava/lang/StringBuilder;
	invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
	invokevirtual         java/io/PrintStream/println(Ljava/lang/String;)V
	goto W009
	W0011:

; IF(0<1)THENi=5

	ldc	0
	ldc	1
	if_icmplt L0013
	iconst_0
	goto L0014
	L0013:
	iconst_1
	L0014:
	ifeq L0012
	ldc	5
	putstatic	sample/i I
	L0012:

; i=5

	ldc	5
	putstatic	sample/i I

	getstatic     sample/_runTimer LRunTimer;
	invokevirtual RunTimer.printElapsedTime()V

	return

.limit locals 16
.limit stack 16
.end method
