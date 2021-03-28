package myProject;

//import com.sun.org.apache.xpath.internal.operations.String;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;

public class Database {
    public Database() {
    }

    public ObservableList<account> getAccounts() {
        //Create an empty Observable list that we will fill with data
        ObservableList<account> accounts = FXCollections.observableArrayList();
        account account1 = new account("2107002260", "Ragna", "Thorsdottir", "123", "rdt1@hi.is", "8637809", payInfo1, cart1);


        //ArrayList<trip> trips = getTrip(); //Get available books

        // Set up reservations for each user using the available books
        ArrayList<booking> bookings1 = new ArrayList<>(); //Empty reservation list to be filled
        // books.get(0) Gets the 0th entry (e.g. The Great Gatsby) and .getID() gets that books ID.
        // similar for user
        // bookings1.add(new booking(trips.get(0), account1));

        //account1.setCart(bookings1);

        // Do the same for the 2nd user
        //ArrayList<Reservation> reservations2 = new ArrayList<>(); //Empty reservation list to be filled
        // books.get(0) Gets the 0th entry (e.g. The Great Gatsby) and .getID() gets that books ID.
        // similar for user
        //reservations2.add(new Reservation(books.get(2), user1));
        //user2.setReservations(reservations2);

        /*ArrayList<Reservation> reservations3 = new ArrayList<>();
        reservations3.add(new Reservation(books.get(1), user3));
        user3.setReservations(reservations3);*/

        // Now we have books available, reservations and users.
        accounts.add(account1);
        return accounts;


    }

    /*private ArrayList<trip> getTrip() {
        ArrayList<trip> trips = new ArrayList<>();
        return trips;
    }*/

    public account getAccountByIDandPassword(String ID, String password) {
        account account1 = new account("2107002260", "Ragna", "Thorsdottir", "123", "rdt1@hi.is", "8637809", payInfo1, cart1);
        String ID2 = account1.getUserID();
        String pw2 = account1.getPassword();
        if (ID.equals(ID2) && password.equals(pw2))
            return account1;
        else return null;
    }

}
