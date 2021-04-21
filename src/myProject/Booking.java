package myProject;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Booking {
    private Trip tripUnit;
    private Account accountUnit;
    private boolean pickUp;
    private float discount;
    private boolean paymentConfirmed;
    private int nmbRes;

    //Add-on for methods
    private PaymentInfo paymentInfo;

    //Constructor:
    public Booking(Trip tripUnit, Account accountUnit, boolean pickUp,
                   float discount, boolean paymentConfirmed, int nmbRes) {
        this.tripUnit = tripUnit;
        this.accountUnit = accountUnit;
        this.pickUp = pickUp;
        this.discount = discount;
        this.paymentConfirmed = paymentConfirmed;
        this.nmbRes = nmbRes;
        this.paymentInfo = accountUnit.getPayInfo();
    }

    public Trip getTripUnit() {
        return this.tripUnit;
    }

    public void setTripUnit(Trip tripUnit) {
        this.tripUnit = tripUnit;
    }

    public Account getAccountUnit() {
        return this.accountUnit;
    }

    public void setAccountUnit(Account accountUnit) {
        this.accountUnit = accountUnit;
    }

    public float getDiscount() {
        return discount;
    }

    public float setDiscount(float f) {
        float price = tripUnit.getPrice();
        this.discount = (f / 100) * price;
        return this.discount;
    }

    //Usage: reserveSpot();
    //Before: Nothing.
    //After: Reserves a spot on the trip, decreases the capacity of the trip.
    //       Returns true if the method was successful, returns false if the trip no longer has capacity.
    public boolean reserveSpot() {
        if (nmbRes > tripUnit.getCapacity()) {
            return false;
        }
        if (!tripUnit.getIsFullyBooked()) {
            tripUnit.setCapacity(tripUnit.getCapacity() - nmbRes);
            return true;
        } else return false;
    }

    public int getNmbRes() {
        return nmbRes;
    }

    public void setNmbRes(int nmbRes) {
        this.nmbRes = nmbRes;
    }

    //Usage: isPaymentConfirmed();
    //Before: Nothing.
    //After: If the cvv number of the card being used is a valid cvv number,
    //       this method returns true and payment is confirmed else it returns false.
    public boolean setPaymentConfirmed() {
        String regex = "^[0-9]{3}$";
        Pattern p = Pattern.compile(regex);
        String str = paymentInfo.getCvv();
        if (str == null) {
            return false;
        }
        Matcher m = p.matcher(str);
        this.paymentConfirmed = m.matches();
        return this.paymentConfirmed;
    }

    public boolean getPaymentConfirmed() {
        return paymentConfirmed;
    }

    public boolean isPickUp() {
        return pickUp;
    }

    public boolean setPickUp() {
        return this.pickUp;
    }

    //Bókar ferð, skilar true ef það tókst
    //Usage: book();
    //Before: Nothing.
    //After: Returns true if a booking can be made and is then
    //       consequently made, else it returns false and a booking was not made.
    public boolean book() {
        return setPaymentConfirmed() && reserveSpot();
    }

}
