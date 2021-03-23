package myProject;

import java.awt.image.BufferedImage;

public class trip {

    private String tripID;
    private String destination;
    private float date;
    private float time;
    private String hostEmail;
    private int maxReservations;
    private boolean isFullyBooked;
    private String category;
    private BufferedImage schedule;
    public int capacity;

    //private booking Booking = new booking();

    public String setTripID(String s) {
        s = tripID;
        return s;
    }

    public String setDestination(String s) {
        s = destination;
        return s;
    }

    public float setDate(float d) {
        d = date;
        return d;
    }

    public float setTime(float t) {
        t = time;
        return t;
    }

    public String setHostEmail(String s) {
        s = hostEmail;
        return s;
    }

    public int currentCapacity(int t) {
        //capacity = maxReservations- nmbRes
    }

    public Boolean setFullyBooked(int r) {
        if (r == maxReservations) {
            return true;
        } else return false;
    }

    public int setMaxReservations(int r) {
        r = maxReservations;
        return r;
    }

    public String setCategory(String s) {
        s = category;
        return s;
    }


}
