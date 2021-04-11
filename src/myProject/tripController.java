package myProject;

import java.awt.image.BufferedImage;

public class TripController {
    private Booking booking;
    private Trip admin;


    public TripController() {

    }

    public TripController(Trip trip) {
        this.admin = trip;
    }

    public Trip cancelTrip() {
        if (booking.getNmbRes() <= admin.getMinReservations()) {
            admin.cancelTrip();
            System.out.println("Trip is canceled");
        }
        return admin;
    }

    public static void main(String[] args) {
        int maxReservations = 30;
        int minReservations = 10;
        if (Booking.getNmbRes() == maxReservations) {
            System.out.println("Is fully Booked");
        }
    }

    public Trip createTrip(String tripID, String destination, float date, float time, String hostEmail, int maxReservations, int minReservations, boolean isFullyBooked, String category, BufferedImage schedule, int capacity, int price) {
        admin = new Trip(tripID, destination, date, time, hostEmail, maxReservations, minReservations, isFullyBooked, category,
                schedule, capacity, price);
        return admin;
    }


}




