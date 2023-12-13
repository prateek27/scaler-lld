package AdvJava.Generics;

import java.nio.channels.Pipe;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //new Object();

        Animal a = new Animal("Mammal",10,20);
        Object o = a;
        System.out.println(a.toString());

        a.fun();
        // o.fun();

        // no need to create multiple pair classes for different data-types
        Pair p1 = new Pair(1,"Hello");
        Pair p2 = new Pair(10,20);
        Pair p3 = new Pair("Dog",a);

/*        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);*/

        // Problem
/*        List<Pair> l = List.of(p1,p2,p3);

        for(Pair p:l){
            Animal o1 = (Animal)p.getSecond();
            o1.fun();

            String first = (String)p.getFirst();
            System.out.println(first);
        }*/

/*        ThePair<Integer, Integer> p11 = new ThePair<Integer,Integer>(10,20);
        // p11.getSecond().fun();
        System.out.println(p11);

        ThePair<Integer, Animal> p22 = new ThePair<Integer,Animal>(10,a);
        p22.getSecond().fun();
        System.out.println(p22);*/

        ThePair<Integer,Animal> p = new ThePair<>(10,new Animal());
        List<Animal> l = List.of(new Animal(),new Animal(),new Animal());
        //System.out.println(l);
        p.doSomething(l); //list of animals

        List<Dog> ld = List.of(new Dog("Lido"),new Dog("Fido"),new Dog("Tido"));
        p.doSomething(ld); //list of dogs

        //Raw Types (U,V will be treated as object datatype by default)
        ThePair px = new ThePair<>(10,new Animal());
        ThePair py = new ThePair<>(21,"Hello");
        // to support backward compatibility (before Java 5)
        //Java Generics
        //1. Support multiple datatypes
        //2. Compile Type Safety




    }
}
