package myProject;

//import com.sun.org.apache.xpath.internal.operations.String;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Database {
    private ObservableList<Trip> allTrips = FXCollections.observableArrayList();
    private ObservableList<Account> allAccounts = FXCollections.observableArrayList();
    private ObservableList<Booking> allBookings = FXCollections.observableArrayList();

    public Database() {
        this.allTrips = getTrip();
        this.allAccounts = getAccount(); // Ragna þarf að hjálpa okkur
        this.allBookings = getBooking(); // Ragna þarf að hjálpa okkur
    }

    public void AddTrip(Trip t) {
        allTrips.add(t);
    }

    public ObservableList<Trip> getAllTrips() {
        return allTrips;
    }

    public void setAllTrips(ObservableList<Trip> allTrips) {
        this.allTrips = allTrips;
    }

    public void AddAccount(Account a) {
        allAccounts.add(a);
    }

    public ObservableList<Account> getAllAccounts() {
        return allAccounts;
    }

    public void setAllAccounts(ObservableList<Account> allAccounts) {
        this.allAccounts = allAccounts;

    }

    public ObservableList<Account> addPassengers(Booking b) {
        ObservableList<Account> passengers = FXCollections.observableArrayList();
        passengers.add(b.getAccountUnit());
        return passengers;
    }

    private ObservableList<Account> getAccount() {
        ObservableList<Account> accounts = FXCollections.observableArrayList();
        return accounts;
    }

    private ObservableList<Booking> getBooking() {
        ObservableList<Booking> bookings = FXCollections.observableArrayList();
        return bookings;
    }

    private ObservableList<Trip> getTrip() {
        ObservableList<Trip> trips = FXCollections.observableArrayList();
        /*trips.add(new Trip("Isafjordur", "Hiking", "2021, 8, 8", "08:00"));
        trips.add(new Trip("Reykjavik", "City tour", "2021, 8, 8", "12:00"));
        trips.add(new Trip("Isafjordur", "City tour", "2021, 8, 8", "16:00"));
        trips.add(new Trip("Egilsstadir", "Sailing", "2021, 8, 82", "16:00"));
        trips.add(new Trip("Akureyri", "Skiing", "2021, 8, 8", "08:00"));*/
        return trips;
    }

    private ObservableList<Trip> getDate() {
        ObservableList<Trip> dates = FXCollections.observableArrayList();
        Trip date1 = new Trip("2021, 8, 8");
        Trip date2 = new Trip("2021, 6, 15");
        Trip date3 = new Trip("2021, 7, 5");
        Trip date4 = new Trip("2021, 7, 20");
        dates.add(date1);
        dates.add(date2);
        dates.add(date3);
        dates.add(date4);
        return dates;

    }

    /*public void dateAndTime(String DAT) {
        String myDate = "2014/10/29 18:10:45";
        //creates a formatter that parses the date in the given format
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date time = sdf.parse(myDate);
        long timeInMillis = time.getDateAndTime();

    }*/


    private ObservableList<Trip> getTime() {
        ObservableList<Trip> times = FXCollections.observableArrayList();
        Trip time1 = new Trip("08:00");
        Trip time2 = new Trip("12:00");
        Trip time3 = new Trip("16:00");
        times.add(time1);
        times.add(time2);
        times.add(time3);
        return times;
    }

    private ObservableList<Trip> getDestination() {
        ObservableList<Trip> destinations = FXCollections.observableArrayList();
        Trip dest1 = new Trip("Reykjavik");
        Trip dest2 = new Trip("Akureyri");
        Trip dest3 = new Trip("Isafjordur");
        Trip dest4 = new Trip("Egilsstadir");
        destinations.add(dest1);
        destinations.add(dest2);
        destinations.add(dest3);
        destinations.add(dest4);
        return destinations;
    }

    private ObservableList<Trip> getCategory() {
        ObservableList<Trip> categories = FXCollections.observableArrayList();
        Trip cat1 = new Trip("Skiing");
        Trip cat2 = new Trip("Hiking");
        Trip cat3 = new Trip("City tour");
        Trip cat4 = new Trip("Sailing");
        categories.add(cat1);
        categories.add(cat2);
        categories.add(cat3);
        categories.add(cat4);
        return categories;
    }


    public ObservableList<PaymentInfo> getPaymentInfo(Account a) {
        ObservableList<PaymentInfo> paymentInfo = FXCollections.observableArrayList();
        paymentInfo.add(a.getPayInfo());
        return paymentInfo;
    }

   /* public PaymentInfo getPaymentInfoByUserID(String ID) {
        PaymentInfo payInfo1 = new PaymentInfo("2107002260", "03/10", "2222 3333 4444 5555", "131");
        if (ID.equals(payInfo1.getUserID())) {
            return payInfo1;
        } else return null;

    }


    public Account getAccountByIDandPassword(String ID, String password) {
        Account account1 = new Account("2107002260", "Ragna", "Thorsdottir", "123", "rdt1@hi.is", "8637809", null, null);
        String ID2 = account1.getUserID();
        String pw2 = account1.getPassword();
        if (ID.equals(ID2) && password.equals(pw2))
            return account1;
        else return null;
    }*/


}
