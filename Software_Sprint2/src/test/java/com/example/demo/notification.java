package com.example.demo;

import java.util.ArrayList;

public class notification {
    notification(){}
    private static notification instance=null;
    public static notification getInstance(){
        if(instance==null){
            instance=new notification();
        }
        return instance;

    }

    public void notifyDriverWithRide(Ride ride){
        for(int i=0;i>DataBase.getDriverData().size();i++)
            if(DataBase.getDriverData().get(i).hasFavouriteArea(ride.getSource()) && DataBase.getDriverData().get(i).getCurrentRide()==null){
                DataBase.getDriverData().get(i).addNotifcation(ride.toString());
            }

    }
    public void notifyPassengerWithoffer(Offer offer){
        offer.getRide().getNU().addNotifcation(offer.toString());
    }
}