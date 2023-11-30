package ConstructorChaining;

public class C extends B {
    String prop3;
    C(){
        System.out.println("Creating C");
    }
    C(String p1, String p2, String p3){
        super(p1,p2); //sending params to B
        this.prop3 = p3; //specific work
    }

    @Override
    public String toString() {
        return "C{" +
                "prop3='" + prop3 + '\'' +
                ", prop1='" + prop1 + '\'' +
                ", prop2='" + prop2 + '\'' +
                '}';
    }
}
