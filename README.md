To run our compiler run 

antlr4 Business.g4 -visitor -no-listener

to generate class files for visitor then run

./runCompiler.sh <program name>

a script that compiles the generated java files and generates and runs the jasmin code.