package myProject;

import java.util.ArrayList;

public class booking {
    private trip tripUnit;
    private account accountUnit;
    private Boolean pickUp;
    private float price;
    private float discount;
    private Boolean paymentConfirmed;
    private int nmbRes;
    private ArrayList passList;


    public trip getTripUnit(trip t) {
    }

    public account getAccountUnit(account a) {
    }

    public float setPrice(float f) {
        f = price;
        return f;
    }

    public float setDiscount(float f) {
        return (f / 100) * price;
    }

    public int setNmbRes(int t) {


    }

    public int getNmbRes() {
        //sækir úr Booking: setnmbres
        return nmbRes;
    }

    private String addToPassList() {

    }

    public Boolean setPaymentConfirmed(boolean b) {
        b = paymentConfirmed;
        if ()
    }

    public Boolean setPickUp() {
        //Button listener sem returns true ef hakad i else false.
    }


}
