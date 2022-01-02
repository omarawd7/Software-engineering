package com.example.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class NormalUser extends  User{

    private int dayOfbirth;
    private int monthOfbirth;
    private double blance;
    private ArrayList<String> notification=new ArrayList<>();
    public void addNotifcation(String s){
        notification.add(s);
    }

    public ArrayList<String> getNotification() {
        return notification;
    }

    public void setNotification(ArrayList<String> notification) {
        this.notification = notification;
    }

    public double getBlance() {
        return blance;
    }

    public void setBlance(double blance) {
        this.blance = blance;
    }

    public int getDayOfbirth() {
        return dayOfbirth;
    }

    public int getMonthOfbirth() {
        return monthOfbirth;
    }

    int count = 0;

    public NormalUser(String username, String name, String password, String mail, String phone,int dayOfbirth,int monthOfbirth) {
        super(username, name, password, mail, phone);
        // TODO Auto-generated constructor stub
        this.dayOfbirth=dayOfbirth;
        this.monthOfbirth=monthOfbirth;
    }

    public NormalUser() {
        // TODO Auto-generated constructor stub
    }
    public void getOffers(){
        DataBase.getInstance().getOffersForPassenger(this);
    }
    public String AcceptOffer(Offer offer){
        offer.getDriver().setBlance(offer.getPrice()+offer.getDriver().getBlance());
        Discount.getInstance().applyDiscount(offer);
        setBlance(getBlance()-offer.getPrice());
        offer.setAccepted(true);
        offer.getRide().getEvents().get(1).setDate();
        offer.getRide().getEvents().get(1).setDriverName(offer.getRide().getEvents().get(0).getDriverName());
        offer.getRide().getEvents().get(1).setName("accept");
        offer.getRide().getEvents().get(1).setUserName(UserName);
        offer.getRide().getEvents().get(1).setPrice(offer.getRide().getEvents().get(0).getPrice());
        offer.getDriver().setCurrentRide(offer.getRide());
        return this.UserName+"Accepted an offer";
    }

	/*public NormalUser(String username, String name, String pass, String phone) {
		 setUserName(username);
		 setPassword(pass);
		 setPhone(phone);
		 seteMail()
	}*/

    public String requestRide(String source,String destnation,int noOfPassengers) {

        Ride myRide= new Ride(source,destnation,this);
        DataBase.getInstance().addRide(myRide);
        myRide.setNoOfPassenger(noOfPassengers);


        return this.UserName+" Succefully requested a ride";
    }


    public String givesRate(int rate,DriverUser dr1) {
        dr1.rates.add(rate);
        return this.UserName+" Succefully rated  "+dr1.Name+" "+rate;
    }








}
