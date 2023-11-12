Client: bin/Client.o bin/PrintHelper.o bin/SpawnChild.o lib/liblp.so lib/libantlr4-runtime.so
	c++ bin/Client.o bin/PrintHelper.o bin/SpawnChild.o lib/liblp.so lib/libantlr4-runtime.so -o Client

lib/liblp.so:
	cp ../lp/lib/liblp.so lib

lib/libantlr4-runtime.so:
	cp ../lp/lib/libantlr4-runtime.so lib

bin/Client.o: src/Client.cpp inc/lp.h inc/PrintHelper.h inc/SpawnChild.h
	c++ -Iinc src/Client.cpp -c -o bin/Client.o

bin/PrintHelper.o: src/PrintHelper.cpp inc/PrintHelper.h
	c++ -Iinc src/PrintHelper.cpp -c -o bin/PrintHelper.o

bin/SpawnChild.o: src/SpawnChild.cpp inc/SpawnChild.h
	c++ -Iinc src/SpawnChild.cpp -c -o bin/SpawnChild.o
