package AdvJava.Generics;

public class Animal {
    String type;
    int wt;
    int ht;

    Animal(){

    }

    Animal(String animalType,int wt,int ht){
        this.type = animalType;
        this.wt = wt;
        this.ht = ht;
    }

    public void fun(){
        System.out.println("Animal is having fun!");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", wt=" + wt +
                ", ht=" + ht +
                '}';
    }
}
