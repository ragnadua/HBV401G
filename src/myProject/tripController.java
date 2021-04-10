package myProject;

public class tripController {
    private trip tripOwner;

    public tripController() {

    }

    public tripController(trip trip) {
        this.tripOwner = trip;
    }

    public trip cancelTrip() {
        if (nmbRes <= minReservations) {
            System.out.println("Trip is canceled");
        }
        return tripOwner;
    }

    public trip createTrip(String tripID, String destination, float date, float time, String hostEmail,
                           int maxReservations, int minReservations) {
        tripUser = new trip(tripID, destination, date, time, hostEmail, maxReservations, minReservations);
        return tripOwner;
    }


}




