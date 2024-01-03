package ExceptionHandlingDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class IteratorsDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.addAll(List.of(10,20,30,40,50,60));

        Iterator<Integer> it = arr.iterator();

        System.out.println("Current Element " + it.next());
        it.remove();

        // it.forEachRemaining(System.out::println);
        it.forEachRemaining(x-> System.out.println(x));

        // Treeset
        TreeSet<Integer> s = new TreeSet<>();
        s.addAll(List.of(10,20,5,6,7,3,4,8));

        System.out.println("Treeset");
        //Safe - Iterator based code
        Iterator<Integer> tit = s.iterator();
        while(tit.hasNext()){
            int element = tit.next();
            if(element==5){
                tit.remove();
            }
            else{
                System.out.println(element);
            }
        }
        //Throw Concurrent modification exception
        System.out.println("Treeset-2");
        for(Integer x:s){
            if(x==7){
                s.remove(Integer.valueOf(x));
            }
            System.out.println(x);
        }
    }
}
