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
        return Trip;
    }

    public ObservableList<Trip> getDestination() {
        ObservableList<Trip> destination = FXCollections.observableArrayList();
        Trip dest1 = new Trip("Reykjavík");
        Trip dest2 = new Trip("Akureyri");
        Trip dest3 = new Trip("Ísafjörður");
        Trip dest4 = new Trip("Egisstaðir");
        Trip.add(dest1);
        Trip.add(dest2);
        Trip.add(dest3);
        Trip.add(dest4);
        return destination;
    }

    public ObservableList<Trip> getCategory() {
        ObservableList<Trip> category = FXCollections.observableArrayList();
        Trip cat1 = new Trip("Skiing");
        Trip cat2 = new Trip("Hiking");
        Trip cat3 = new Trip("City tour");
        Trip cat4 = new Trip("Sailing");
        Trip.add(cat1);
        Trip.add(cat2);
        Trip.add(cat3);
        Trip.add(cat4);
        return category;
    }

<<<<<<<HEAD

    public ObservableList<Account> getAccounts() {
=======
        public static void main (String[]args){
            int maxReservations = 30;
            int minReservations = 10;
            if (nmbRes = maxReservations) {
                System.out.println("Is fully Booked");
            }
        }

        public ObservableList<Account> getAccounts () {
>>>>>>>parent of e96b215(sun2)
            //Create an empty Observable list that we will fill with data
            ObservableList<Account> Accounts = FXCollections.observableArrayList();
            Account account1 = new Account("2107002260", "Ragna", "Thorsdottir", "123", "rdt1@hi.is", "8637809", payInfo1, cart1);


            //ArrayList<trip> trips = getTrip(); //Get available books

            // Set up reservations for each user using the available books
            ArrayList<Booking> bookings1 = new ArrayList<>(); //Empty reservation list to be filled
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
            Accounts.add(account1);
            return Accounts;


        }

    /*private ArrayList<trip> getTrip() {
        ArrayList<trip> trips = new ArrayList<>();
        return trips;
    }*/

        public Account getAccountByIDandPassword (String ID, String password){
            Account account1 = new Account("2107002260", "Ragna", "Thorsdottir", "123", "rdt1@hi.is", "8637809", payInfo1, cart1);
            String ID2 = account1.getUserID();
            String pw2 = account1.getPassword();
            if (ID.equals(ID2) && password.equals(pw2))
                return account1;
            else return null;
        }

        public Account getPaymentInfoByUserID (String ID){
            Account payInfo1 = new Account("2107002260", "03/10", "2222 3333 4444 5555", "131");

        }

        {
            Account account1 = new Account("2107002260", "Ragna", "Thorsdottir", "123", "rdt1@hi.is", "8637809", payInfo1, cart1);
            String ID2 = account1.getUserID();
            String pw2 = account1.getPassword();
            if (ID.equals(ID2) && password.equals(pw2))
                return account1;
            else return null;
        }

        public Trip getTripByDestination (String d){
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

        public Trip getTripByCategory (String c){
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
