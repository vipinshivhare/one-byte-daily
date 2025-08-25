public class TrappingRainWater {

    public static int trap (int[] arr){

        int ans = 0;
        int left = 0;
        int right = arr.length-1;
        int leftMax = 0;
        int rightMax = 0;

        while(left < right){
            if(arr[left] <= arr[right]){
                if(arr[left] >= leftMax) leftMax = arr[left];
                else ans += leftMax - arr[left];
                left++;
            }else{
                if(arr[right] >= rightMax) rightMax = arr[right];
                else ans += rightMax - arr[right];
                right--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1}; 
        // ans = 6
        System.out.println(trap(arr));
    }
    
}
