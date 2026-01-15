
public class Index {
    public static void print(int n) {
        // base case
        if (n > 4)
            return;
        print(n + 1);
        System.out.print(n + " ");
    }

    public static int fact(int n) {
        if (n == 0 || n == 1)
            return 1;

        int res = n * fact(n - 1);

        return res;
    }

    public static int fib(int n) {
        if (n <= 1)
            return n;

        int f1 = fib(n - 1);
        int f2 = fib(n - 2);

        return f1 + f2;
    }

    public static void reverse(int nums[], int s, int e) {
        if (s >= e)
            return;

        int temp = nums[s];
        nums[s] = nums[e];
        nums[e] = temp;
        s++;
        e--;
        reverse(nums, s, e);
    }

    public static String reverse(String str, int index){
        if(index < 0) return "";

        return str.charAt(index) + reverse(str, index-1);
    }

    public static void main(String[] args) {

        String str = "abc";
        System.out.println(str);
        System.out.println(reverse(str, str.length()-1));
        // int nums [] = {10,20,30,40,50};
        // for(int x: nums) System.out.print(x+" ");
        // System.out.println();
        // reverse(nums, 0, nums.length - 1);
        // for(int x: nums) System.out.print(x+" ");











        // System.out.print(fib(5) + " ");

        // for(int i = 0; i<=6; i++){
        // System.out.print(fib(i)+" ");
        // }
        // int n = 1;
        // print(n);
        // System.out.println(fact(6));

    }
}
