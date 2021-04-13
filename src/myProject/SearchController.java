package myProject;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;

public class SearchController {
    private Trip trip;
    private Database DB;

    public ObservableList<Trip> GetTripsByDestination(String destination) {
        ObservableList<Trip> returnList = FXCollections.observableArrayList();
        for (Trip t : DB.getAllTrips()) {
            if (t.getDestination().compareTo(destination) == 0) {
                returnList.add(t);
            }
        }
        return returnList;
    }

    public ObservableList<Trip> GetTripsByCategory(String category) {
        ObservableList<Trip> returnList = FXCollections.observableArrayList();
        for (Trip t : DB.getAllTrips()) {
            if (t.getCategory().compareTo(category) == 0) {
                returnList.add(t);
            }
        }
        return returnList;
    }


    public ObservableList<Trip> getDestination(String s) {
        String dest = DB.getDestination().toString();
        if (dest.contentEquals(s)) {
            return DB.getTrip();

        } else return null;
    }

    public ObservableList<Trip> getCategory() {
        //Button listener med flokkum, skila lista af ferdum sem hafa thennan flokk
    }

    public ObservableList<Trip> getTime(String s) {
        //?Mogulega haegt ad gera thetta eins og category?
        String time = DB.getTime().toString();
        if (time.equals(s)) {
            return DB.getTrip().filtered();
        }
    }
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
