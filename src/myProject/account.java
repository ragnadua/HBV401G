package myProject;

import java.util.ArrayList;
import java.util.List;

public class account {
    private String userID;
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private String phoneNumber;
    private paymentInfo payInfo;
    private ArrayList cart;

    public String setUserID(String s) {
        //Get username pane content
    }

    public String setPassword(String s) {

    }

    public String setEmail(String s) {

    }

    public String setPhoneNumber(String s) {

    }

    public ArrayList setCart(List l) {
        // á að uppfæra cart eftir að bookingController gerir addToCart()

    }

    public paymentInfo setPayInfo(paymentInfo p) {
        p = payInfo;
        return p;
    }

}
