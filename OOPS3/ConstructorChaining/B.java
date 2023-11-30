package ConstructorChaining;

public class B extends A {
    B(){
        System.out.println("Creating B");
    }
    B(String p1,String p2){
        super(p1,p2); //sending params to A
        System.out.println("Parametrised Constructor B");
    }

    int play(){
        int v = super.play(); //call play of A
        System.out.println("B is playing");
        return v*v;
    }

}