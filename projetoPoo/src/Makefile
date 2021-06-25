JAVAC = javac
CLASS_FILES = ./*.class
# view/*.class model/Businesses/*.class model/Reviews/*.class model/Users/*.class loaders/*.class

#Default: $(CLASS_FILES)

%.class: %.java
	$(JAVAC) -d out *.java

clean: 
	rm -r out

run: Programa.class
	java -cp out Programa
