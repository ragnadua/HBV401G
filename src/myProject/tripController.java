package myProject;

<<<<<<< HEAD
public class TripController {
    private Booking booking;
    private Trip admin;
=======
public class tripController {
    private booking booking;
    private trip admin;

>>>>>>> parent of e96b215 (sun2)

    public tripController() {

    }

    public tripController(trip trip) {
        this.admin = trip;
    }

<<<<<<< HEAD
    public Trip cancelTrip() {
        if (booking.nmbRes <= Trip.minReservations) {
=======
    public trip cancelTrip() {
        if (booking.nmbRes <= trip.minReservations) {
>>>>>>> parent of e96b215 (sun2)
            System.out.println("Trip is canceled");
        }
        return admin;
    }

<<<<<<< HEAD
<<<<<<<HEAD

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
        public Trip createTrip (String tripID, String destination,float date, float time, String hostEmail,
        int maxReservations, int minReservations){
            admin = new Trip(tripID, destination, date, time, hostEmail, maxReservations, minReservations);
>>>>>>>parent of e96b215(sun2)
            return admin;
        }
=======
    public trip createTrip(String tripID, String destination, float date, float time, String hostEmail,
                           int maxReservations, int minReservations) {
        admin = new trip(tripID, destination, date, time, hostEmail, maxReservations, minReservations);
        return admin;
    }
>>>>>>> parent of e96b215 (sun2)


    }




