# testslick

## etape 1

windows: set MAVEN_OPTS="-Djava.library.path=target/natives"   
   unix: export MAVEN_OPTS=-Djava.library.path=target/natives

## etape 2

mvn compile exec:java -Dexec.mainClass=fr.licornesduswag.testslick.TestGame
