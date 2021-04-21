package myProject;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;


public class Database {
    private ObservableList<Trip> allTrips;
    private ObservableList<Account> allAccounts;
    private ObservableList<Booking> allBookings;

    private static Database DBSingleton = null;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private static final Date invalidDate = new Date(0);

    private Database() {
        this.allTrips = getTrip();
        this.allAccounts = getAccount();
        this.allBookings = getBooking();

    }

    public static Database getInstance() {
        if (DBSingleton == null) {
            DBSingleton = new Database();
        }
        return DBSingleton;
    }

    //Notkun generateData();
    //Fyrir: Ekkert
    //Eftir: Gögn verda til i Database klasanum
    public void generateData() {

        //Buum til TripData
        String[] stadsetning = {"Reykjavik", "Akureyri", "Egilsstadir", "Isafjordur"};
        String[] host = {"abc@abc.com", "ballibumba@bumbuferdir.is", "visiticeland@icelandtrips.is",
                "niceland@niceland.is", "mosi@mositrips.is"};
        Date[] dags = new Date[31];
        for (int i = 0; i < 31; i++) {
            dags[i] = fromStringToDate(i + 1 + "/05/2021");
        }
        String[] flokkur = {"Hiking", "Sailing", "Skiing", "Biking", "City Tour"};
        int max = 10;
        int min = 3;
        int[] verd = {50, 100, 150, 200, 250, 300};

        // For lykkja sem byr til 30 random Trip hluti
        int cnt = 0;
        for (Date d : dags) {
            for (String stadur : stadsetning) {
                for (String ferd : flokkur) {
                    if (Math.random() < 0.6) {
                        AddTrip(new Trip(String.valueOf(cnt), stadur, d, host[cnt % 5], max, min, false, flokkur[cnt % 5], null, false, verd[cnt % 6]));
                        cnt++;
                    }
                }
            }
        }
        //Buum til AccountData:
        String[] kennitala = {"2107002260", "0311002590", "0101012250", "1010702669", "1001002000"};
        String[] fornafn = {"Ragna", "Inga", "Erna", "Emilía", "Ragnar"};
        String[] eftirnafn = {"Thorsdottir", "Asgeirsdottir", "Gunnarsdottir", "Rafnsdottir", "Bender"};
        String[] lykilord = {"123", "abc", "blom", "gluggi345", "tre"};
        String[] netfang = {"rdt1hi.is", "ila7@hi.is", "egg25@hi.is", "eor5@hi.is", "rthb2@hi.is"};
        String[] simi = {"8637809", "6813866", "7724586", "8772435", "5520051"};
        PaymentInfo[] kortaupp = {new PaymentInfo(kennitala[0], "07/24", "4162333344445555", "123"),
                new PaymentInfo(kennitala[1], "08/22", "1111222255556666", "808"),
                new PaymentInfo(kennitala[2], "01/25", "3113444472278998", "420"),
                new PaymentInfo(kennitala[3], "10/30", "4030403040304030", "666"),
                new PaymentInfo(kennitala[4], "11/09", "6666000066660000", "101")};
        // Non-functional cart item 
        ArrayList[] kerra = {null};


        //For-lykkja sem byr til 5 Account hluti:
        for (int i = 0; i < 5; i++) {
            AddAccount(new Account(kennitala[i], fornafn[i], eftirnafn[i], lykilord[i], netfang[i],
                    simi[i], kortaupp[i], null));
        }

        //Buum til BookingData:
        float[] afslattur = {100, 10, 20};
        int[] saeti = {1, 2, 3, 4};
        Random rn = new Random();


    }

    private Date fromStringToDate(String s) {
        try {
            return sdf.parse(s);
        } catch (ParseException e) {
            return invalidDate;
        }
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

    public void AddBooking(Booking b) {
        allBookings.add(b);
    }

    public ObservableList<Booking> getAllBookings() {
        return allBookings;
    }

    public void setAllBookings(ObservableList<Booking> allBookings) {
        this.allBookings = allBookings;

    }

    public ObservableList<Account> addPassengers(Booking b) {
        ObservableList<Account> passengers = FXCollections.observableArrayList();
        passengers.add(b.getAccountUnit());
        return passengers;
    }

    public ObservableList<PaymentInfo> getPaymentInfo(Account a) {
        ObservableList<PaymentInfo> payInfo = FXCollections.observableArrayList();
        payInfo.add(a.getPayInfo());
        return payInfo;
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
        return trips;
    }

    public static void main(String[] args) {
        Database data = Database.getInstance();
        data.generateData();
        for (Trip t : data.getAllTrips()) {
            System.out.println(t.toString());
        }
        Account adgangur = data.getAllAccounts().get(0);
        adgangur.setPayInfo(new PaymentInfo(adgangur.getUserID(), "08/22", "1111222255556666", "808"));
        Trip triptobook = data.getAllTrips().get(0);
        Booking bokun = new Booking(triptobook, adgangur, true, 10, true, 10);
        if (bokun.book()) {
            System.out.println("Booking confirmed");
        } else
            System.out.println("Booking failed");


        Booking bokun2 = new Booking(triptobook, adgangur, true, 10, true, 50);
        if (bokun2.book()) {
            System.out.println("Booking confirmed");
        } else
            System.out.println("Booking failed");
    }
}
