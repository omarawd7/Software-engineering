package com.example.demo;

import java.util.Calendar;
/**
 *
 * @author 20106
 */
public class Discount {
    private static Discount  Instance=null;
    private Discount(){}
    public static Discount getInstance(){
        if(Instance==null){
            Instance=new Discount();



        }
        return Instance;
    }
    public double offer5(double price){
        double newprice=price*5/100;
        return newprice;
    }
    public double offer10(double price){
        double newprice=price*10/100;
        return newprice;
    }

    public void applyDiscount(Offer offer){
        if(!DataBase.getInstance().containRideofpassenger(offer.getRide().getNU())){
            offer.setPrice(offer10(offer.getPrice()));
        }
        if(DataBase.getInstance().destContainsDiscountArea(offer.getRide().getDestination())){

            offer.setPrice(offer10(offer.getPrice()));
        }
        if(offer.getRide().getNoOfPassenger()>1){
            offer.setPrice(offer5(offer.getPrice()));
        }
        if(Calendar.getInstance().get(Calendar.DAY_OF_WEEK)==6)
            offer.setPrice(offer5(offer.getPrice()));
        if(Calendar.getInstance().get(Calendar.MONTH)==offer.getRide().getNU().getMonthOfbirth()&&
                Calendar.getInstance().get(Calendar.DAY_OF_MONTH)==offer.getRide().getNU().getDayOfbirth())
        { offer.setPrice(offer10(offer.getPrice()));
        }
    }

}
