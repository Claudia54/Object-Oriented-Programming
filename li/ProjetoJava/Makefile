JAVAC = javac
CLASS_FILES = view/*.class model/*.class loaders/*.class
Default: $(CLASS_FILES)

%.class: %.java
	$(JAVAC) -d out *.java

clean: 
	rm -r out

run: Programa.class
	java -cp out Programa
	