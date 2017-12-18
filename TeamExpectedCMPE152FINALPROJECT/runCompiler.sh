
javac Business*.java
javac Business.java BusinessLexer.java BusinessParser.java
java Business $1.biz

java -jar jasmin.jar $1.j
java -cp .:PascalRTL.jar $1