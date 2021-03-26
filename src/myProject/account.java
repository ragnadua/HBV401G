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
    private paymentInfo payInfo = new paymentInfo();
    private ArrayList cart;
    private int tal;

    public String setUserID(String s) {
        s = userID;
        return s;
        //Get username pane content
    }

    public String setPassword(String s) {
        s = password;
        return s;
    }

    public String setEmail(String s) {
        s = email;
        return s;
    }

    public String setPhoneNumber(String s) {
        s = phoneNumber;
        return s;
    }

    public ArrayList setCart(List l) {
        // á að uppfæra cart eftir að bookingController gerir addToCart()
        l = cart;
        return l;


    }

    public paymentInfo setPayInfo(paymentInfo p) {
        p = payInfo;
        return p;
    }

}
