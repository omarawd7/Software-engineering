import java.util.Scanner;

public class UserRegestration extends  registeration{

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
		  
		  s.setname(n);
		  s.setUsername(un);
		  s.setPassword(p);
		  s.setMail(m);
		  s.setPhone(ph);
	
		  System.out.println("data saved correctly");
		
		  	}
		
	
	
}
