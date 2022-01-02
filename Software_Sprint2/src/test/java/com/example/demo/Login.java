package com.example.demo;

import java.util.Scanner;
public class Login extends Validation {
    String stat;
    DataBase db=DataBase.getInstance();
    public String userName,password;
    Login(String userName,String password){
        this.userName=userName;
        this.password=password;
        validate(db,userName,password);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
    public  void validate(DataBase db ,String userName,String password){

        stat=check(db,this.userName,this.password);

    }
    public String ReturnLogInStatus(){
        return stat;
    }
   public admin GetAdminrInstance(){

       return getAdmin();
   }

}

