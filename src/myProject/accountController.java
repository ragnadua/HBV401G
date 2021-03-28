package myProject;

import java.util.ArrayList;

public class accountController {
    private account accountUser;

    public accountController() {

    }

    public accountController(account account) {
        this.accountUser = account;
    }


    public account newAccount(String userID, String firstName, String lastName, String password, String email,
                              String phoneNumber, paymentInfo payInfo, ArrayList cart) {
        accountUser = new account(userID, firstName, lastName, password, email, phoneNumber, payInfo, cart);
        return accountUser;
    }

    public account logIn(String userID, String password) {
        Database db = new Database();
        return db.getAccountByIDandPassword(userID, password);
    }


}
