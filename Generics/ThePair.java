package AdvJava.Generics;

import java.util.List;

public class ThePair<T,U> {
    T first;
    U second;


    public ThePair(T first,U second){
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "ThePair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }

    void doSomething(List<? extends U> l){
        System.out.println(l);
    }
}
