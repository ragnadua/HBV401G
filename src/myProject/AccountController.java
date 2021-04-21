package myProject;

import javafx.collections.ObservableList;

public class AccountController {
    private SearchController SC;


    //Usage: newAccount(String a, String b, String c, String d, String e, String f,
    //                                          String g, PaymentInfo p, ObservableList<Booking> h);
    //Before: Nothing.
    //After: A new Account object is made and ready to be added to a Database.
    public Account newAccount(String userID, String firstName, String lastName, String password, String email,
                              String phoneNumber, PaymentInfo payInfo, ObservableList<Booking> cart) {
        Account accountUser = new Account(userID, firstName, lastName, password, email, phoneNumber, payInfo, cart);
        return accountUser;
    }

    //Usage: logIn(String s, String p);
    //Before: Nothing.
    //After: Returns True if the right userID and password were put in, else returns false.
    public boolean logIn(String userID, String password) {
        if (SC.getAccountByIDandPassword(userID, password).isEmpty() == false) {
            return true;
        } else return false;

    }

}
