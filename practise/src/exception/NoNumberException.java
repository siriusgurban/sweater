package exception;

public class NoNumberException extends Exception{

    public int code;



    @Override
    public String toString() {
        return "NoNumberException istisnasi";
    }

}
