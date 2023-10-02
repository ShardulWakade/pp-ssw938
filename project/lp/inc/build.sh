#!/usr/bin/bash

set -e 1

c++ -fPIC -I. *.cpp -c 

echo -e "30% done"

cd atn
c++ -fPIC -I.. *.cpp -c 
cd ..

echo -e "60% done"

cd dfa
c++ -fPIC -I.. *.cpp -c
cd ..

echo -e "67% done"

cd internal
c++ -fPIC -I.. *.cpp -c
cd ..

echo -e "70% done"

cd misc
c++ -fPIC -I.. *.cpp -c
cd ..

echo -e "78% done"

cd support
c++ -fPIC -I.. *.cpp -c
cd ..

echo -e "85% done"

cd tree
c++ -fPIC -I.. *.cpp -c

echo -e "90% done"

cd pattern
c++ -fPIC -I../.. *.cpp -c

echo -e "95% done"
cd ..
cd xpath
c++ -fPIC -I../.. *.cpp -c
cd ..
cd ..

echo -e "100% done!"

exit 0

