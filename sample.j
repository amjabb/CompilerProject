.class public sample
.super java/lang/Object

.field private static _runTimer LRunTimer;
.field private static _standardIn LPascalTextIn;

; i,j,k:integer

.field private static i I
.field private static j I
.field private static k I

; alpha,beta5x:real

.field private static alpha F
.field private static beta5x F

; FUNCTIONadder(n1,n2:integer):integer;VARs:integer;BEGINi:=1;RETURNEND


.method public <init>()V

	aload_0
	invokenonvirtual    java/lang/Object/<init>()V
	return

.limit locals 1
.limit stack 1
.end method
.method public static adder(II)I

; i:=1

	ldc	1
	putstatic	sample/i I

; RETURN

getstatic    sample/i I
ireturn
.limit locals 5
.limit stack 2
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

; i:=32

	ldc	32
	putstatic	sample/i I

; j:=i

	getstatic	sample/i I
	putstatic	sample/j I

; i:=-2+3*j

	ldc	2
	ineg
	ldc	3
	getstatic	sample/j I
	imul
	iadd
	putstatic	sample/i I

; IFi>jTHENi:=1

	getstatic	sample/i I
	getstatic	sample/j I
	if_icmpgt L002
	iconst_0
	goto L003
	L002:
	iconst_1
	L003:
	ifeq L001
	ldc	1
	putstatic	sample/i I
	L001:

; alpha:=9.3

	ldc	9.3
	putstatic	sample/alpha F

; beta5x:=alpha

	getstatic	sample/alpha F
	putstatic	sample/beta5x F

; beta5x:=alpha/3.7-alpha*2.88

	getstatic	sample/alpha F
	ldc	3.7
	fdiv
	getstatic	sample/alpha F
	ldc	2.88
	fmul
	fsub
	putstatic	sample/beta5x F

; beta5x:=8.45*(alpha+9.12)

	ldc	8.45
	getstatic	sample/alpha F
	ldc	9.12
	fadd
	fmul
	putstatic	sample/beta5x F

; WHILEi<10DOi:=i+1

	W001:
	getstatic	sample/i I
	ldc	10
	if_icmplt W002
	iconst_0
	goto W003
	W002:

; i:=i+1

	getstatic	sample/i I
	ldc	1
	iadd
	putstatic	sample/i I
	goto W001
	W003:

; IF(0<1)THENi:=5

	ldc	0
	ldc	1
	if_icmplt L005
	iconst_0
	goto L006
	L005:
	iconst_1
	L006:
	ifeq L004
	ldc	5
	putstatic	sample/i I
	L004:

; CALLadder(100,200)

bipush 100
sipush 200
invokestatic sample/adder(II)I

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
	.line                 8
	return
	.throws               java/lang/Exception

	getstatic     sample/_runTimer LRunTimer;
	invokevirtual RunTimer.printElapsedTime()V

	return

.limit locals 16
.limit stack 16
.end method
