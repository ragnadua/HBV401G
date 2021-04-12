package myProject;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;

public class SearchController {
    private Trip trip;
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
    private ObservableList<Database> getTrip(Trip trip) {
        ObservableList<Trip> bookedTrip = FXCollections.observableArrayList();
        ArrayList<Database> trips = user.getTrip();
        for (Trip t : trips) {
            bookedTrip.add(Trip.getTrip());
        }
        return bookedTrip;
    }
}
