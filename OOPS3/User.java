package OOPS3;

public class User {
    String username;
    String email;

    User(){
        System.out.println("Creating a User");
    }

    User(String username,String email){
        this.username = username;
        this.email = email;
    }

    String getUsername(){
        return username;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
};
