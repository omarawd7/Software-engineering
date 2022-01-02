package com.example.demo;

public class DriverRegestration extends registeration{
    public String register(DriverUser s ) {
  /*      //DriverVerfication d=new DriverVerfication();
        String n;
        String un;
        String p;
        String m;
        String ph;
        int na;
        String li;
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

        System.out.println("Enter your National ID ");
        na=sc.nextInt();

        System.out.println("Enter your Liecins ");
        li=sc.next();

     //   s= new DriverUser (un, n, p, m, ph);
        ((DriverUser) s).setNationalID(na);
        ((DriverUser) s).setDriverLiecense(li);
*/
        DriverVerfication.setPendingDrivers( s);

     return"Driver data saved correctly";

    }


	/*public void OpenInterface(User s) {
		// TODO Auto-generated method stub

	}

*/



}

