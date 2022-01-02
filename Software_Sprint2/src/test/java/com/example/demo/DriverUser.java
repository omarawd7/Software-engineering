package com.example.demo;

import org.springframework.stereotype.Component;

import java.util.*;
@Component
public class DriverUser extends  User {
    private double blance;

    public double getBlance() {
        return blance;
    }

    public void setBlance(double blance) {
        this.blance = blance;
    }
    Ride currentRide;
    String[] array =new String[100] ;
    private ArrayList<String> favouriteArea=new ArrayList<>();

    public ArrayList<String> getFavouriteArea() {
        return favouriteArea;
    }

    public void setFavouriteArea(ArrayList<String> favouriteArea) {
        this.favouriteArea = favouriteArea;
    }
    public ArrayList<Ride> getFavouriteAreaRides(){
        return DataBase.getInstance().getRideofDriverfavouriteAreas(this);
    }

    ArrayList<Integer> rates = new ArrayList<Integer>();
    notification notf=new notification();
    public DriverUser(String username, String name, String password, String mail, String phone,String DriverLiecense,int NationalID) {
        super(username, name, password, mail, phone);
        // TODO Auto-generated constructor stub
        currentRide=null;
        this.DriverLiecense=DriverLiecense;
        this.NationalID=NationalID;
    }
    public DriverUser() {
        currentRide=null;
        // TODO Auto-generated constructor stub
    }
    private ArrayList<String> notification=new ArrayList<>();
    public String addNotifcation(String note){
        notification.add(note);
        return "notification "+ note +" add Succefully";
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
    public String RideStarted(Ride ride){
        ride.setStarted(true);
        ride.getEvents().get(2).setDate();
        ride.getEvents().get(2).setDriverName(ride.getEvents().get(0).getDriverName());
        ride.getEvents().get(2).setName("Ride Started");
        ride.getEvents().get(2).setUserName(UserName);
        ride.getEvents().get(2).setPrice(ride.getEvents().get(0).getPrice());

     return "the ride to " + ride.getDestination() + " started ";
    }

    public Ride getCurrentRide() {
        return currentRide;
    }

    public void setCurrentRide(Ride currentRide) {
        this.currentRide = currentRide;
    }
    public void RideEnded(Ride ride){
        ride.setEnded(true);
        ride.getEvents().get(3).setDate();
        ride.getEvents().get(3).setDriverName(ride.getEvents().get(0).getDriverName());
        ride.getEvents().get(3).setName("Ride Started");
        ride.getEvents().get(3).setUserName(UserName);
        ride.getEvents().get(3).setPrice(ride.getEvents().get(0).getPrice());
        currentRide=null;


    }
    public boolean hasFavouriteArea(String area){
        boolean  flag=false;
        for(int i=0;i<favouriteArea.size();i++){
            if(area==favouriteArea.get(i))
            {flag=true;
            }
            break;
        }
        return flag;
    }

    /////////////////////////////////////////////////
    //function to add  offer to list of offer
    public String suggestOffer(Ride ride,int price) {
        Offer offer=new Offer();
        offer.setDriver(this);
        offer.setPrice(price);
        offer.setRide(ride);
        DataBase.getInstance().addOffer(offer);
        ride.getEvents().get(0).setDate();
        ride.getEvents().get(0).setDriverName(UserName);
        ride.getEvents().get(0).setName("offering");
        ride.getEvents().get(0).setPrice(price);
        ride.getEvents().get(0).setUserName("don't know yet");

     return "the ride to"+ride.destination+"offered with value : "+price;

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




    public void listMyRatings( ) {


        //System.out.println(rates.size());


        for(int i=0;i<rates.size();i++) {

            if(rates.get(i)>=0 &&rates.get(i)<=5)
            {

                System.out.println(rates.get(i));
            }
            else {

                System.out.println("you can't give neither a negative rate nor a rate greater than 5");

            }
        }
    }


    public  ArrayList<Integer> getRates() {
        return rates;
    }

}