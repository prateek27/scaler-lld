package OOPS3;
import java.util.List;

public class Instructor extends User{
    String linkedInProfile;
    List<String> subjects;

    Instructor(String username,String email,String linkedInUrl){
        // this.username = username;
        // this.email = email;
        super(username, email); //super should be the first line in the constructor
        this.linkedInProfile = linkedInUrl;

    }

    @Override
    public String toString() {
        return "Instructor{" +
                "linkedInProfile='" + linkedInProfile + '\'' +
                ", subjects=" + subjects +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
