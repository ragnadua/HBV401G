package myProject;

public class booking {
    private trip tripUnit;
    private account accountUnit;
    private Boolean pickUp;
    private float price;
    private float discount;
    private Boolean paymentConfirmed;
    private int NmbRes;

    public trip getTripUnit(trip t) {

    }

    public account getAccountUnit(account a) {

    }

    public float setPrice(float f) {
        f = price;
        return f;
    }

    public float setDiscount(float f) {
        return (f / 100) * price;
    }

    public int setNmbRes(int t) {


    }


}
