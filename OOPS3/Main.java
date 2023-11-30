package OOPS3;
import java.util.List;
import Doubts.A;

import java.util.ArrayList;

public class Main {
    //UseCase 1
    public static void makePaymentAtAmul(User u){
        System.out.println(u.getUsername() + "is making a payment");
    }

    public static void main(String[] args) {
        Student s = new Student();
 /*       s.username = "prateek27"; //username in inherited
        s.email = "pn@gmail.com"; //inherited
        s.batch_id = 1;       // specific to the student class

        Instructor i = new Instructor("Prateek","pn@gmail.com","linkedIn.com/pn27");
        System.out.println(i);*/

        Student s1 = new Student("Snehal","sn@gmail.com",2);
        Instructor i1 = new Instructor("Prateek","pn@gmail.com","xyz");
        User u1 = new User("Manu","manu87");
        makePaymentAtAmul(s1);
        makePaymentAtAmul(i1);

        // UseCase 2;
        List<User> l = new ArrayList<>();
        l.add(s1);
        l.add(i1);
        l.add(u1);
        //List can contain Students, Instructors, TAs because everyone is a User

        for(User u:l){
            System.out.println(u);
        }

        //Catch
        Instructor i2 = new Instructor("Naman","naman@gmail.com","namanli");
        i2.linkedInProfile = "linkedin/naman28";

        User u3 = new Instructor("Naman","naman@gmail.com","namanli");


        System.out.println(5);
        System.out.println("Hello");

        //Run Time Polymorphsim
        makePaymentAtAmul(s1);



    }


}
