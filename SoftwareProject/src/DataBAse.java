
import java.util.ArrayList;

public class DataBAse {
    private static ArrayList <NormalUser> userData=new ArrayList<>();
    private static ArrayList <DriverUser> driverData=new ArrayList<>();
    private static ArrayList <admin> adminData=new ArrayList<>();
    public void addNormalUser(NormalUser User){     
    userData.add(User);
    }
    public void addDriverUser(DriverUser driver){
    driverData.add(driver);
    }
    public void addAdmin(admin ad){
    	adminData.add(ad);
    }
      public static ArrayList<NormalUser> getUserData() {
        return userData;
    }
    public void setUserData(ArrayList<NormalUser> userData) {
		this.userData = userData;
	}
	public static ArrayList<DriverUser> getDriverData() {
        return driverData;
    }
	 public static ArrayList<admin> getAdminData() {
        return adminData;
    }
    public static void main(String[] args){NormalUser ahmed=new NormalUser("ahmed","ahmed","01135","ahemd@home","655463");
    admin omar=new admin("admin","admin","0000","omar@home","65512");
    DriverUser mohamed=new DriverUser("mohamed","momo","05464","mohamed@home","482364");
    DataBAse db=new DataBAse();
db.addNormalUser(ahmed);
db.addDriverUser(mohamed);
db.addAdmin(omar);

    }
    

}

