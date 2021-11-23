
import java.util.Scanner;

public class Login extends Validation {
    
    
   public String userName,password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
    public  void validate(DataBAse db){
Scanner sc =new Scanner(System.in);
   
         System.out.println("Enter Username");
        userName= sc.next();
       ;
        System.out.println("Enter password");
        password= sc.next();
        
        check(db,this.userName,this.password);
     
}


}
