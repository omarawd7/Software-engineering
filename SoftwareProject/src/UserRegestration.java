import java.util.Scanner;

public class UserRegestration extends  registeration{
	DataBAse db=new DataBAse() ; 
	public void setDataBase(DataBAse db){
		this.db=db;
		} 
	public  void register(User s) {
		  s= new NormalUser();
		String n;
		String un;
		String p;
		String m;
		String ph;
		Scanner sc =new Scanner(System.in);
		 System.out.println("Enter your name ");		 
		  n=sc.next();
		  System.out.println("Enter your Username ");
		  un=sc.next();
		  System.out.println("Enter your Password ");
		  p=sc.next();
		  System.out.println("Enter your Mail ");
		  m=sc.next();
		  System.out.println("Enter your phone ");
		  ph=sc.next();		  
		  s.setName(n);
		  s.setUserName(un);
		  s.setPassword(p);
		  s.seteMail(m);
		  s.setPhone(ph);
		  db.addNormalUser((NormalUser) s);
		  System.out.println("data saved correctly");
		
		  	}
		
	
	
}
