class Student{
    private String name;
    private int age;

    // setter method
    public void setData(String name, int age){
        this.name = name;
        this.age = age;
    }
    // getter method
    public void getData(){
        System.out.println("Name = "+this.name);
        System.out.println("Age = "+this.age);
    }

    // public, default, protected, private
}
public class Index {
    public static void main(String[] args) {
        Student s1 = new Student();
       s1.setData("Suman", 25);
       s1.getData();
    }
}
