
class Car{
    void color(){
        System.out.println("Car has blue color!");
    }
}
class RangRover extends Car{
    void drive(){
        System.out.println("Driving Rang Rover!");
    }
}
class BMW extends RangRover{
    void charge(){
        System.out.println("My is car a electric car");
    }
}
public class MuiltiLevel {
    public static void main(String[] args) {
        BMW b = new BMW();
        b.color();
        b.drive();
        b.charge();
    }
}
