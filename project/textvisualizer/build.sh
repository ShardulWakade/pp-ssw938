
SCRIPT_DIR=$( cd -- "$( dirname -- "${BASH_SOURCE[0]}" )" &> /dev/null && pwd )

cd $SCRIPT_DIR

javac -source 11 -target 11 -cp .:./json-simple-1.1.1.jar ./main/*.java ./dbtype/*.java

