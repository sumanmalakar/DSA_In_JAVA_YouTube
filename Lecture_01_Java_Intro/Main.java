class Student {
    String name;
    int age;
    float fees;

    Student(String n, int a, float f) {
        name = n;
        age = a;
        fees = f;
    }
    void display(){
        System.out.println("Name = "+name);
        System.out.println("age = "+age);
        System.out.println("fees = "+fees);
    }
}
class Main{
public static void main(String[] args) {
        // int a = 10;
        Student s1 = new Student("ram", 18, 24.5f);
        Student s2 = new Student("mohan", 28, 34.5f);
       
        s1.display();
        s2.display();
    }
}