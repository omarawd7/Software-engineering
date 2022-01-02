package com.example.demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

//@RequestMapping(path = "api/v1/admin")
@RestController
public class AdminController extends  registeration{
    DataBase dab=DataBase.getInstance();
    admin ahmed=new admin("admin","ahmed","0000","ahemd@home","655463");
    User  omar= new NormalUser ("omar" , "omar", "omar", "awad", "0122",29,5);
    User  tamer= new DriverUser ("tamer" , "tamer", "tamer", "awad", "0122","dafdf545",5484);
    Event event1 =new Event();
    Event event2 =new Event();
    Ride ride=new Ride();
    private static ArrayList <Event> events=new ArrayList<>();

    void controller(){//this function is provided for test only
        dab.addAdmin(ahmed); //adding an admin
        register(tamer);//add driver
        register(omar);//add user
        dab.addAdmin(ahmed); //adding an admin
        event1.setName("accept");
        event2.setName("denided");
        events.add(event1);
        events.add(event2);
        ride.setEvents(events);
    }

    @GetMapping("api/v1/login/{username}/{pass}")
    public String adminlogin(@PathVariable String username, @PathVariable String pass){
        controller();
        Login l=new Login(username,pass);
        return  l.ReturnLogInStatus();
    }

    @GetMapping("api/v1/admin/ShowpendingDrivers")
    public ArrayList<DriverUser> AdminShowPendingDrivers(){
        controller();
        return ahmed.ShowPendingDrivers();
    }

    @GetMapping("api/v1/admin/addDriver/{ind}")
    public String AdminAddNewDriver(@PathVariable int ind){
        controller();
        return ahmed.AddNewDriver(ind);
    }

    @GetMapping("api/v1/admin/SuspendUser/{ind}")
    public String AdminSuspendUser(@PathVariable int ind){
        controller();

        return ahmed.SuspendUser(ind);
    }

     @GetMapping("api/v1/admin/ShowUsers")
    public ArrayList <NormalUser> AdminShowUsers(){
        controller();
        return ahmed.ShowUsers();
    }

   @GetMapping("api/v1/admin/addDiscountAreas/{Area}")
    public String AdminaddDiscountAreas(@PathVariable String Area){
        controller();
        return ahmed.addDiscountAreas(Area);
    }

    @GetMapping("api/v1/admin/getEventOfRide")
    public String AdminGetEventOfRide(){
        controller();
        return ahmed.getEventOfRide(ride);
    }
}
