package myProject;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class SearchController {
    private Database DB; // Þarf ég ekki að kalla allt í Database eða á ég að kalla allt í trip?

    // Er þetta ekki hér?
    /*private ObservableList<Book> getReservedBooks(User user){
        ObservableList<Book> reservedBooks = FXCollections.observableArrayList();
        ArrayList<Reservation> reservations = user.getReservations();
        for(Reservation reservation: reservations){
            reservedBooks.add(reservation.getBook());
        }
        return reservedBooks;
    }*/

    // Ef svo ætti þetta ekki þá að vera svona?
    private ObservableList<Database> getTrip(trip trip) {
        ObservableList<trip> bookedTrip = FXCollections.observableArrayList();
        ArrayList<Databae> trips = user.getTrip();
        for (Trip t : trips) {
            bookedTrip.add(trip.getTrip());
        }
        return bookedTrip;
    }
}
