
#antlr4 Pcl2.g4 -visitor

javac Pirate*.java
javac Pirate.java PirateLexer.java PirateParser.java
java Pirate sample.pir

java -jar jasmin.jar Popeye.j
java -cp .:PascalRTL.jar Popeye