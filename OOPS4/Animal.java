package OOPS4;

public abstract class Animal {

    static void animalsMethod(){
        System.out.println("inside animals method");
    }
    //Concrete Method
    void greet(){
        System.out.println("Hi");
    }

    public abstract void eat();

    public void play(){
        System.out.println("animal is playing");
    }

}
