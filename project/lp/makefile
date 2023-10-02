
test/lptest: lib/liblp.so test/lptest.o
	c++ test/lptest.o lib/liblp.so lib/libantlr4-runtime.so.4.13.1 -o test/lptest

lib/liblp.so: build/gen/CypherLexer.o build/gen/CypherParser.o build/main/lp.o lib/libantlr4-runtime.so.4.13.1
	c++ -shared build/main/*.o build/gen/*.o lib/libantlr4-runtime.so.4.13.1 -o lib/liblp.so

build/gen/CypherLexer.o: src/gen/CypherLexer.cpp inc/CypherLexer.h
	c++ -Iinc -fPIC src/gen/CypherLexer.cpp -c -o build/gen/CypherLexer.o

build/gen/CypherParser.o: src/gen/CypherParser.cpp inc/CypherParser.h
	c++ -Iinc -fPIC src/gen/CypherParser.cpp -c -o build/gen/CypherParser.o

build/main/lp.o: src/main/lp.cpp src/main/lp.h
	c++ -Iinc -fPIC src/main/lp.cpp -c -o build/main/lp.o

test/lptest.o: test/lptest.cpp src/main/lp.h
	c++ -Itest test/lptest.cpp -c -o test/lptest.o


