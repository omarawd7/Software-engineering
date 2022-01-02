package com.example.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class admin extends  User {
    DataBase db=DataBase.getInstance();
    public void setDataBase(DataBase db){
        this.db=db;
    }
    int n;
    DriverVerfication d=DriverVerfication.getInstance();
    public admin(String username, String name, String password, String mail, String phone) {
        super(username, name, password, mail, phone);
        // TODO Auto-generated constructor stub
    }
    public admin() {
        // TODO Auto-generated constructor stub
    }
    public ArrayList<DriverUser> ShowPendingDrivers() {
        //String PendingDrivers[];
      /*  for(int i=0;i<d.getPendingDrivers().size();i++) {
            return i+"-the driver Name Is:"+d.getPendingDrivers().get(i).getName();
        }*/
        return DriverVerfication.PendingDrivers;
    }
    public ArrayList <NormalUser> ShowUsers() {
        //String PendingDrivers[];
      /*  for(int i=0;i<d.getPendingDrivers().size();i++) {
            return i+"-the driver Name Is:"+d.getPendingDrivers().get(i).getName();
        }*/
        return db.getUserData();
    }
    public String AddNewDriver(int n){
     //   System.out.println("Enter the Number Of the Driver to add ");

        db.addDriverUser(d.getPendingDrivers().get(n));
        return d.getPendingDrivers().get(n).getName()+"added Succefully";
    }
    public String SuspendUser(int u){
        DataBase db=DataBase.getInstance();
        db.deleteNormalUser(u);
        return "susbended  user "+u;
    }
    public String getEventOfRide( Ride ride){
        String events=" ";
        for(int i=0;i<4;i++){
            events+=ride.getEvents().get(i).toString();
        }
        return events;
    }
    public String addDiscountAreas(String Area){
        DataBase.getInstance().addDiscountAreas(Area);
        return "Succefully added Discound to "+Area;
    }

}

