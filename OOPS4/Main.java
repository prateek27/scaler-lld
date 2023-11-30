package OOPS4;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        Dog d = new Dog();
        Animal a1 = new Dog();
        Animal a2 = new Hippo();
        a1.greet();
        a2.greet();
        d.greet();
        d.bark();
        a1.greet(); //RunTime Polymorphism, Dynamic Binding
        a2.eat();
        a1.eat();
        d.beFriendly();
        //If static methods are redefined by a derived class,
        // then it is not Method Overriding but Method Hiding.
        a1.animalsMethod(); //Binding of static methods happens at compile time , here a1 call animals methods even if a1 pionts to dog.
        d.animalsMethod(); //call dogs method

 /*       List<Animal> list  = new ArrayList<>();
        list.add(a1);
        list.add(a2);*/

    }
}
