package com.example.demo;

import java.util.ArrayList;

public class DriverVerfication {

    static ArrayList <DriverUser> PendingDrivers=new ArrayList<>();
    private static DriverVerfication single_instance = null;
    public static DriverVerfication getInstance()
    {
        if (single_instance == null)
            single_instance = new DriverVerfication();
        return single_instance;
    }
    public static ArrayList<DriverUser> getPendingDrivers() {
        return PendingDrivers;
    }
    public static void setPendingDrivers(DriverUser driver) {
        PendingDrivers.add(driver);
    }

}
