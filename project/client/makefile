Client: bin/Client.o bin/SharedState.o bin/Directive.o bin/Messages.o bin/PrintHelper.o bin/ReceivableDirective.o bin/SpawnChild.o lib/liblp.so lib/libantlr4-runtime.so
	c++ bin/Client.o bin/SharedState.o bin/Directive.o bin/Messages.o bin/PrintHelper.o bin/ReceivableDirective.o bin/SpawnChild.o lib/liblp.so lib/libantlr4-runtime.so -o Client

Adapt: adapter/*
	./createAdapt.sh

lib/liblp.so:
	cp ../lp/lib/liblp.so lib

lib/libantlr4-runtime.so:
	cp ../lp/lib/libantlr4-runtime.so lib

bin/Client.o: src/Client.cpp inc/*
	c++ -Iinc src/Client.cpp -c -o bin/Client.o

bin/Directive.o: src/Directive.cpp inc/*
	c++ -Iinc src/Directive.cpp -c -o bin/Directive.o

bin/Messages.o: src/Messages.cpp inc/*
	c++ -Iinc src/Messages.cpp -c -o bin/Messages.o

bin/PrintHelper.o: src/PrintHelper.cpp inc/*
	c++ -Iinc src/PrintHelper.cpp -c -o bin/PrintHelper.o

bin/ReceivableDirective.o: src/ReceivableDirective.cpp inc/*
	c++ -Iinc src/ReceivableDirective.cpp -c -o bin/ReceivableDirective.o

bin/SpawnChild.o: src/SpawnChild.cpp inc/*
	c++ -Iinc src/SpawnChild.cpp -c -o bin/SpawnChild.o

bin/SharedState.o: src/SharedState.cpp inc/*
	c++ -Iinc src/SharedState.cpp -c -o bin/SharedState.o
