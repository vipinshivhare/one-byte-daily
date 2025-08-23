public class MaxConsecutiveOne {

    public static int maxConsecutiveOne(int[] arr){

        int consecutive = 0;
        int ans = 0;
        for(int i=0;i<arr.length;i++){
            if (arr[i] == 1) {
                consecutive++;
                if(consecutive > ans){
                    ans = consecutive;
                }
            }else{
                consecutive = 0;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1,1,0,1,1,1,0,0,1,1,1,1,0,1,1,0};
        // O/P - 4;

        System.out.println(maxConsecutiveOne(arr));
    }
    
}

