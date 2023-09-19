jjtree -OUTPUT_DIRECTORY=out src/compiler/Compiler.jjt &&
javacc -STATIC=true -OUTPUT_DIRECTORY=out out/Compiler.jj &&

cd out &&
javac *.java &&
java Compiler "$@"