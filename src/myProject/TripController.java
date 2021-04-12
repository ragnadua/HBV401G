package myProject;

import java.awt.image.BufferedImage;

public class TripController {
    private Booking booking;
    private Trip admin;

    public TripController(Trip trip, Booking booking) {
        this.admin = trip;
        this.booking = booking;

    }

    public Trip cancelTrip() {
        if (booking.getNmbRes() <= admin.getMinReservations()) {
            admin.cancelTrip();
            System.out.println("Trip is canceled");
        }
        return admin;
    }

    public Trip createTrip(String tripID, String destination, float date, float time, String hostEmail, int maxReservations, int minReservations, boolean isFullyBooked, String category, BufferedImage schedule, int capacity, boolean canceledTrip, int price) {
        admin = new Trip(tripID, destination, date, time, hostEmail, maxReservations, minReservations, isFullyBooked, category, schedule, capacity, canceledTrip, price);
        return admin;
    }

    // ATHUGA
    public Trip fullyBooked() {
        if (booking.getNmbRes() == admin.getMaxReservations()) {
            admin.isFullyBooked() = true;
            System.out.println("Is fully Booked");
        }
        return admin;
    }
}






