class Student {
    String name;
    int age;
    int rollNumber;

    // constructor 
    Student(String n, int a) {
      name = n;
      age = a;
    }
    Student(String n, int a, int r){
        name = n; 
        age = a; 
        rollNumber = r;
    }

    void show() {
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
        System.out.println("rollNumber = "+rollNumber);
    }
}
public class Index {
    public static void main(String[] args) {

        Student s1 = new Student("Suman",25);
        s1.show();
        Student s2 = new Student("Ram",20);
        s2.show();
        Student s3 = new Student("Mohan", 10,241099);
        s3.show();
    }

}