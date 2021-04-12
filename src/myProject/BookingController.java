package myProject;

public class BookingController {

    public void addToCart(Booking b) {
        // bæta TripID, destination,Date og time inn í Cart
        //Fækka í currentCapacity ef paymentConfirmed er true
        // Setja nafn og userID úr account inná passengerList

    }

    public void cancelTrip(Booking b) {
        //Hækkar aftur currentCapacity
        //núllar nmbRes og paymentconfirmed
        //Tekur nöfnin sem sett voru á passengerList út
    }
}
