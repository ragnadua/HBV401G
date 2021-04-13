package myProject;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.text.SimpleDateFormat;
import java.util.Date;


public class SearchController {
    private Trip trip;
    private Database DB;
    private SimpleDateFormat sdf;

    public ObservableList<Trip> GetTripsByDestination(String destination) {
        ObservableList<Trip> returnList = FXCollections.observableArrayList();
        for (Trip t : DB.getAllTrips()) {
            if (t.getDestination().compareTo(destination) == 0) {
                returnList.add(t);
            }
        }
        return returnList;
    }

    public ObservableList<Trip> GetTripsByCategory(String category) {
        ObservableList<Trip> returnList = FXCollections.observableArrayList();
        for (Trip t : DB.getAllTrips()) {
            if (t.getCategory().compareTo(category) == 0) {
                returnList.add(t);
            }
        }
        return returnList;
    }

    public ObservableList<Trip> GetTripsByCategoryAndDestination(String category, String destination) {
        ObservableList<Trip> returnList = FXCollections.observableArrayList();
        for (Trip t : DB.getAllTrips()) {
            if (t.getCategory().compareTo(category) == 0 && t.getDestination().compareTo(destination) == 0) {
                returnList.add(t);
            }
        }
        return returnList;
    }

    public ObservableList<Trip> GetTripsByDate(Date date) {
        ObservableList<Trip> returnList = FXCollections.observableArrayList();
        for (Trip t : DB.getAllTrips()) {
            if (t.getDate().compareTo(date) == 0) {
                returnList.add(t);
            }
        }
        return returnList;
    }

    public ObservableList<Trip> GetTripsByDestinationAndDate(String destination, Date date) {
        ObservableList<Trip> returnList = FXCollections.observableArrayList();
        for (Trip t : DB.getAllTrips()) {
            if (t.getDestination().compareTo(destination) == 0 && t.getDate().compareTo(date) == 0) {
                returnList.add(t);
            }
        }
        return returnList;
    }

    public ObservableList<Trip> GetTripsByCategoryAndDate(String category, Date date) {
        ObservableList<Trip> returnList = FXCollections.observableArrayList();
        for (Trip t : DB.getAllTrips()) {
            if (t.getCategory().compareTo(category) == 0 && t.getDate().compareTo(date) == 0) {
                returnList.add(t);
            }
        }
        return returnList;
    }

    public ObservableList<Trip> GetTripsByDestinationCategoryAndDate(String destination, String category, Date date) {
        ObservableList<Trip> returnList = FXCollections.observableArrayList();
        for (Trip t : DB.getAllTrips()) {
            if (t.getDestination().compareTo(destination) == 0 && t.getCategory().compareTo(category) == 0 && t.getDate().compareTo(date) == 0) {
                returnList.add(t);
            }
        }
        return returnList;
    }
}
