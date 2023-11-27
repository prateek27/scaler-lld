package AcessModifiersDemo;

public class User {
    protected int id;
    String name;

    public User(){

    }
    //Parametrised Constructor
    public User(int id,String name){
        this.id = id;
        this.name = name;
    }

    public User(User X){
        this.id = X.id;
        this.name = X.name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
