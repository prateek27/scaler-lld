package ExceptionHandlingDemo;

import java.io.FileNotFoundException;

public class TwoHelloWorld {
    public static void doSomething() throws ArithmeticException{
        throw new ArithmeticException("Wrong Arithmetic!");
    }
    public static void main(String[] args){
        try{
            doSomething();
        }
        catch(ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
