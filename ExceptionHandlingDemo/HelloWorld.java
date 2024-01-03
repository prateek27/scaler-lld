package ExceptionHandlingDemo;

public class HelloWorld {



    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int result;
        try{
            result = a/b;
            System.out.println(result);
            //...
            //...
        }
        catch(ArithmeticException e){
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }

        System.out.println("This still got executed!");

    }
}
