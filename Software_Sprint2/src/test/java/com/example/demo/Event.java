package com.example.demo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 *
 * @author 20106
 */
public class Event {
    String name;
    String date;
    String userName;
    String driverName;
    int price;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate() {
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy/MM/dd HH:MM:SS");
        LocalDateTime now=LocalDateTime.now();
        date= dtf.format(now);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Event{" + "name=" + name + ", date=" + date + ", userName=" + userName + ", driverName=" + driverName + ", price=" + price + '}';
    }



}
