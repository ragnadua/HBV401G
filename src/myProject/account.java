package myProject;

//import com.sun.org.apache.xpath.internal.operations.String;

import java.util.ArrayList;

public class account {
    private String userID;
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private String phoneNumber;
    private paymentInfo payInfo = new paymentInfo();
    private ArrayList cart;


    public account(String userID, String firstName, String lastName, String password, String email, String phoneNumber, paymentInfo payInfo, ArrayList cart) {
        this.userID = userID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.payInfo = payInfo;
        this.cart = cart;

    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public paymentInfo getPayInfo() {
        return payInfo;
    }

    public void setPayInfo(paymentInfo payInfo) {
        this.payInfo = payInfo;
    }

    public ArrayList getCart() {
        return cart;
    }

    public void setCart(ArrayList cart) {
        this.cart = cart;
    }

/*
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
    }*/

}
