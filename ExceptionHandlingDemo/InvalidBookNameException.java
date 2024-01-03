package ExceptionHandlingDemo;

public class InvalidBookNameException extends Exception {
    public InvalidBookNameException(String str){
        super(str);
    }
    //...any other methods specific to your exception object ....
}
