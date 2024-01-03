package ExceptionHandlingDemo;

public class MultipleExceptionsDemo {
    public static void main(String[] args) {
        try{
            int arr[] = new int[10];
            arr[10] = 5;
        }
        catch(Exception e1){
            System.out.println(e1.getMessage());
        }

    }
}
