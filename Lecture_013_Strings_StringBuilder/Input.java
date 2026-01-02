import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     
     System.out.println("Enter your name");
    //  String str = sc.next();
    String str = sc.nextLine();

     System.out.println("Your name = "+str);

     sc.close();
    }

}
