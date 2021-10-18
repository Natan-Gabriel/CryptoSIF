# This code is an adapted form of the code presented here: https://www2.in.tum.de/repos/cup/develop/testgrammars/c/makeTest.sh
rm Parser.java Lexer.java
rm *.class
jflex minijava.jflex
java -jar ~/Desktop/facultate/Licenta/cup/lib/java-cup-11b.jar -locations -interface -parser Parser minijava.cup
#javac -cp ~/Desktop/facultate/Licenta/cup/lib/java-cup-11b-runtime.jar:. *.java
#java -cp ~/Desktop/facultate/Licenta/cup/lib/java-cup-11b-runtime.jar:. Parser simple.minijava simple.xml /
