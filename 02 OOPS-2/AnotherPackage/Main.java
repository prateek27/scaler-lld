package AnotherPackage;

public class Main {
    public static void main(String[] args) {
       // new Instructor();
        //i1.id = 5; //id is protected, can be acessed by Main which is not a sublass of User class

        Test t1 = new Test(6,"Test1");
        Test t2 = new Test(t1);

        t2.n = 7;
        t2.name = "Test2";
        t2.arr[0] = 56;

        System.out.println(t1);
        System.out.println(t2);

    }
}
