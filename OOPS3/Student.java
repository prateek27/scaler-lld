package OOPS3;

public class Student extends User{

    int batch_id;

    Student(){
        System.out.println("Creating a student");
    }
    Student(String username,String email,int batch_id){
        super(username,email);
        this.batch_id = batch_id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "batch_id=" + batch_id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

