package com.example.demo;

import java.util.Scanner;
abstract class registeration {
    static DataBase db=DataBase.getInstance();
    static User s;
    static	public void register(User us )  {
        s=us;

        if(us instanceof NormalUser) {
           // User s=new User();
            UserRegestration u = new UserRegestration();
            u.register((NormalUser) us);
        }
        else if(us instanceof DriverUser) {
          //  User s=new DriverUser();
            DriverRegestration d = new DriverRegestration();
            d.register((DriverUser) us);
        }
    };
   /* static public void setNationalID(int national,String licence){
        s.setNationalID(national);
        s.setDriverLiecense(licence);
    }*/

}
