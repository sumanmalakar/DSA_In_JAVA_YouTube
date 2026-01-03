import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        // declare
        // int nums[][] = {{10,20,30},{40,50,60},{70,80,90}};

        // // System.out.println(nums[0][1]);
        // // System.out.println(nums[2][1]); // 80

        // int row = nums.length;
        // int col = nums[0].length;

        // for(int i = 0; i<row; i++){
        // for( int j = 0; j<col; j++){
        // System.out.print(nums[i][j]+" ");
        // }
        // System.out.println();
        // }

        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter the rows");
        // int rows = sc.nextInt();
        // System.out.println("Enter the Cloumns");
        // int cols = sc.nextInt();

        // int nums[][] = new int[rows][cols];

        // for(int i = 0; i<rows; i++){
        // System.out.println("Enter the "+(i+1)+" rows value");
        // for(int j = 0; j<cols; j++){
        // nums[i][j] = sc.nextInt();
        // }
        // }

        // System.out.println("Your array :- ");

        // for(int i = 0; i<rows; i++){
        // for( int j = 0; j<cols; j++){
        // System.out.print(nums[i][j]+" ");
        // }
        // System.out.println();
        // }

        // int nums[][] = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };

        // int sum = 0;
        // int rowSum = 0;
        // int colSum = 0;
        // int n = nums.length;
        // int m = nums[0].length;

        // for (int i = 0; i < n; i++) {
        //     rowSum = 0;
        //     colSum = 0;
        //     for (int j = 0; j < m; j++) {
        //         rowSum += nums[i][j];
        //         colSum += nums[j][i];
        //     }
        //     System.out.println((i+1)+ " row sum = "+rowSum);
        //     System.out.println((i+1)+ " col sum = "+colSum);
        // }
        // System.out.println(sum);
        int nums[][] = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };

        int key = 500;

        if(searchIn2DArray(nums, key)){
            System.out.println("Element Present");
        }else{
            System.out.println("Element not found");
        }


    }
    public static boolean searchIn2DArray(int nums[][], int key){
        int n = nums.length;
        int m = nums[0].length;

        for(int i =0; i<n; i++){
            for(int j =0; j<m; j++){
                if(nums[i][j] == key) return true;
            }
        }

        return false;
    }
}
