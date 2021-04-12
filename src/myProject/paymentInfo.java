package myProject;

public class PaymentInfo {

    private String userID;
    private String expDate;
    private String cardNumber;
    private int ccv;

    public String setUserID(String s) {
        s = userID;
        return s;
    }

    public String setExpDate(String s) {
        s = expDate;
        return s;
    }

    public String setCardNumber(String s) {
        s = cardNumber;
        return s;
    }

    public int setCCV(int t) {
        t = ccv;
        return t;
    }
}
