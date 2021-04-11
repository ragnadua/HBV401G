package myProject;

public class tripController {
    private booking booking;
    private trip admin;


    public tripController() {

    }

    public tripController(trip trip) {
        this.admin = trip;
    }

    public trip cancelTrip() {
        if (booking.nmbRes <= trip.minReservations) {
            System.out.println("Trip is canceled");
        }
        return admin;
    }

<<<<<<< HEAD
<<<<<<< HEAD
    public static void main(String[] args) {
        int maxReservations = 30;
        int minReservations = 10;
        if (Booking.getNmbRes() == maxReservations) {
            System.out.println("Is fully Booked");
        }
    }

    public Trip createTrip(String tripID, String destination, float date, float time, String hostEmail, int maxReservations, int minReservations, boolean isFullyBooked, String category, BufferedImage schedule, int capacity) {
        admin = new Trip(tripID, destination, date, time, hostEmail, maxReservations, minReservations, isFullyBooked, category,
                schedule, capacity);
=======
    public trip createTrip(String tripID, String destination, float date, float time, String hostEmail,
                           int maxReservations, int minReservations) {
        admin = new trip(tripID, destination, date, time, hostEmail, maxReservations, minReservations);
>>>>>>> parent of e96b215 (sun2)
=======
    public trip createTrip(String tripID, String destination, float date, float time, String hostEmail,
                           int maxReservations, int minReservations) {
        admin = new trip(tripID, destination, date, time, hostEmail, maxReservations, minReservations);
>>>>>>> parent of e96b215 (sun2)
        return admin;
    }


}




