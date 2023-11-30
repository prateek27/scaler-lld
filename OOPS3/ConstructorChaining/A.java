package ConstructorChaining;

public class A {
    String prop1;
    String prop2;
    A(){
        System.out.println("Creating A");
    }
    A(String p1,String p2){
        System.out.println("Parametrised Constructor A");
        this.prop1 = p1;
        this.prop2 = p2;
    }

    int play(){
        System.out.println("A is playing");
        return 5;
    }
}
