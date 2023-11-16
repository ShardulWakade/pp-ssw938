package dbtype;

public class CorruptJSONException extends RuntimeException {
    public CorruptJSONException(String message){
        super(message);
    }

    public CorruptJSONException() {
        super();
    }

    public static void throwIf(boolean b){
        if(b){
            throw new CorruptJSONException();
        }
    }

    public static void throwIf(boolean b, String message){
        if(b){
            throw new CorruptJSONException(message);
        }
    }
}
