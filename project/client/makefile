
Client: bin/Client.o lib/liblp.so lib/libantlr4-runtime.so
	c++ bin/Client.o lib/liblp.so lib/libantlr4-runtime.so -o Client

lib/liblp.so:
	cp ../lp/lib/liblp.so lib

lib/libantlr4-runtime.so:
	cp ../lp/lib/libantlr4-runtime.so lib

bin/Client.o: src/Client.cpp inc/lp.h
	c++ -Iinc src/Client.cpp -c -o bin/Client.o
