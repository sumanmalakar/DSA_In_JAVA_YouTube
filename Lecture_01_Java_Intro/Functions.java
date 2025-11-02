public class Functions {

   static int sum(int a, int b){ // method declaration
    return a+b;
   } 

   public static void main(String[] args) {
    int x = 10, y = 20;

    int result = sum(x,y); // function call
    
    System.out.println(result);
    System.out.println(sum(20, 30)); // function call
    System.out.println(sum(10, 20));
    System.out.println(sum(200, 300));
    System.out.println(sum(210, 320));
    System.out.println(sum(120, 110));

   }
} 
