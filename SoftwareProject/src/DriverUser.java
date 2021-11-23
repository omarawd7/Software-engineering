import java.util.Scanner;

public class DriverUser extends  User {
	private Offer f;
	favouriteAreas a[];
	int [ ] rates;
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


/////////////////////////////////////////////////
	//function to add  offer to list of offers
    public void suggestOffer(Ride r) 
	   {
    	f = null;
    	try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter the value you want to set for the ride ");
			  f.setPrice(scan.nextDouble());
		
		}
		   int n=0;
		  // Offer pricesugges []= new Offer [n+1];
		   for(int i=0;i<n;i++) {
	       r.offers[n]=f;
		   }
		   n++;   
	       
		}

   
   public Ride[] listAllRides(Ride r,DriverUser d) 
   { 
 
	   Ride[] MyFav = null;
	   if(d.a.equals(r.getSource()))
			   
		 { 
		   int n=d.a.length;
		   MyFav=new Ride[n];
		   MyFav[n]=r;
		   }
	   
	
	return  MyFav;
	   
   }


public double avgRating(double[] ratings) {
	int noOfRatings=ratings.length;
	double sumArr=0;
	for(int i=0; i<ratings.length;i++)
	{
		sumArr+=ratings[i];
	}
	double avg= sumArr/noOfRatings;
	return avg;
	
	
} 


	void addFavouriteAreas(favouriteAreas a ) {
		Scanner s1 = new Scanner(System.in);
		String[] array = new String[20];
		System.out.println("Please select your favourite areas");
		s1 = new Scanner(System.in);
		System.out.println("How many areas did you add?");
		int length = s1.nextInt();
        for (int i = 0; i < length;i++){
            array[i] = s1.nextLine();		
        }
        a.setLocations (array);
	}
	void addSourceArea(favouriteAreas s) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Please select your source area");
		String source = s1.nextLine();
		s.setSourceArea(source);
	}
	public void listMyRatings(NormalUser n ) {
		System.out.print("Your rates are : ");
		System.out.print(n.getRate());
	}
	
}
