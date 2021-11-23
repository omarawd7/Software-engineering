
public  class  Validation {
   public void check(DataBAse db,String userName,String password){
  int admin=0;
  int driver=0;
  int normaluser=0;
   boolean isDriver=false;
   boolean isAdmin=false;
   boolean isUser=false;
   User us;
   for(int i=0;i<db.getUserData().size();i++){//checking if it is a normal  user
       if(db.getUserData().get(i).getUserName().equals(userName) && db.getUserData().get(i).getPassword().equals(password))
       isUser=true;
        normaluser=i;
       break;
   }
   for(int i=0;i<db.getDriverData().size();i++){//checking if it is a driver
    if(db.getDriverData().get(i).getUserName().equals(userName)&& db.getDriverData().get(i).getPassword().equals(password))
       isDriver=true;
    driver=i;
    break;
   }
    for(int i=0;i<db.getAdminData().size();i++){//checking if it is an admin
    if(db.getAdminData().get(i).getUserName().equals(userName) && db.getAdminData().get(i).getPassword().equals(password))
       isAdmin=true;
     admin=i;
    break;
  
   }
    if(isUser==true) 
    {
    	// here must the Normal User minue open //
    }
     if(isAdmin==true) {
    	us=new admin();
    	((admin) us).AddNewDriver();
 
    }
     if(isDriver==true)
    {
    	// here must the driver minue open     //
    }
    if (isDriver==false&&isAdmin==false&&isUser==false) {
		 System.out.println("Wrong password or User name");	
		 Login l=new Login();
		 l.validate(db);
    	//return null;
    }
  
    }
public static void main(String[] args) {
	admin ahmed=new admin("admin","admin","0000","ahemd@home","655463");
NormalUser omar=new NormalUser("omar","omar","54563","omar@home","65512");
DriverUser mohamed=new DriverUser("mohamed","momo","05464","mohamed@home","482364");
DataBAse db=new DataBAse();
db.addNormalUser(omar);
db.addDriverUser(mohamed);
db.addAdmin(ahmed);





}



}
