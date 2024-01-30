package konstruktuor;
import java.util.Scanner;
public class User {
    private String username;
    private String password;
    
    public User(){
        this.username = username;
        this.password = password;
    }
    
    public void setId(String username, String password){
        this.username = username;
        this.password = password;
    }
    
    public String getUsername(){
        return this.username;
    }
    
    public String getPassword(){
        return this.password;
    }
}
