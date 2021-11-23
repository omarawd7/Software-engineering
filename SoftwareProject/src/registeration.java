import java.util.Scanner;

abstract class registeration {

static	public void register() {	
		Scanner sc =new Scanner(System.in);
		String n;
		 System.out.println("Are You A User or A Driver");		
		 n=sc.next();
		 if(n.equals("User") || n.equals("user")) {
			 User s=new User();
			 UserRegestration u = new UserRegestration();
			 u.register(s);
		 }
		 if(n.equals("Driver") || n.equals("driver")) {
			 User s=new DriverUser();
			 DriverRegestration d = new DriverRegestration();
			 d.register(s);
		 }				
	};

	

}
