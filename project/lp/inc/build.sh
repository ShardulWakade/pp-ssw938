#!/usr/bin/bash

set -e 1

c++ -fPIC -I. *.cpp -c 

echo -e "\n10% done\n"

cd atn
c++ -fPIC -I.. *.cpp -c 
cd ..

echo -e "\n24% done\n"

cd dfa
c++ -fPIC -I.. *.cpp -c
cd ..

echo -e "\n37% done\n"

cd internal
c++ -fPIC -I.. *.cpp -c
cd ..

echo -e "\n60% done\n"

cd misc
c++ -fPIC -I.. *.cpp -c
cd ..

echo -e "\n70% done\n"

cd support
c++ -fPIC -I.. *.cpp -c
cd ..

echo -e "\n85% done\n"

cd tree
c++ -fPIC -I.. *.cpp -c

echo -e "\n90% done\n"

cd pattern
c++ -fPIC -I../.. *.cpp -c

echo -e "\n95% done\n"
cd ..
cd xpath
c++ -fPIC -I../.. *.cpp -c
cd ..
cd ..

exit 0

