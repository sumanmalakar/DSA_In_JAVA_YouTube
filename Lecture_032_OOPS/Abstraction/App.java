interface payment{
    void pay(double amount);
}
class Gpay implements payment{
  public void pay(double amount){
        System.out.println("Amount = "+amount);
    }
}
class phonePay implements payment{
   public void pay(double amount){
        System.out.println("Amount = "+amount);
    } 
}
public class App {
    public static void main(String[] args) {
        payment p = new Gpay();
        p.pay(100.23);
        p = new phonePay();
        p.pay(200.3);
    }
}
