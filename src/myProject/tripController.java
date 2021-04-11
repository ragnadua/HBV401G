package myProject;

public class TripController {
    private booking booking;
    private trip admin;


    public TripController() {

    }

    public TripController(trip trip) {
        this.admin = trip;
    }

    public trip cancelTrip() {
        if (booking.nmbRes <= trip.minReservations) {
            System.out.println("Trip is canceledd");
        }
        return admin;
    }

    public trip createTrip(String tripID, String destination, float date, float time, String hostEmail,
                           int maxReservations, int minReservations) {
        admin = new trip(tripID, destination, date, time, hostEmail, maxReservations, minReservations);
        return admin;
    }


}




