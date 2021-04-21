package myProject;

import java.awt.image.BufferedImage;
import java.util.Date;

public class TripController {
    private Booking booking;
    private Database db = Database.getInstance();

    //Usage: cancelTrip()
    //Before: A trip object exists.
    //After: If a trip didn't reach the minimum amounts of reservations on the day it's scheduled the Trip is canceled.
    public void cancelTrip(Trip t) {
        if (t.getDate().equals(new Date(System.currentTimeMillis())) && booking.getNmbRes() <= t.getMinReservations()) {
            System.out.println("Trip is canceled");
            db.getAllTrips().remove(t);
        }
    }

    //Usage: createTrip(String a, String b, Date c, String d, int e, int f, boolean g, String h, BufferedImage i, int j, boolean k, int m)
    //Before: Nothing
    //After: A trip is created and added to the database
    public Trip createTrip(String tripID, String destination, Date date, String hostEmail, int maxReservations, int minReservations, boolean isFullyBooked, String category, BufferedImage schedule, int capacity, boolean canceledTrip, int price) {
        Trip trip = new Trip(tripID, destination, date, hostEmail, maxReservations, minReservations, isFullyBooked, category, schedule, canceledTrip, price);
        db.AddTrip(trip);
        return trip;
    }

}






