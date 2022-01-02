package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class Ride {

    ArrayList<Offer> offers=new ArrayList<Offer>();
    String source;
    String destination;
    NormalUser NU;
    boolean offeraccepted;
    Offer offer;
    ArrayList <Event>events=new ArrayList<>();
    boolean Started=false;
    boolean ended=false;
    int discount;
    int noOfPassenger;

    public ArrayList<Offer> getOffers() {
        return offers;
    }

    public void setOffers(ArrayList<Offer> offers) {
        this.offers = offers;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
    public boolean isStarted() {
        return Started;
    }

    public boolean isEnded() {
        return ended;
    }

    public void setStarted(boolean Started) {
        this.Started = Started;
    }

    public void setEnded(boolean ended) {
        this.ended = ended;
    }

    public boolean isOfferaccepted() {
        return offeraccepted;
    }

    public void setOfferaccepted(boolean offeraccepted) {
        this.offeraccepted = offeraccepted;
    }

    public ArrayList<Event> getEvents() {
        return events;
    }

    public void setEvents(ArrayList<Event> events) {
        this.events = events;
    }
    public Ride(){}
    public void setOffer(Offer offer) {
        this.offer = offer;
    }


    public void setSource (String source) {
        this.source = source;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }
    public String getSource() {
        return source;
    }
    public String getDestination() {
        return destination;
    }
    public ArrayList<Offer> getOffer(){

        return offers;
    }

    public int getNoOfPassenger() {
        return noOfPassenger;
    }

    public void setNoOfPassenger(int noOfPassenger) {
        this.noOfPassenger = noOfPassenger;
    }



    public Ride(String source, String destination, NormalUser NU) {
        this.source = source;
        this.destination = destination;
        this.NU = NU;

    }

    public NormalUser getNU() {
        return NU;
    }

    public void setNU(NormalUser NU) {
        this.NU = NU;
    }




}
