
public class Index {
    static void selection_sort(int nums[]){
        int n = nums.length;
        for(int i=0; i<n-1; i++){
            int min_Index = i;
            for(int j=i+1; j<n; j++){
                if(nums[min_Index]>nums[j]){
                    min_Index = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[min_Index];
            nums[min_Index] = temp;
        }
    }
    public static void main(String[] args) {
        int nums [] = {10,9,12,0,-1,5};
        selection_sort(nums);
        for(int x : nums) System.out.print(x+" ");
    }
}
