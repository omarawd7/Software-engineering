package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class Offer {
    private DriverUser driver=new DriverUser();
    private Ride ride=new Ride();
    private boolean Accepted;

    public boolean isAccepted() {
        return Accepted;
    }

    public void setAccepted(boolean Accepted) {
        this.Accepted = Accepted;
    }

    public DriverUser getDriver() {
        return driver;
    }

    public Ride getRide() {
        return ride;
    }

    public void setDriver(DriverUser driver) {
        this.driver = driver;
    }

    public void setRide(Ride ride) {
        this.ride = ride;
    }

    private double price ;

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }


}

