package AdvJava.Generics;

public class Pair {
    private Object first;
    private Object second;

    Pair(Object first,Object second){
        this.first = first;
        this.second = second;
    }

    public Object getFirst() {
        return first;
    }

    public Object getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }


}
