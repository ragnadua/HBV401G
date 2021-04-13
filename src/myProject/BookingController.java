package myProject;

public class BookingController {
    Trip trip;
    Account account;
    Database DB;

    public void addToCart(Booking b) {
        // done; bæta TripID, destination,Date og time inn í Cart
        //done ;Fækka í currentCapacity ef paymentConfirmed er true
        // done;Setja nafn og userID úr account inná passengerList
        //Button listener???
        if (b.getPaymentConfirmed() && !trip.isFullyBooked() && !trip.isCanceledTrip()) {
            int t = b.getNmbRes();
            trip.setCapacity(trip.getCapacity() - t);
            account.setCart(b.getTripUnit());
            DB.addPassengers(b);
        }

    }

    public void cancelBooking(Booking b) {
        //done;Hækkar aftur currentCapacity
        //núllar done;nmbRes og paymentconfirmed
        //done;Tekur nöfnin sem sett voru á passengerList út
        //done;Tekur út af cart
        //Button listener??
        int t = b.getNmbRes() * (-1);
        trip.setCapacity(trip.getCapacity() + t);
        account.getCart().remove(b);
        DB.addPassengers(b).remove(b.getAccountUnit());
    }
}
