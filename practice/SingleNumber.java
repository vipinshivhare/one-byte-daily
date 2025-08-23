public class SingleNumber {

    public static int singleNumber(int[] arr){

        int ans = 0;
        for(int i=0;i<arr.length;i++){
            ans = ans ^ arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,6,5,4,3,2,1};
        // O/P - 7

        System.out.print(singleNumber(arr));
    }
    
}
