class Student{
  static String name = "Ram";
}
public class Static_Key {
   static int age = 10;

  static void coding(){
    System.out.println("java coding!");
   }
    public static void main(String[] args) {
        // Static_Key s1 = new Static_Key();
        // System.out.println(s1.age);
        System.out.println(age);
        coding();

        System.out.println(Student.name);
    }
}
