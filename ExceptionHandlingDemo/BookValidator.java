package ExceptionHandlingDemo;

public class BookValidator {
    static void validate(String bookname) throws InvalidBookNameException {
        if(!bookname.startsWith("Scaler")){
            throw new InvalidBookNameException("Book name does't start with Scaler");
        }
        else{
            System.out.println("Book created!" + bookname);
        }
    }

    public static void main(String[] args) throws RuntimeException {
        try {
            validate("ScalerJava");
            validate("SST");

        } catch (InvalidBookNameException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException();
        }
        finally {
            //release memory resources, close dB connection, close some finally!
            System.out.println("Always Executed!");
        }
        System.out.println("Main");
    }
}
