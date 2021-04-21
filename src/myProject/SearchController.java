package myProject;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.Date;


public class SearchController {
    private Database DB = Database.getInstance();

    //Usage: getTripsByDestination(String s)
    //Before: Nothing
    //After: Returns a list of Trips that collectively have the same destination as was searched for.
    public ObservableList<Trip> getTripsByDestination(String destination) {
        ObservableList<Trip> returnList = FXCollections.observableArrayList();
        for (Trip t : DB.getAllTrips()) {
            if (t.getDestination().compareTo(destination) == 0) {
                returnList.add(t);
            }
        }
        return returnList;
    }

    //Usage: getTripsByCategory(String s)
    //Before: Nothing
    //After: Returns a list of Trips that collectively have the same category as was searched for.
    public ObservableList<Trip> getTripsByCategory(String category) {
        ObservableList<Trip> returnList = FXCollections.observableArrayList();
        for (Trip t : DB.getAllTrips()) {
            if (t.getCategory().compareTo(category) == 0) {
                returnList.add(t);
            }
        }
        return returnList;
    }

    //Usage: getTripsByCategoryAndDestination(String a, String b)
    //Before: Nothing
    //After: Returns a list of Trips that collectively have the same category and destination as was searched for.
    public ObservableList<Trip> getTripsByCategoryAndDestination(String category, String destination) {
        ObservableList<Trip> returnList = FXCollections.observableArrayList();
        for (Trip t : DB.getAllTrips()) {
            if (t.getCategory().compareTo(category) == 0 && t.getDestination().compareTo(destination) == 0) {
                returnList.add(t);
            }
        }
        return returnList;
    }

    //Usage: getTripsbyDate(Date d)
    //Before: Nothing
    //After: Returns a list of Trips that collectively have the same date as was searched for.
    public ObservableList<Trip> getTripsByDate(Date date) {
        ObservableList<Trip> returnList = FXCollections.observableArrayList();
        for (Trip t : DB.getAllTrips()) {
            if (t.getDate().compareTo(date) == 0) {
                returnList.add(t);
            }
        }
        return returnList;
    }

    //Usage: getTripsByDestinationAndDate(String s, Date d)
    //Before: Nothing
    //After: Returns a list of Trips that collectively have the same destination and date as was searched for.
    public ObservableList<Trip> getTripsByDestinationAndDate(String destination, Date date) {
        ObservableList<Trip> returnList = FXCollections.observableArrayList();
        for (Trip t : DB.getAllTrips()) {
            if (t.getDestination().compareTo(destination) == 0 && t.getDate().compareTo(date) == 0) {
                returnList.add(t);
            }
        }
        return returnList;
    }

    //Usage: getTripsByCategoryAndDate(String s, Date d)
    //Before: Nothing
    //After: Returns a list of Trips that collectively have the same category and date as was searched for.
    public ObservableList<Trip> getTripsByCategoryAndDate(String category, Date date) {
        ObservableList<Trip> returnList = FXCollections.observableArrayList();
        for (Trip t : DB.getAllTrips()) {
            if (t.getCategory().compareTo(category) == 0 && t.getDate().compareTo(date) == 0) {
                returnList.add(t);
            }
        }
        return returnList;
    }

    //Usage: getTripsByDestinationCategoryAndDate(String s, String c, Date d)
    //Before: Nothing
    //After: Returns a list of Trips that collectively have the same destination, category and date as was searched for.
    public ObservableList<Trip> getTripsByDestinationCategoryAndDate(String destination, String category, Date date) {
        ObservableList<Trip> returnList = FXCollections.observableArrayList();
        for (Trip t : DB.getAllTrips()) {
            if (t.getDestination().compareTo(destination) == 0 && t.getCategory().compareTo(category) == 0 && t.getDate().compareTo(date) == 0) {
                returnList.add(t);
            }
        }
        return returnList;
    }

    //Usage: getPaymentInfoByUserID(String s)
    //Before: Nothing
    //After: Returns a list containing the PaymentInfo for an account ID we searched for.
    public ObservableList<PaymentInfo> getPaymentInfoByUserID(String ID) {
        ObservableList<PaymentInfo> returnList = FXCollections.observableArrayList();
        for (Account a : DB.getAllAccounts()) {
            if (a.getUserID().compareTo(ID) == 0) {
                returnList.add(a.getPayInfo());
            }
        }
        return returnList;
    }

    //Usage: getAccountByIDandPassword(String s, String p)
    //Before: Nothing
    //After: Returns a list containing the account object that matches the ID and password that was searched for.
    public ObservableList<Account> getAccountByIDandPassword(String ID, String password) {
        ObservableList<Account> returnList = FXCollections.observableArrayList();
        for (Account a : DB.getAllAccounts()) {
            if (a.getUserID().compareTo(ID) == 0 && a.getPassword().compareTo(password) == 0) {
                returnList.add(a);
            } else return null;
        }
        return returnList;
    }
}
