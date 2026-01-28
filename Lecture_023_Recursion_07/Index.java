
public class Index {
    static void merge(int nums[], int left, int mid, int right) {
        // length of arrays
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // declare two array
        int L[] = new int[n1];
        int R[] = new int[n2];

        // copy original array element
        for (int i = 0; i < n1; i++) {
            L[i] = nums[left + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = nums[mid + 1 + j];
        }

        // sort and merge
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                nums[k++] = L[i++];
            } else {
                nums[k++] = R[j++];
            }
        }

        // remaining element
        while (i < n1)  nums[k++] = L[i++];
        while (j < n2)  nums[k++] = R[j++];
    }

    static void merge_sort(int nums[], int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            // left part
            merge_sort(nums, left, mid);

            // right part
            merge_sort(nums, mid + 1, right);

            // sort and merge
            merge(nums, left, mid, right);
        }
    }

    public static void main(String[] args) {
        int nums[] = { 0, -1, 3, 2, 10, 5, 6 };

        merge_sort(nums, 0, nums.length - 1);

        for(int x : nums){
            System.out.print(x+" ");
        }
    }
}
