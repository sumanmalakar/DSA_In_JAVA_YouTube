class Car{ // parent
    int speed = 100;
    String color = "Red";
    void start(){
        System.out.println("Car has been Started!");
    }
}
class BMW extends Car{ // child
    int price = 99999;
    void show(){
        System.out.println(speed);
        System.out.println(color);
        System.out.println(price);
        start();
    }
}
public class Index {
    public static void main(String[] args) {
        BMW b = new BMW();
        b.show();
    }
}
