package AcessModifiersDemo;

public class Student extends User {
    int marks;

    @Override
    public String toString() {
        return "Student{" +
                "marks=" + marks +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
