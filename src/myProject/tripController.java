package myProject;

public class TripController {
    private booking booking;
    private Trip admin;


    public TripController() {

    }

    public TripController(Trip trip) {
        this.admin = trip;
    }

    public Trip cancelTrip() {
        if (booking.nmbRes <= admin.minReservations) {
            System.out.println("Trip is canceledd");
        }
        return admin;
    }

    public Trip createTrip(String tripID, String destination, float date, float time, String hostEmail,
                           int maxReservations, int minReservations) {
        admin = new Trip(tripID, destination, date, time, hostEmail, maxReservations, minReservations);
        return admin;
    }


}




