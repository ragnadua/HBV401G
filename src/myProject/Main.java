package myProject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Main {

    private SearchController sc = new SearchController();
    private AccountController ac = new AccountController();
    private TripController tc = new TripController();
    private Database db = Database.getInstance();

    //Usage: run(String[] args);
    //Before: Nothing
    //After: Takes in arguments and based on the input it executes
    //       different lines and prints out lines when called.
    public void run(String[] args) throws ParseException {

        db.generateData();
        ArrayList<Trip> listi1 = new ArrayList<Trip>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        ArrayList<Booking> listi2 = new ArrayList<Booking>();

        // Searching for a day trip based on either destination or a category
        if (args.length == 1) {
            for (Trip a : db.getAllTrips()) {
                if (args[0].compareTo(a.getDestination()) == 0 || args[0].compareTo(a.getCategory()) == 0) {
                    listi1.addAll(sc.getTripsByDestination(args[0]));
                    listi1.addAll(sc.getTripsByCategory(args[0]));
                    System.out.println(listi1);
                }
            }

            // Searching for a day trip based on both destination and category
        } else if (args.length == 2) {
            for (Trip b : db.getAllTrips()) {
                if (args[0].compareTo(b.getDestination()) == 0 && args[1].compareTo(b.getCategory()) == 0) {
                    listi1.addAll(sc.getTripsByCategoryAndDestination(args[1], args[0]));
                    System.out.println(listi1);
                }
            }
        }
        // Adding a new account to the Database
        if (args.length == 8) {
            db.AddAccount(ac.newAccount(args[0], args[1], args[2], args[3], args[4], args[5], null, null));
            System.out.println(db.getAllAccounts());
        }


        // Booking a trip with a destination, category and number of "seats" as the input
        if (args.length == 3) {
            Account adgangur = db.getAllAccounts().get(0);

            for (Trip b : db.getAllTrips()) {
                if (args[0].compareTo(b.getDestination()) == 0 && args[1].compareTo(b.getCategory()) == 0) {
                    listi1.addAll(sc.getTripsByCategoryAndDestination(args[1], args[0]));
                }
            }
            Trip triptobook = listi1.get(2);
            Booking bokun = new Booking(triptobook, adgangur, true, 10, true, Integer.parseInt(args[2]));
            if (bokun.book()) {
                System.out.println("Booking confirmed");
            } else
                System.out.println("Booking failed");
            db.AddBooking(bokun);
        }

        //Creating a new Trip
        if (args.length == 12) {
            tc.createTrip(args[0], args[1], sdf.parse(args[2]), args[3], Integer.parseInt(args[4]),
                    Integer.parseInt(args[5]), Boolean.parseBoolean(args[6]),
                    args[7], null, Integer.parseInt(args[9]), Boolean.parseBoolean(args[10]), Integer.parseInt(args[11]));
            System.out.println(db.getAllTrips());
        }
        

    }

    //Usage: main(String[] args)
    //Before: Nothing
    //After: Runs the run(String[]args) function with the input arguments.
    public static void main(String[] args) throws ParseException {
        Main mini = new Main();
        mini.run(args);
    }

}
