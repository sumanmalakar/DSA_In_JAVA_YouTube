
public class Practice {
    static int arr_sum(int nums[]) {
        int n = nums.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }
        return sum;
    }

    static void min_max(int nums[]) {
        int n = nums.length;
        int max = nums[0];
        int min = nums[0];

        for (int i = 1; i < n; i++) {
            if (nums[i] > max)
                max = nums[i];
            if (nums[i] < min)
                min = nums[i];
        }
        System.out.println("Maxi = " + max);
        System.out.println("Mini = " + min);
    }

    static void reverse_arr(int nums[]) {
        int start = 0, end = nums.length - 1;
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 60, 3, 0, 4, 90 };
        // int result = arr_sum(arr);
        // System.out.println("Array Elements Sum = "+result);
        // min_max(arr);
        System.out.println("Before reverse");
        for (int x : arr)
            System.out.print(x + " ");
        System.err.println("\nAfter reverse");
        reverse_arr(arr);
        for (int x : arr)
            System.out.print(x + " ");

    }
}
