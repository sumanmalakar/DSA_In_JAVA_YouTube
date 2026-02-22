class Bank {
    double rateOfInterest = 6.9;
    double Balance;
    void show() {
        System.out.println("showing bank details");
    }
    Bank(double b) {
        Balance = b;
    }
}
class HDFC extends Bank {
    double rateOfInterest = 7.9;
    HDFC(double b){
        super(b);
    }
    void show() {
        super.show();
        System.out.println(super.rateOfInterest);
        System.out.println("Balance = "+Balance);
    }
}
public class Super_Key {
    public static void main(String[] args) {
        HDFC h = new HDFC(888232.2);
        h.show();
    }
}
