package com.example.demo;

import java.util.Scanner;
public class UI extends  registeration {
    public static void main(String[] args) {
         DataBase db=DataBase.getInstance();
        admin ahmed=new admin("admin","admin","0000","ahemd@home","655463");
        db.addAdmin(ahmed);
        Ride r= new Ride();
        NormalUser u1=new NormalUser();
        NormalUser u3=new NormalUser();
        NormalUser u[]={u1,u3};
        DriverUser d1=new DriverUser();
        DriverUser d2=new DriverUser();
        DriverUser d[]= {d1,d2};
        int i=1;
        //

        // UserRegestration u =new UserRegestration();
        User user;
        Scanner sc =new Scanner(System.in);
        while(true) {
            System.out.println("Do you want to(choose a number)\n1-register\n2-login\n3-exit ");
            if (i==0) {
                break;
            }
            int da = sc.nextInt();
            switch (da) {
                case 1:
                    User  s= new NormalUser ("om" , "om", "om", "awad", "0122",5,88);
                    register(s);
                    break;
                case 2:
                    Login l=new Login("om","om");
                  //  l.validate(db);
                    break;
                case 3:
                    i=0;
                    break;


//
            }
        }




        //request ride
        //u1.requestRide();
        //System.out.println("looking for drivers!");
/*
		//driver adding favorite areas
		d1.addSourceArea();
		d1.addFavouriteAreas();
		*/

        //list all rides
        //	u1.requestRide();
        //	u3.requestRide();
        //  d1.listNearbyReq(u,r);
    }}

//list
//suspend account


		/*

		//rate driver
		int x=0;
		u1.givesRate(x, d1);




		                    //list ratings
		u1.givesRate(x,d1);
		u3.givesRate(x,d1);
		d1.listMyRatings();}} */



		/*
		//user request a ride then drivers suggest offers to user
		u1.requestRide();

		System.out.println("looking for drivers!");
		d1.suggestOffer(r);
		d2.suggestOffer(r);
		r.viewallOffers();

		}*/


