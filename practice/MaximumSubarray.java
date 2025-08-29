// Kadane's Algorithm

// public int MaximumSubarray(int[] nums) {
//     int maxSum = nums[0], currSum = nums[0];
//     for (int i = 1; i < nums.length; i++) {
//         currSum = Math.max(nums[i], currSum + nums[i]);
//         maxSum = Math.max(maxSum, currSum);
//     }
//     return maxSum;
// }

public class MaximumSubarray {
    public static int maximumSubarray(int[] arr){
        int cs = 0, ms = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            cs += arr[i];
            ms = Math.max(cs, ms);
            if(cs < 0) cs = 0;
        }
        return ms;
    }
    public static void main(String[] args) {
        int [] arr = {-2,1,-3,4,-1,2,1,-5,4};
        // O/P - 6 (4,-1,2,1)
        System.out.println(maximumSubarray(arr));
    }
    
}
