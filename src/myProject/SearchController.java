package myProject;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;

public class SearchController {
    private Trip trip;
    private Database DB;

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

    // Þarf að klára
    public ObservableList<Trip> GetTripsByTimeAndDate(String category) {
        ObservableList<Trip> returnList = FXCollections.observableArrayList();
        for (Trip t : DB.getAllTrips()) {
            if (t.getCategory().compareTo(category) == 0) {
                returnList.add(t);
            }
        }
        return returnList;
    }
}
