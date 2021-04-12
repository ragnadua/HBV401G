package myProject;

public class Search {
    private Database DB;

    public String searchDestination(String dest) {
        // Veit ekki alveg hvernig á að framkvæma þetta
        if (dest == DB.getDestination()) {
            return dest;
        }
        return dest;
    }

    public String searchCategory(String category) {
        category = DB.getCategory();
        return category;
    }

    public String searchDate(String date) {
        date = DB.getDate();
        return date;
        if (!searchDate(date)) {
            return null;
        }
    }

    public String searchTime(String time) {
        time = DB.getTime();
        return time;
        if (!searchTime(time)) {
            return null;
        }
    }
}
