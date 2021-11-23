import java.util.ArrayList;

public class DriverVerfication {

     static ArrayList <DriverUser> PendingDrivers=new ArrayList<>();

	public static ArrayList<DriverUser> getPendingDrivers() {
		return PendingDrivers;
	}
	public static void setPendingDrivers(DriverUser driver) {
		PendingDrivers.add(driver);
	}
    
}
