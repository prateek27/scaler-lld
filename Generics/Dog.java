package AdvJava.Generics;

public class Dog extends Animal{

    String name;
    Dog(String name,String animalType, int wt, int ht) {
        super(animalType, wt, ht);
        this.name = name;
    }

    Dog(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
