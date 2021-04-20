package myProject;

import java.util.ArrayList;

public class Main {

    private SearchController sc = new SearchController();
    private AccountController ac = new AccountController();
    private Database db = Database.getInstance();


    public void run(String[] args) {

        db.generateData();
        ArrayList<Trip> listi1 = new ArrayList<Trip>();

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
            adgangur.setPayInfo(new PaymentInfo(adgangur.getUserID(), "08/22", "1111222255556666", "808"));

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
        }
    }

    public static void main(String[] args) {
        Main mini = new Main();
        //String name = System.console().readLine();
        mini.run(args);
    }

}
