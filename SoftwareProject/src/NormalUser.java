import java.util.Scanner;

public class NormalUser extends  User{
	notification n;
	DriverUser r;
	int count = 0;	
	
	
	public NormalUser(String username, String name, String password, String mail, String phone) {
		super(username, name, password, mail, phone);
		// TODO Auto-generated constructor stub
	}

	public NormalUser() {
		// TODO Auto-generated constructor stub
	}
	
	public void requestRide(Ride r ) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please detect your location right now");
		 r.setSource(sc.next());
		System.out.println("Where to ? ");
		r.setDestination(sc.next());
		n.notifyForOffers(r);
	}
	public void givesRate(int x) {
		Scanner scan=new Scanner(System.in);
		x=scan.nextInt();
		if(x>0 && x<5) {
			r.rates[count]=x;
		}
		else {
			System.out.println("you can't give neither a negative rate nor a rate greater than 5,"
					+ " give a new  rate please  ");
			scan=new Scanner (System.in);
			x=scan.nextInt();
			if(x>0&&x<5)
				r.rates[count]=x;
			else 
				System.exit(-1);	
		}
		count++;
	}
	public int[] getRate() {
		return r.rates;
	}
	
	
	
	
	
	
}
