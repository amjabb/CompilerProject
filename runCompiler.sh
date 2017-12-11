
#antlr4 Pcl2.g4 -visitor

javac Pcl2*.java
javac Pcl2.java Pcl2Lexer.java Pcl2Parser.java
java Pcl2 sample.pas

java -jar jasmin.jar sample.j
java -cp .:PascalRTL.jar sample