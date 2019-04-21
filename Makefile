JAVAC = javac
JVM = java
JAVADOC = javadoc
MKBIN=mkdir -p bin
JAVAC_FLAGS = -g -d 'bin/'
JAVAC_CP = -cp
MAINSRC = src/main/java/
TESTSRC = src/test/java/
LIB = 'lib/junit-4.12.jar;lib/hamcrest-core-1.3.jar;src/main/java'
PKGSRC = pdinamica/
TARGET = bin
MAIN = pdinamica.MainApp
MAINTEST = pdinamica.TestRunner

.SUFFIXES : .class .java

all: 
	$(MKBIN)
	$(JAVAC) $(JAVAC_FLAGS) $(MAINSRC)$(PKGSRC)*

test:
	$(JAVAC) $(JAVAC_FLAGS) $(JAVAC_CP) $(LIB) $(TESTSRC)$(PKGSRC)*

clean:
	rm -r $(TARGET) 

run:
	$(JVM) $(JAVAC_CP) $(TARGET) $(MAIN)

run_test: 
	$(JVM) $(JAVAC_CP) './bin;'$(LIB) $(MAINTEST)

.PHONY: all test clean run run_test