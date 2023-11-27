package AnotherPackage;
import AcessModifiersDemo.User;

public class Instructor extends User{
    public static void main(String[] args) {
        Instructor i = new Instructor();
        i.id = 5; //id is protected data member
    }
}
