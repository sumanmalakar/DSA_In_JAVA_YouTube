class Car {
    String name;
    int speed;
    String color;

    void setData(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    void setData(String name, int speed, String color) {
        this.name = name;
        this.speed = speed;
        this.color = color;
    }

    void show() {
        System.out.println("Car Name = " + this.name);
        System.out.println("Car Speed = " + this.speed);
        if (color != null)
            System.out.println("Car color = " + color);

    }
}

public class Index {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.setData("BMW", 200);
        c1.show();
        Car c2 = new Car();
        c2.setData("Rang Rover", 350,"Red");
        c2.show();
    }
}
