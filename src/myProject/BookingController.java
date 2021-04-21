package myProject;

public class BookingController {
    private Trip trip;
    private Account account;

    //Usage: addToCart(Booking b);
    //Before: Nothing.
    //After: A booking is added to cart if a booking can be and is made,
    //       otherwise the method prints out a fail statement.
    public void addToCart(Booking b) {
        if (b.book()) {
            account.setCart(b);
            System.out.println("Booking added to cart");
        } else System.out.println("Failed adding to cart");
    }

    //Usage: cancelBooking(Booking b);
    //Before: A booking has been made and added to cart.
    //After: The booking that was made has been taken out of the
    //       cart and capacity restored according to how many seats the person who cancelled reserved
    public void cancelBooking(Booking b) {
        int t = b.getNmbRes();
        b.getTripUnit().setCapacity(b.getTripUnit().getCapacity() + t);
        b.getAccountUnit().getCart().remove(b);
    }
}
