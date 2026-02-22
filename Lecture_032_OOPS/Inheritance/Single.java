class Car{
    void color(){
        System.out.println("Car has blue color!");
    }
}
class BMW extends Car{
    void price(){
        System.out.println("BMW price = $982992");
    }
}
public class Single {
    public static void main(String[] args) {
        BMW b = new BMW();
        b.color();
        b.price();
    }
}
