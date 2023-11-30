package OOPS4;

public class Dog extends Canine implements Pet,Pet2{
    //Specific Method
    void greet(){
        System.out.println("Hello from a Dog!");
    }
    void bark(){
        System.out.println("Woof-Woof");
    }
    @Override
    public void eat(){
        System.out.println("Dog is Eating!");
    }

    @Override
    public void beFriendly() {
        System.out.println("I am a friendly dog");
    }

    @Override
    public void play() {
        System.out.println("I like to play, says dog");
    }

    public void play(int x){
        System.out.println("I am playing");
    }

    static void animalsMethod(){
        System.out.println("Inside dog's method");
    }
}
