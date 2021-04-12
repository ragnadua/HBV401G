package myProject;

public class Search {
    private Database DB;
    
    public Trip searchDestination(Trip dest) {
        // Veit ekki alveg hvernig á að framkvæma þetta
        if (dest == trip.getDestination()) {

        }
        if (trip.isFullyBooked() == true)
            return null;
        if (!searchDestination(dest))
            return null;
        return dest;
    }

    public Trip searchCategory(Trip category) {
        category = trip.getCategory();
        return category;
        if (!searchCategory(category)) {
            return null;
        }
    }

    public float searchDate(float date) {
        date = DB.getDate();
        return date;
        if (!searchDate(date)) {
            return null;
        }
    }

    public float searchTime(float time) {
        time = DB.getTime();
        return time;
        if (!searchTime(time)) {
            return null;
        }
    }
}
