
public class DriverUser extends  User {
	public DriverUser(String username, String name, String password, String mail, String phone) {
		super(username, name, password, mail, phone);
		// TODO Auto-generated constructor stub
	}
	public DriverUser() {
		// TODO Auto-generated constructor stub
	}
	String DriverLiecense;
	 int NationalID;

 public String getDriverLiecense() {
		return DriverLiecense;
	}
	public void setDriverLiecense(String driverLiecense) {
		DriverLiecense = driverLiecense;
	}
	public int getNationalID() {
		return NationalID;
	}
	public void setNationalID(int nationalID) {
		NationalID = nationalID;
	}



	
}
