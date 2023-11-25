public class Student {
    int id;
    String name;

    //Constructor
    Student(int id,String name){
        this.id = id;
        this.name = name;
    }

    void display(){
        System.out.println(id);
        System.out.println(name);
    }
}
