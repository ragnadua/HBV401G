package myProject;

import java.util.ArrayList;

public class AccountController {
    private Account accountUser;

    public AccountController() {

    }

    public AccountController(Account account) {
        this.accountUser = account;
    }

    public Account newAccount(String userID, String firstName, String lastName, String password, String email,
                              String phoneNumber, paymentInfo payInfo, ArrayList cart) {
        accountUser = new Account(userID, firstName, lastName, password, email, phoneNumber, payInfo, cart);
        return accountUser;
    }

    public Account logIn(String userID, String password) {
        Database db = new Database();
        return db.getAccountByIDandPassword(userID, password);
    }


}
