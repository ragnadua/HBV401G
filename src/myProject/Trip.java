package myProject;

import java.awt.image.BufferedImage;

public class Trip {
    private String tripID;
    private String destination;
    private float date;
    private float time;
    private String hostEmail;
    private int maxReservations;
    private int minReservations;
    private boolean isFullyBooked;
    private String category;
    private BufferedImage schedule;
    public int capacity;
    private boolean canceledTrip;

    public Trip(String tripID, String destination, float date, float time, String hostEmail, int maxReservations, int minReservations, boolean isFullyBooked, String category, BufferedImage schedule, int capacity, boolean canceledTrip) {
        this.tripID = tripID;
        this.destination = destination;
        this.date = date;
        this.time = time;
        this.hostEmail = hostEmail;
        this.maxReservations = maxReservations;
        this.minReservations = minReservations;
        this.isFullyBooked = isFullyBooked;
        this.category = category;
        this.schedule = schedule;
        this.capacity = capacity;
        this.canceledTrip = canceledTrip;
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

    public void setMaxReservations(int minReservations) {
        this.minReservations = maxReservations;
    }

    public int getMinReservations() {
        return minReservations;
    }

    public void setMinReservations(int minReservations) {
        this.minReservations = minReservations;
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

    public boolean isCanceledTrip() {
        return canceledTrip;
    }

    public void cancelTrip() {
        canceledTrip = true;
    }

}
