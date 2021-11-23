import java.util.Scanner;

public class admin extends  User {
	DataBAse db=new DataBAse() ; 
	public void setDataBase(DataBAse db){
		this.db=db;
		} 
	int n;
	DriverVerfication d;
	public admin(String username, String name, String password, String mail, String phone) {
		super(username, name, password, mail, phone);
		// TODO Auto-generated constructor stub
	}
    public admin() {
		// TODO Auto-generated constructor stub
	}
	public void AddNewDriver(){
  	    System.out.println("Welcome Admin :)");

    	for(int i=0;i<d.getPendingDrivers().size();i++) {
    		  System.out.println(i+"-the driver Name Is:"+d.getPendingDrivers().get(i).getName());
    	}
  	    System.out.println("Enter the Number Of the Driver to add ");
     	Scanner sc =new Scanner(System.in);
     	 n=sc.nextInt();
		  db.addDriverUser(d.getPendingDrivers().get(n));   
		 
    }	
    
    
	
	public void suspendUser(UserAcc account) {
		int n = 0;
		UserAcc suspendedUsers[] = new UserAcc[n+1];
		for(int i=0;i<n;i++) {
			suspendedUsers[n]=account;
			n++;
			 
		}}
	}


