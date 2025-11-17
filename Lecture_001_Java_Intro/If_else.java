public class If_else {
    public static void main(String[] args) {
        // int age = 2;
        
        // if(age >= 18){
        //     System.out.println("You can drive");
        // }else{
        // System.out.println("You are not eligible to drive");
        // }

        // int marks = 55;

        // if(marks >= 90){
        //     System.out.println("You got Gread A+");
        // }else if( marks >= 80){
        //     System.out.println("You got Gread A");
        // }else if (marks >= 70){
        //     System.out.println("You got Gread B");
        // }else if(marks >= 60){
        //     System.out.println("You got Gread C");
        // }else{
        //     System.out.println("Congratulations you are failed!");

        // }

        int a = 100;
        int b = 200;
        int c = 30;

        if(a>b){
            if(a > c){
                System.out.println("a is greater");
            }else{
                System.out.println("c is greater");
            
            }
        }else{
            if(b>c){
                System.out.println("b is greater");
            }else{
                System.out.println("c is greater");

            }
        }
    }
}
