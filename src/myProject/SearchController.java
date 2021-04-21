package myProject;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.Date;


public class SearchController {
    private Database DB = Database.getInstance();

    public ObservableList<Trip> getTripsByDestination(String destination) {
        ObservableList<Trip> returnList = FXCollections.observableArrayList();
        for (Trip t : DB.getAllTrips()) {
            if (t.getDestination().compareTo(destination) == 0) {
                returnList.add(t);
            }
        }
        return returnList;
    }

    public ObservableList<Trip> getTripsByCategory(String category) {
        ObservableList<Trip> returnList = FXCollections.observableArrayList();
        for (Trip t : DB.getAllTrips()) {
            if (t.getCategory().compareTo(category) == 0) {
                returnList.add(t);
            }
        }
        return returnList;
    }

    public ObservableList<Trip> getTripsByCategoryAndDestination(String category, String destination) {
        ObservableList<Trip> returnList = FXCollections.observableArrayList();
        for (Trip t : DB.getAllTrips()) {
            if (t.getCategory().compareTo(category) == 0 && t.getDestination().compareTo(destination) == 0) {
                returnList.add(t);
            }
        }
        return returnList;
    }

    public ObservableList<Trip> getTripsByDate(Date date) {
        ObservableList<Trip> returnList = FXCollections.observableArrayList();
        for (Trip t : DB.getAllTrips()) {
            if (t.getDate().compareTo(date) == 0) {
                returnList.add(t);
            }
        }
        return returnList;
    }

    public ObservableList<Trip> getTripsByDestinationAndDate(String destination, Date date) {
        ObservableList<Trip> returnList = FXCollections.observableArrayList();
        for (Trip t : DB.getAllTrips()) {
            if (t.getDestination().compareTo(destination) == 0 && t.getDate().compareTo(date) == 0) {
                returnList.add(t);
            }
        }
        return returnList;
    }

    public ObservableList<Trip> getTripsByCategoryAndDate(String category, Date date) {
        ObservableList<Trip> returnList = FXCollections.observableArrayList();
        for (Trip t : DB.getAllTrips()) {
            if (t.getCategory().compareTo(category) == 0 && t.getDate().compareTo(date) == 0) {
                returnList.add(t);
            }
        }
        return returnList;
    }

    public ObservableList<Trip> getTripsByDestinationCategoryAndDate(String destination, String category, Date date) {
        ObservableList<Trip> returnList = FXCollections.observableArrayList();
        for (Trip t : DB.getAllTrips()) {
            if (t.getDestination().compareTo(destination) == 0 && t.getCategory().compareTo(category) == 0 && t.getDate().compareTo(date) == 0) {
                returnList.add(t);
            }
        }
        return returnList;
    }

    public PaymentInfo getPaymentInfoByUserID(String ID) {
        PaymentInfo payInfo1 = new PaymentInfo("2107002260", "03/10", "2222 3333 4444 5555", "131");
        if (ID.equals(payInfo1.getUserID())) {
            return payInfo1;
        } else return null;

    }

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
