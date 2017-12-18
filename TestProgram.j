.class public TestProgram
.super java/lang/Object

.field private static _runTimer LRunTimer;
.field private static _standardIn LPascalTextIn;
.field private static z I

; i,j,k:integer

.field private static i I
.field private static j I
.field private static k I

; realX,realY:real

.field private static realX F
.field private static realY F

; deffunct(n1,n2:integer):integer;s:integer;MAIN{i=n1;PRINT(i);RETURNn2;}

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
.method public static funct(II)I
iload_0
	putstatic	TestProgram/i I
	.limit stack          2
	.limit locals         1
	.line                 6
	getstatic             java/lang/System/out Ljava/io/PrintStream;
	new       java/lang/StringBuilder
	dup
	ldc ""
	invokenonvirtual java/lang/StringBuilder/<init>(Ljava/lang/String;)V
	getstatic	TestProgram/i I
	invokevirtual java/lang/StringBuilder/append(I)Ljava/lang/StringBuilder;
	invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
	invokevirtual         java/io/PrintStream/println(Ljava/lang/String;)V
iload_1
ireturn
.limit locals 5
.limit stack 5
.end method

.method public static main([Ljava/lang/String;)V

	new RunTimer
	dup
	invokenonvirtual RunTimer/<init>()V
	putstatic        TestProgram/_runTimer LRunTimer;
	new PascalTextIn
	dup
	invokenonvirtual PascalTextIn/<init>()V
	putstatic        TestProgram/_standardIn LPascalTextIn;

; PRINT_S("\n\nINTEGER ARITHMETIC\n-----------")

getstatic             java/lang/System/out Ljava/io/PrintStream;
ldc "\n\nINTEGER ARITHMETIC\n-----------"
invokevirtual         java/io/PrintStream/println(Ljava/lang/String;)V

; PRINT_S("4 * j + 8 / 2 =")

getstatic             java/lang/System/out Ljava/io/PrintStream;
ldc "4 * j + 8 / 2 ="
invokevirtual         java/io/PrintStream/println(Ljava/lang/String;)V

; i=28

	ldc	28
	putstatic	TestProgram/i I

; j=i

	getstatic	TestProgram/i I
	putstatic	TestProgram/j I

; i=4*j+8/2

	ldc	4
	getstatic	TestProgram/j I
	imul
	ldc	8
	ldc	2
	idiv
	iadd
	putstatic	TestProgram/i I

; PRINT(i)

	.limit stack          2
	.limit locals         1
	.line                 6
	getstatic             java/lang/System/out Ljava/io/PrintStream;
	new       java/lang/StringBuilder
	dup
	ldc ""
	invokenonvirtual java/lang/StringBuilder/<init>(Ljava/lang/String;)V
	getstatic	TestProgram/i I
	invokevirtual java/lang/StringBuilder/append(I)Ljava/lang/StringBuilder;
	invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
	invokevirtual         java/io/PrintStream/println(Ljava/lang/String;)V

; PRINT_S("\ni - 200 =")

getstatic             java/lang/System/out Ljava/io/PrintStream;
ldc "\ni - 200 ="
invokevirtual         java/io/PrintStream/println(Ljava/lang/String;)V

; i=i-200

	getstatic	TestProgram/i I
	ldc	200
	isub
	putstatic	TestProgram/i I

; PRINT(i)

	.limit stack          2
	.limit locals         1
	.line                 6
	getstatic             java/lang/System/out Ljava/io/PrintStream;
	new       java/lang/StringBuilder
	dup
	ldc ""
	invokenonvirtual java/lang/StringBuilder/<init>(Ljava/lang/String;)V
	getstatic	TestProgram/i I
	invokevirtual java/lang/StringBuilder/append(I)Ljava/lang/StringBuilder;
	invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
	invokevirtual         java/io/PrintStream/println(Ljava/lang/String;)V

; PRINT_S("\n\n IF/ELSE STATEMENT\n-------------------")

getstatic             java/lang/System/out Ljava/io/PrintStream;
ldc "\n\n IF/ELSE STATEMENT\n-------------------"
invokevirtual         java/io/PrintStream/println(Ljava/lang/String;)V

; PRINT_S(" i > j ? 0 : 1")

getstatic             java/lang/System/out Ljava/io/PrintStream;
ldc " i > j ? 0 : 1"
invokevirtual         java/io/PrintStream/println(Ljava/lang/String;)V

; IFi>jTHENk=0ELSEk=1

	getstatic	TestProgram/i I
	getstatic	TestProgram/j I
	if_icmpgt L002
	iconst_0
	goto L003
	L002:
	iconst_1
	L003:
	ifeq L001
	ldc	0
	putstatic	TestProgram/k I
	goto L004
	L001:
	ldc	1
	putstatic	TestProgram/k I
	L004:

; PRINT(k)

	.limit stack          2
	.limit locals         1
	.line                 6
	getstatic             java/lang/System/out Ljava/io/PrintStream;
	new       java/lang/StringBuilder
	dup
	ldc ""
	invokenonvirtual java/lang/StringBuilder/<init>(Ljava/lang/String;)V
	getstatic	TestProgram/k I
	invokevirtual java/lang/StringBuilder/append(I)Ljava/lang/StringBuilder;
	invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
	invokevirtual         java/io/PrintStream/println(Ljava/lang/String;)V

; PRINT_S("\n i < j ? 0 : 1")

getstatic             java/lang/System/out Ljava/io/PrintStream;
ldc "\n i < j ? 0 : 1"
invokevirtual         java/io/PrintStream/println(Ljava/lang/String;)V

; IFi<jTHENk=0ELSEk=1

	getstatic	TestProgram/i I
	getstatic	TestProgram/j I
	if_icmplt L006
	iconst_0
	goto L007
	L006:
	iconst_1
	L007:
	ifeq L005
	ldc	0
	putstatic	TestProgram/k I
	goto L008
	L005:
	ldc	1
	putstatic	TestProgram/k I
	L008:

; PRINT(k)

	.limit stack          2
	.limit locals         1
	.line                 6
	getstatic             java/lang/System/out Ljava/io/PrintStream;
	new       java/lang/StringBuilder
	dup
	ldc ""
	invokenonvirtual java/lang/StringBuilder/<init>(Ljava/lang/String;)V
	getstatic	TestProgram/k I
	invokevirtual java/lang/StringBuilder/append(I)Ljava/lang/StringBuilder;
	invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
	invokevirtual         java/io/PrintStream/println(Ljava/lang/String;)V

; PRINT_S("\n\nDOUBLE ARITHMETIC\n------------------")

getstatic             java/lang/System/out Ljava/io/PrintStream;
ldc "\n\nDOUBLE ARITHMETIC\n------------------"
invokevirtual         java/io/PrintStream/println(Ljava/lang/String;)V

; PRINT_S("realY / 5.6 + realX * 5.11 = ")

getstatic             java/lang/System/out Ljava/io/PrintStream;
ldc "realY / 5.6 + realX * 5.11 = "
invokevirtual         java/io/PrintStream/println(Ljava/lang/String;)V

; realX=3.1

	ldc	3.1
	putstatic	TestProgram/realX F

; realY=realX

	getstatic	TestProgram/realX F
	putstatic	TestProgram/realY F

; realY=realY/5.6+realX*5.11

	getstatic	TestProgram/realY F
	ldc	5.6
	fdiv
	getstatic	TestProgram/realX F
	ldc	5.11
	fmul
	fadd
	putstatic	TestProgram/realY F

; PRINT_D(realY)

	.limit stack          2
	.limit locals         1
	.line                 6
	getstatic             java/lang/System/out Ljava/io/PrintStream;
	new       java/lang/StringBuilder
	dup
	ldc ""
	invokenonvirtual java/lang/StringBuilder/<init>(Ljava/lang/String;)V
	getstatic	TestProgram/realY F
	invokevirtual java/lang/StringBuilder/append(F)Ljava/lang/StringBuilder;
	invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
	invokevirtual         java/io/PrintStream/println(Ljava/lang/String;)V

; i=0

	ldc	0
	putstatic	TestProgram/i I

; PRINT_S("\n\nWHILE LOOP\n-----------")

getstatic             java/lang/System/out Ljava/io/PrintStream;
ldc "\n\nWHILE LOOP\n-----------"
invokevirtual         java/io/PrintStream/println(Ljava/lang/String;)V

; PRINT_S("WHILE i<10 PRINT(i)")

getstatic             java/lang/System/out Ljava/io/PrintStream;
ldc "WHILE i<10 PRINT(i)"
invokevirtual         java/io/PrintStream/println(Ljava/lang/String;)V

; WHILE(i<10){PRINT(i);i=i+1;}

.limit stack 4
	W009:
	getstatic	TestProgram/i I
	ldc	10
	if_icmplt W0010
goto W0011
 W0010:

; PRINT(i)

	.limit stack          2
	.limit locals         1
	.line                 6
	getstatic             java/lang/System/out Ljava/io/PrintStream;
	new       java/lang/StringBuilder
	dup
	ldc ""
	invokenonvirtual java/lang/StringBuilder/<init>(Ljava/lang/String;)V
	getstatic	TestProgram/i I
	invokevirtual java/lang/StringBuilder/append(I)Ljava/lang/StringBuilder;
	invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
	invokevirtual         java/io/PrintStream/println(Ljava/lang/String;)V

; i=i+1

	getstatic	TestProgram/i I
	ldc	1
	iadd
	putstatic	TestProgram/i I
	goto W009
	W0011:

; realX=500.0

	ldc	500.0
	putstatic	TestProgram/realX F

; PRINT_S("\n\nRANGE LOOP\n-----------")

getstatic             java/lang/System/out Ljava/io/PrintStream;
ldc "\n\nRANGE LOOP\n-----------"
invokevirtual         java/io/PrintStream/println(Ljava/lang/String;)V

; PRINT_S("LOOP[0..20] PRINT(realX/2.0)")

getstatic             java/lang/System/out Ljava/io/PrintStream;
ldc "LOOP[0..20] PRINT(realX/2.0)"
invokevirtual         java/io/PrintStream/println(Ljava/lang/String;)V

; RANGE(20){realX=realX/2.0;PRINT_D(realX);}

.limit stack 20
	ldc	20
putstatic TestProgram/z I
	W0012:
	iconst_0
getstatic TestProgram/z I
	if_icmpge	W0013

; realX=realX/2.0

	getstatic	TestProgram/realX F
	ldc	2.0
	fdiv
	putstatic	TestProgram/realX F

; PRINT_D(realX)

	.limit stack          2
	.limit locals         1
	.line                 6
	getstatic             java/lang/System/out Ljava/io/PrintStream;
	new       java/lang/StringBuilder
	dup
	ldc ""
	invokenonvirtual java/lang/StringBuilder/<init>(Ljava/lang/String;)V
	getstatic	TestProgram/realX F
	invokevirtual java/lang/StringBuilder/append(F)Ljava/lang/StringBuilder;
	invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
	invokevirtual         java/io/PrintStream/println(Ljava/lang/String;)V
ldc -1
getstatic TestProgram/z I
iadd
putstatic TestProgram/z I
	goto W0012
	W0013:

; i=5

	ldc	5
	putstatic	TestProgram/i I

; PRINT_S("\n\nFUNCTION CALL\n--------------")

getstatic             java/lang/System/out Ljava/io/PrintStream;
ldc "\n\nFUNCTION CALL\n--------------"
invokevirtual         java/io/PrintStream/println(Ljava/lang/String;)V

; PRINT_S("Pass 100,200 \nGlobal_i = %0")

getstatic             java/lang/System/out Ljava/io/PrintStream;
ldc "Pass 100,200 \nGlobal_i = %0"
invokevirtual         java/io/PrintStream/println(Ljava/lang/String;)V

; j<=CALLfunct(100,200)

	ldc	100
	ldc	200
invokestatic TestProgram/funct(II)I
	putstatic	TestProgram/j I

; PRINT_S("\nReturn %1")

getstatic             java/lang/System/out Ljava/io/PrintStream;
ldc "\nReturn %1"
invokevirtual         java/io/PrintStream/println(Ljava/lang/String;)V

; PRINT(j)

	.limit stack          2
	.limit locals         1
	.line                 6
	getstatic             java/lang/System/out Ljava/io/PrintStream;
	new       java/lang/StringBuilder
	dup
	ldc ""
	invokenonvirtual java/lang/StringBuilder/<init>(Ljava/lang/String;)V
	getstatic	TestProgram/j I
	invokevirtual java/lang/StringBuilder/append(I)Ljava/lang/StringBuilder;
	invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
	invokevirtual         java/io/PrintStream/println(Ljava/lang/String;)V

	getstatic     TestProgram/_runTimer LRunTimer;
	invokevirtual RunTimer.printElapsedTime()V

	return

.limit locals 16
.limit stack 16
.end method
