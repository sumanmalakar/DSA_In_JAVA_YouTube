class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;

    }
    void coding() {
        System.out.println("Java coding!");
    }

    void show() {
        this.coding();
        System.out.println("Name = " + this.name);
        System.out.println("Age = " + this.age);
    }
}

public class This_Keyword {
    public static void main(String[] args) {
        Student s1 = new Student("suman", 25);
        s1.show();

    }
}
