# paint
Compile
javac .\src\main\java\pbwi\paint\*.java -d .\ -encoding UTF8
Create jar
jar cfm paint.jar .\META-INF\MANIFEST.MF .\pbwi\*
Run jar
java -jar .\paint.jar

