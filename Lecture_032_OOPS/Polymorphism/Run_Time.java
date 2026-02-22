class Bank{
    double rateOfInterest(){ return 6.9;}
}
class HDFC extends Bank{
    double rateOfInterest(){ return 7.9;}
}
class SBI extends Bank{
    double rateOfInterest(){ return 5.9;}
}
class PNB extends Bank{
    double rateOfInterest(){ return 7.5;}
}
public class Run_Time {
    public static void main(String[] args) {
        Bank b;
        b = new HDFC();
        System.out.println(b.rateOfInterest());
        b = new SBI();
        System.out.println(b.rateOfInterest());
        b = new PNB();
        System.out.println(b.rateOfInterest());
    }
}
