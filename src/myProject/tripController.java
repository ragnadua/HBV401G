package myProject;

public class TripController {
    private Booking booking;
    private Trip admin;


    public TripController() {

    }

    public TripController(Trip trip) {
        this.admin = trip;
    }

    public Trip cancelTrip() {
        if (booking.nmbRes <= Trip.minReservations) {
            System.out.println("Trip is canceled");
        }
        return admin;
    }

<<<<<<<HEAD

    public static void main(String[] args) {
        int maxReservations = 30;
        int minReservations = 10;
        if (Booking.getNmbRes() == maxReservations) {
            System.out.println("Is fully Booked");
        }
    }

    public Trip createTrip(String tripID, String destination, float date, float time, String hostEmail, int maxReservations, int minReservations, boolean isFullyBooked, String category, BufferedImage schedule, int capacity, int price) {
        admin = new Trip(tripID, destination, date, time, hostEmail, maxReservations, minReservations, isFullyBooked, category,
<<<<<<< HEAD
                schedule, capacity, price);
        return admin;
    }
=======
                schedule, capacity);
=======
        public Trip createTrip (String tripID, String destination,float date, float time, String hostEmail,
        int maxReservations, int minReservations){
            admin = new Trip(tripID, destination, date, time, hostEmail, maxReservations, minReservations);
>>>>>>>parent of e96b215(sun2)
            return admin;
        }
>>>>>>> 6f730d0dbda6b10bb6ba9cedcad17b09fdea15a7


    }




