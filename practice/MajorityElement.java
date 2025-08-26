public class MajorityElement {
    public static int majorityElement(int[]arr){
        int ans = 1;
        int majority = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] == majority){
                ans++;
            }else if(ans == 0){
                ans++;
                majority = arr[i];
            }else{
                ans--;
            }
        }
        return majority;
    }
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        // O/P - 2
        System.out.println(majorityElement(arr));
    }
    
}
