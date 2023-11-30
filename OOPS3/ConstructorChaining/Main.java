package ConstructorChaining;

public class Main {


    public static void main(String[] args) {
        // C c = new C("Red","Green","Blue");
        // System.out.println(c);
        //B b = new B();
        // System.out.println(c);
        // c.prop1 = "purple"; //direct acess
        // but for init you need super

        B b = new B();
        System.out.println(b.play()); //Method Over-riding

    }
}


