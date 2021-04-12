package myProject;

//import com.sun.org.apache.xpath.internal.operations.String;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.time.LocalDate;
import java.util.ArrayList;

public class Database {
    public Database() {
    }

    public ArrayList<Trip> getTrip() {
        ArrayList<Trip> trip = new ArrayList<>();
        trip.add(new Trip("Ísafjörður", "Hiking", LocalDate.of(2021, 8, 8), time));
        trip.add(new Trip("Reykjavík", "City tour", LocalDate.of(2021, 8, 8), time));
        trip.add(new Trip("Ísafjörður", "City tour", LocalDate.of(2021, 8, 8), time));
        trip.add(new Trip("Eigilsstaðir", "Sailing", LocalDate.of(2021, 8, 8), time));
        trip.add(new Trip("Akureyri", "Skiing", "2021, 8, 8", "08:00"));
        return trip;
    }

    public ObservableList<Trip> getDate() {
        ObservableList<Trip> date = FXCollections.observableArrayList();
        Trip date1 = new Trip("2021, 8, 8");
        Trip date2 = new Trip("2021, 6, 15");
        Trip date3 = new Trip("2021, 7, 5");
        Trip date4 = new Trip("2021, 7, 20");
        date.add(date1);
        date.add(date2);
        date.add(date3);
        date.add(date4);
        return date;

    }

    public ObservableList<Trip> getTime() {
        ObservableList<Trip> time = FXCollections.observableArrayList();
        Trip time1 = new Trip("08:00");
        Trip time2 = new Trip("12:00");
        Trip time3 = new Trip("16:00");
        time.add(time1);
        time.add(time2);
        time.add(time3);
        return time;
    }

    public ObservableList<Trip> getDestination() {
        ObservableList<Trip> destination = FXCollections.observableArrayList();
        Trip dest1 = new Trip("Reykjavík");
        Trip dest2 = new Trip("Akureyri");
        Trip dest3 = new Trip("Ísafjörður");
        Trip dest4 = new Trip("Egilsstaðir");
        destination.add(dest1);
        destination.add(dest2);
        destination.add(dest3);
        destination.add(dest4);
        return destination;
    }

    public ObservableList<Trip> getCategory() {
        ObservableList<Trip> category = FXCollections.observableArrayList();
        Trip cat1 = new Trip("Skiing");
        Trip cat2 = new Trip("Hiking");
        Trip cat3 = new Trip("City tour");
        Trip cat4 = new Trip("Sailing");
        category.add(cat1);
        category.add(cat2);
        category.add(cat3);
        category.add(cat4);
        return category;
    }

    // eitthvað rugl, þarf að laga
    public ObservableList<Account> getAccount() {
        //Create an empty Observable list that we will fill with data
        ObservableList<Account> Account = FXCollections.observableArrayList();
        Account account1 = new Account("2107002260", "Ragna", "Thorsdottir", "123", "rdt1@hi.is", "8637809", payInfo1, cart1);
    }

    ArrayList<Booking> bookings1 = new ArrayList<>();


    public PaymentInfo getPaymentInfoByUserID(String ID) {
        PaymentInfo payInfo1 = new PaymentInfo("2107002260", "03/10", "2222 3333 4444 5555", "131");
        return PaymentInfo;
    }


    public Account getAccountByIDandPassword(String ID, String password) {
        Account account1 = new Account("2107002260", "Ragna", "Thorsdottir", "123", "rdt1@hi.is", "8637809", payInfo1, cart1);
        String ID2 = account1.getUserID();
        String pw2 = account1.getPassword();
        if (ID.equals(ID2) && password.equals(pw2))
            return account1;
        else return null;
    }

    /// Vitlaust, þarf að laga
    public Account getPaymentInfoByUserID(String payInfo) {
        Account payInfo1 = new Account("2107002260", "03/10", "2222 3333 4444 5555", "131");

    }

    public Trip getTripByDestination(String d) {
        if (d == dest1.getDestination())
            return dest1;
        else if (d == dest2.getDestination())
            return dest2;
        else if (d == dest3.getDestination())
            return dest3;
        else if (d == dest4.getDestination())
            return dest4;
        else
            System.out.println("Not avalible");
    }

    public Trip getTripByCategory(String c) {
        if (c == cat1.getCategory())
            return cat1;
        else if (c == cat2.getCategory())
            return cat2;
        else if (c == cat3.getCategory())
            return cat3;
        else if (c == cat4.getCategory())
            return cat4;
        else
            System.out.println("Not avalable");
    }
}
