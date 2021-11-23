import java.util.Scanner;

public class UI extends  registeration {	
	public static void main(String[] args) {		
		 DataBAse db=new DataBAse();
//		 UserRegestration u=new UserRegestration();
		 User user;
		Scanner sc =new Scanner(System.in);
		//

		 //
		 while(true) {
		     System.out.println("do you want to 1-register 2-login");

			 int da = sc.nextInt();
			 switch (da) {
			   case 1:
					 register();
					 
			     break;
			   case 2:
				   admin ahmed=new admin("admin","admin","0000","ahemd@home","655463");
				   db.addAdmin(ahmed);
                    Login l=new Login();
					l.validate(db);					
				 break;
			   
//				   	
			 }
		 }

		 

	  }
}
