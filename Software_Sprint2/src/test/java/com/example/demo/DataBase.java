package com.example.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class DataBase {
    private static ArrayList <NormalUser> userData=new ArrayList<>();
    private static ArrayList <DriverUser> driverData=new ArrayList<>();
    private static ArrayList <admin> adminData=new ArrayList<>();
    private static ArrayList <Ride> rides=new ArrayList<>();
    private static ArrayList <Offer> offers=new ArrayList<>();
    private static ArrayList <String> discountAreas=new ArrayList<>();
    private static DataBase single_instance = null;

    public static DataBase getInstance()
    {
        if (single_instance == null)
            single_instance = new DataBase();

        return single_instance;
    }
    public void addNormalUser(NormalUser User){
        userData.add(User);
    }
    public void addOffer(Offer offer){
        offers.add(offer);
        notification.getInstance().notifyPassengerWithoffer(offer);

    }
    public void addRide(Ride ride){
        rides.add(ride);
    }
    public ArrayList<Offer> getOffersForPassenger(NormalUser nu){
        ArrayList<Offer> offersdone=new ArrayList<>();
        for(int i=0;i<offers.size();i++){
            if(offers.get(i).getRide().getNU().equals(nu))
                offersdone.add(offers.get(i));
        }
        return offersdone;
    }
    public void addDiscountAreas(String Area){
        discountAreas.add(Area);
    }
    public ArrayList<Ride> getRideofDriverfavouriteAreas(DriverUser User){
        ArrayList<Ride> driverRequest=new ArrayList<>();
        for(String favouriteArea: User.getFavouriteArea()){
            for(Ride rides:rides){
                if(rides.getSource().equals(favouriteArea)&&User.getCurrentRide()==null)
                    driverRequest.add(rides);
            }}
        return driverRequest;
    }
    public boolean containRideofpassenger(NormalUser NU){
        boolean flag =false;
        for(Ride ride:rides){
            if(ride.getNU().equals(NU))
            {flag=true;
            }
            break;
        }
        return flag;
    }
    public boolean destContainsDiscountArea(String dest){
        boolean flag=false;
        for(String area:discountAreas){
            if(area==dest){
                flag=true;

            }
            break;
        }
        return flag;
    }
    public void deleteNormalUser(int da){
     /*   for(int i=0;i<userData.size();i++) {
            System.out.println(i+ "  " + userData.get(i).getName());
        }
        System.out.println("enter the number of user to delete");
        Scanner sc =new Scanner(System.in);
        int da = sc.nextInt();*/
        userData.remove(da);
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



}

