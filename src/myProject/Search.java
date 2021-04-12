package myProject;

public class Search {
    private Database DB;

    public Trip searchDestination(Trip dest) {
        // Veit ekki alveg hvernig á að framkvæma þetta
        if (dest == DB.getDestination()) {
            return dest;
        }
        return dest;
    }

    public Database searchCategory(Database category) {
        category = DB.getCategory();
        return category;
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
