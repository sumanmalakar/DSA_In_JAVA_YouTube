
public class Index {
    static int pivot_index(int nums[]) {
        int s = 0, e = nums.length - 1;
        int N = nums.length;
        int prev, next;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            next = (mid + 1) % N;
            prev = (mid + N - 1) % N;

            if (nums[mid] < nums[prev] && nums[mid] < nums[next])
                return mid;
            else if (nums[mid] > nums[0])
                s = mid + 1;
            else
                e = mid - 1;

        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = { 11, 15, 0, 1, 2, 3, 5, 6 };
        int result = pivot_index(nums);
        System.out.println(result);

    }
}
 