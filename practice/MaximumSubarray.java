// Kadane's Algorithm

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
