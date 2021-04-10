package myProject;

public class Search {

    public String searchDestination(String dest) {
        dest = trip.getDestination();
        if (trip.isFullyBooked() == true)
            return null;
        if (!searchDestination(dest))
            return null;
        return dest;
    }

    public String searchCategory(String category) {
        category = trip.getCategory();
        return category;
        if (!searchCategory(category)) {
            return null;
        }
    }

    public float searchDate(float date) {
        date = trip.getDate();
        return date;
        if (!searchDate(date)) {
            return null;
        }
    }

    public flot searchTime(float time) {
        time = trip.getTime();
        return time;
        if (!searchTime(time)) {
            return null;
        }
    }
}
