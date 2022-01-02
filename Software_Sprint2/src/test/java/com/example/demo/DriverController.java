package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class DriverController extends  registeration {
    DataBase dab=DataBase.getInstance();
    admin ahmed=new admin("admin","ahmed","0000","ahemd@home","655463");
    NormalUser  omar= new NormalUser ("omar" , "omar", "omar", "awad", "0122",29,5);
    DriverUser  tamer= new DriverUser ("tamer" , "tamer", "tamer", "awad", "0122","dafdf545",5484);
    Event event1 =new Event();
    Event event2 =new Event();
    Event event3 =new Event();
    Ride ride=new Ride();
    Offer offer=new Offer();
    private static ArrayList<Event> events=new ArrayList<>();
    void controller(){//this function is provided for test only
        register(omar);
        register(tamer);
        event1.setName("accept");
        event2.setName("denide");
        events.add(event1);
        events.add(event2);
        events.add(event3);
        ride.setEvents(events);
        ride.setDestination("dokki");
        ride.setSource("maadi");
        ride.setNoOfPassenger(2);
        offer.setPrice(50);
        offer.setDriver(tamer);
        offer.setRide(ride);
    }
    @GetMapping("api/v1/DriverRegiestration/{username}/{name}/{password}/{mail}/{phone}/{DriverLiecense}/{NationalID}")
    public String UserRegiestration(@PathVariable  String username,@PathVariable  String name,@PathVariable  String password,@PathVariable  String mail,@PathVariable  String phone,@PathVariable   String DriverLiecense,@PathVariable int NationalID){
        DriverUser newDriver =new DriverUser( username,  name,  password,  mail,  phone, DriverLiecense, NationalID);
        register(newDriver);
        return  "Driver succefully regiested wait untill the adminds enters you to the system";
    }
    @GetMapping("api/v1/login2/{username}/{pass}")
    public String adminlogin(@PathVariable String username, @PathVariable String pass){//log in as admin
        controller();
        Login l=new Login(username,pass);
        return  l.ReturnLogInStatus();
    }
   /* @GetMapping("api/v1/Driver/addNotifcation/{note}")
    public String DriverAddNotifcation(String note){
        controller();
        return tamer.addNotifcation(note);
    }*/
    @GetMapping("api/v1/Driver/RideStarted")
    public String DriverRideStarted(@Autowired Ride ride){
        controller();
        return tamer.RideStarted(ride);
    }
    @GetMapping("api/v1/Driver/getCurrentRide")
    public Ride DrivergetCurrentRide(){
        controller();
        return tamer.getCurrentRide();
    }
    @GetMapping("api/v1/Driver/SuggestOffer/{price}")
    public String DriverSuggestOffer(int price){
        controller();
        return tamer.suggestOffer(ride,price);
    }




}
