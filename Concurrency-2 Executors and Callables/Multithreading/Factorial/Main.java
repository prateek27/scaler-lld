package Multithreading.Factorial;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    // Task calculate Factorial of List of Numbers
    public static void main(String[] args) throws InterruptedException {

        List<Long> inputNumbers = Arrays.asList(100000000L, 3435L, 35435L, 2324L, 4656L, 23L, 5556L);
        List<FactorialThread> threads = new ArrayList<>();
        for(long number:inputNumbers){
            FactorialThread t = new FactorialThread(number);
            //System.out.println(t.getState());
            threads.add(t);
        }

        for(Thread t:threads){
            t.start();
        }

        for(Thread t:threads){
            t.join(2000);
        }

        //--------------------//
        for(int i=0;i<inputNumbers.size();i++){
            FactorialThread t = threads.get(i); //ith Thread Object
            if(t.isFinished()){
                System.out.println(t.getResult());
            }
            else{
                System.out.println("Couldn't complete calc in 2s");
            }
        }

        //Let's wait for 2 seconds
        // Thread.sleep(10000);

        //wait for thread to complete
        /*factorialThread.join(2000);

        if(factorialThread.isFinished()){
            System.out.println(factorialThread.getResult());
        }
        else{
            System.out.println("Calc took too long to finish");
        }*/

        System.out.println("Main is completed!");
    }

}
