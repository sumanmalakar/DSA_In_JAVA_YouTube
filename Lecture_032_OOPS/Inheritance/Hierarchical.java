class Car {
    void start() {
        System.out.println("Car started");
    }
}
class BMW extends Car{
    void drive(){
        System.out.println("Driving BMW");
    }
}
class RangRover extends Car{
    void show(){
        System.out.println("Dekho maine brand new Rang Rover li hai bhai");
    }
}
public class Hierarchical {
public static void main(String[] args) {
    BMW b = new BMW();
    b.drive(); b.start();
    RangRover r = new RangRover();
    r.show(); r.start();
}
}
