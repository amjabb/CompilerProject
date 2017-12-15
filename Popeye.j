.class public Popeye
.super java/lang/Object

.field private static _runTimer LRunTimer;
.field private static _standardIn LPascalTextIn;

; tom:integer

.field private static tom I

.method public <init>()V

	aload_0
	invokenonvirtual    java/lang/Object/<init>()V
	return

.limit locals 1
.limit stack 1
.end method

.method public static main([Ljava/lang/String;)V

	new RunTimer
	dup
	invokenonvirtual RunTimer/<init>()V
	putstatic        Popeye/_runTimer LRunTimer;
	new PascalTextIn
	dup
	invokenonvirtual PascalTextIn/<init>()V
	putstatic        Popeye/_standardIn LPascalTextIn;

; tomduffle4

	ldc	4
	putstatic	Popeye/tom I

; feedTheFish('saraiscool')

	.limit stack          2
	.limit locals         1
	.line                 6
	getstatic             java/lang/System/out Ljava/io/PrintStream;
	ldc                   "'saraiscool'"
	invokevirtual         java/io/PrintStream/println(Ljava/lang/String;)V
	.line                 8
	return
	.throws               java/lang/Exception

	getstatic     Popeye/_runTimer LRunTimer;
	invokevirtual RunTimer.printElapsedTime()V

	return

.limit locals 16
.limit stack 16
.end method
