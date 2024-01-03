package ExceptionHandlingDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileHandingException {
    public static void findFile(String name) throws IOException {

        // code that may generate IOException
        File newFile = new File(name);
        FileInputStream stream = new FileInputStream(newFile);
    }

    public static void main(String[] args)  {
        try{
            findFile("abc.txt");
        }
        catch (IOException e){
            System.out.println(e);
        }

    }

}
