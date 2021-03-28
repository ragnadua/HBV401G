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

    public trip(String tripID, String destination, float date, float time, String hostEmail, int maxReservations, boolean isFullyBooked, String category, BufferedImage schedule, int capacity) {
        this.tripID = tripID;
        this.destination = destination;
        this.date = date;
        this.time = time;
        this.hostEmail = hostEmail;
        this.maxReservations = maxReservations;
        this.isFullyBooked = isFullyBooked;
        this.category = category;
        this.schedule = schedule;
        this.capacity = capacity;
    }

    //@Override
    //public String toSting() {
    //  return tripID + destination + date + time;
    //}
    public static void main(String[] args) {
        trip t = new trip();
        t.printDetails();
    }

    public String getTripID() {
        return tripID;
    }

    public void setTripID(String tripID) {
        this.tripID = tripID;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public float getDate() {
        return date;
    }

    public void setDate(float date) {
        this.date = date;
    }

    public float getTime() {
        return time;
    }

    public void setTime(float time) {
        this.time = time;
    }

    public String getHostEmail() {
        return hostEmail;
    }

    public void setHostEmail(String hostEmail) {
        this.hostEmail = hostEmail;
    }

    public int getMaxReservations() {
        return maxReservations;
    }

    public void setMaxReservations(int maxReservations) {
        this.maxReservations = maxReservations;
    }

    public boolean isFullyBooked() {
        return isFullyBooked;
    }

    public void setFullyBooked(boolean fullyBooked) {
        isFullyBooked = fullyBooked;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public BufferedImage getSchedule() {
        return schedule;
    }

    public void setSchedule(BufferedImage schedule) {
        this.schedule = schedule;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void printDetails() {
        System.out.println(tripID + destination + date + time);
    }

    //private booking Booking = new booking();

    //public String setTripID(String s) {
    //s = tripID;
    //return s;
    //}

    //public String setDestination(String s) {
    //  s = destination;
    //return s;
    //}

    // public float setDate(float d) {
    //   d = date;
    // return d;
    //}

    //public float setTime(float t) {
    //  t = time;
    //return t;
    //}

    //public String setHostEmail(String s) {
    //  s = hostEmail;
    //return s;
    //}

    // public Boolean setFullyBooked(int r) {
    //if (r == maxReservations) {
    //  return true;
    //} else return false;
    //}

    //public int setMaxReservations(int r) {
    //r = maxReservations;
    //return r;
    // }

    //public int currentCapacity(int t) {
    //capacity = maxReservations- nmbRes
    //}

    // public String setCategory(String s) {
    // s = category;
    // return s;
    // }


}
