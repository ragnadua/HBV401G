package myProject;

public class PaymentInfo {

    private String userID;
    private String expDate;
    private String cardNumber;
    private int ccv;

    public PaymentInfo(String userID, String expDate, String cardNumber, int ccv) {
        this.userID = userID;
        this.expDate = expDate;
        this.cardNumber = cardNumber;
        this.ccv = ccv;
    }

    public String getUserID() {
        return userID;
    }

    public String getExpDate() {
        return expDate;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public int getCcv() {
        return ccv;
    }

    public void setCcv(int ccv) {
        this.ccv = ccv;
    }
}
