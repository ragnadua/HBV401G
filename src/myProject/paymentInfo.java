package myProject;

public class paymentInfo {

    private String userID;
    private String expDate;
    private String cardNumber;
    private int ccv;

    public paymentInfo(String userID, String expDate, String cardNumber, int ccv) {
        this.userID = userID;
        this.expDate = expDate;
        this.cardNumber = cardNumber;
        this.ccv = ccv;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCcv() {
        return ccv;
    }

    public void setCcv(int ccv) {
        this.ccv = ccv;
    }
}
