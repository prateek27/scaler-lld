package AcessModifiersDemo;

public class Main {
    public static void main(String[] args) {
        User u1 = new User(); //call default constructor
        System.out.println(u1);

        u1.id = 1;
        u1.name = "Snehal";

        User u2 = new User(7,"Prateek");
        System.out.println(u2);

        //Copy Constructor
        User u3 = new User(u2);
        u3.name = "Rahul";
        System.out.println(u3);
        System.out.println(u2);

        Student s1 = new Student();
        s1.id = 2;
        s1.name = "Rohan";
        s1.marks = 60;

        System.out.println(u1);
        System.out.println(s1);
    }
}
