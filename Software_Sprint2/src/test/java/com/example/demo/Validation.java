package com.example.demo;

import java.util.Scanner;

public  class  Validation {
    int i=1;
    int admin=0;
    int driver=0;
    int normaluser=0;
    boolean isDriver=false;
    boolean isAdmin=false;
    boolean isUser=false;
    User us;
    public  admin getAdmin(){
        return (admin) us;
    }
    public String check(DataBase db,String userName,String password){

        for(int i=0;i<db.getUserData().size();i++){//checking if it is a normal  user
            if(db.getUserData().get(i).getUserName().equals(userName) && db.getUserData().get(i).getPassword().equals(password))
                isUser=true;
            normaluser=i;
            break;
        }
        for(int i=0;i<db.getDriverData().size();i++){//checking if it is a driver
            if(db.getDriverData().get(i).getUserName().equals(userName)&& db.getDriverData().get(i).getPassword().equals(password))
                isDriver=true;
            driver=i;
            break;
        }
        for(int i=0;i<db.getAdminData().size();i++){//checking if it is an admin
            if(db.getAdminData().get(i).getUserName().equals(userName) && db.getAdminData().get(i).getPassword().equals(password))
                isAdmin=true;
            admin=i;
            break;

        }

        if(isUser==true)

        {

            us = new NormalUser();
            //System.out.println("login as normal user successfully");
            return "login as normal user successfully";

        }
        if(isAdmin==true) {

            us=new admin();
            return "login as Admin  successfully";
       /*     System.out.println("Welcome Admin :)");
            while(true) {
                System.out.println("Do you want to(choose a number)\n1-register a new driver\n2-suspend User\n3-exit ");
                if (i==0) {
                    break;
                }
                int da = sc.nextInt();
                switch (da) {
                    case 1:
                        ((admin) us).AddNewDriver(0);

                        break;
                    case 2:
                        ((admin) us).SuspendUser(0) ;
                        break;
                    case 3:
                        i=0;
                        break;


//
                }
            }*/


        }
        if(isDriver==true)
        {
            //System.out.println("login as Driver successfully");
            us= new DriverUser();
            return "login as Driver successfully";

        }
        if (isDriver==false&&isAdmin==false&&isUser==false) {
           // System.out.println("Wrong password or User name");
            return "Wrong password or User name";
     //       Login l=new Login();
      //      l.validate(db);
            //return null;
        }
        //////////////


        return "Log in";
    }

    public static void main(String[] args) {
        admin ahmed=new admin("admin","admin","0000","ahemd@home","655463");
        NormalUser omar=new NormalUser("omar","omar","54563","omar@home","65512",4,7);
        DriverUser mohamed=new DriverUser("mohamed","momo","05464","mohamed@home","482364","ass44",545);
        DataBase db=new DataBase();
        db.addNormalUser(omar);
        db.addDriverUser(mohamed);
        db.addAdmin(ahmed);

    }
}
