abstract class Car{
   abstract void Speed();
   abstract void color();
   void print(){
    System.out.println("coding");
   }
}

class BMW extends Car{
    void Speed(){
        System.out.println("BMW top speed = 250km");
    }
    void color(){
        System.out.println("BMW has blue color");
    }
}

public class Index {
    public static void main(String[] args) {
        Car c1 = new BMW();
        c1.Speed();
        c1.color();
        c1.print();
    }
}
