package myProject;

//import com.sun.org.apache.xpath.internal.operations.String;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;

public class Database {
    public Database() {
    }

    public ArrayList<Trip> getTrip() {
        ArrayList<Trip> trips = new ArrayList<>();
        Trip.add(new Trip("Ísafjörður", "Hiking"));
        Trip.add(new Trip("Reykjavík", "Skiing"));
        Trip.add(new Trip("Ísafjörður", "City tour"));
        Trip.add(new Trip("Eigilsstaðir", "Sailing"));
        Trip.add(new Trip("Akureyri", "City tour"));
        return trip;
    }

    public ObservableList<trip> getDestination() {
        ObservableList<trip> destination = FXCollections.observableArrayList();
        trip dest1 = new trip("Reykjavík");
        trip dest2 = new trip("Akureyri");
        trip dest3 = new trip("Ísafjörður");
        trip dest4 = new trip("Egisstaðir");
        trip.add(dest1);
        trip.add(dest2);
        trip.add(dest3);
        trip.add(dest4);
        return destination;
    }

    public ObservableList<trip> getCategory() {
        ObservableList<trip> category = FXCollections.observableArrayList();
        trip cat1 = new trip("Skiing");
        trip cat2 = new trip("Hiking");
        trip cat3 = new trip("City tour");
        trip cat4 = new trip("Sailing");
        trip.add(cat1);
        trip.add(cat2);
        trip.add(cat3);
        trip.add(cat4);
        return category;
    }

<<<<<<< HEAD
    public ObservableList<Account> getAccounts() {
=======
    public static void main(String[] args) {
        int maxReservations = 30;
        int minReservations = 10;
        if (nmbRes = maxReservations) {
            System.out.println("Is fully Booked");
        }
    }

    public ObservableList<account> getAccounts() {
<<<<<<< HEAD
>>>>>>> parent of e96b215 (sun2)
=======
>>>>>>> parent of e96b215 (sun2)
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

    public account getPaymentInfoByUserID(String ID) {
        account payInfo1 = new account("2107002260", "03/10", "2222 3333 4444 5555", "131");

    }

    {
        account account1 = new account("2107002260", "Ragna", "Thorsdottir", "123", "rdt1@hi.is", "8637809", payInfo1, cart1);
        String ID2 = account1.getUserID();
        String pw2 = account1.getPassword();
        if (ID.equals(ID2) && password.equals(pw2))
            return account1;
        else return null;
    }

    public trip getTripByDestination(String d) {
        if (d == trip1.getDestination())
            return trip1;
        else if (d == trip2.getDestination())
            return trip2;
        else if (d == trip3.getDestination())
            return trip3;
        else if (d == trip4.getDestination())
            return trip4;
        else
            System.out.println("Not avalible");
    }

    public trip getTripByCategory(String c) {
        if (c == trip1.getCategory())
            return trip1;
        else if (c == trip2.getCategory())
            return trip2;
        else if (c == trip3.getCategory())
            return trip3;
        else if (c == trip4.getCategory())
            return trip4;
    }

}
