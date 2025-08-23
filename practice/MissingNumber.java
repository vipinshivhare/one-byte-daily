public class MissingNumber {

    // 1st

    // public static int missingNumber(int[] arr){

    //     int ans = 0;
    //     for(int i=0;i<arr.length;i++){
    //         ans = ans ^ i ^ arr[i];
    //     }
    //     return  ans ^ arr.length;
    // }


    // public static void main(String[] args) {
    //     int arr[] = {9,6,4,2,3,5,7,0,1};
    //     // O/P - 8
    //     System.out.print(missingNumber(arr));
    // }


    // 2nd 

    public static int missingNumber(int[] arr){
        int ans = arr.length ;
        for(int i=0;i<arr.length;i++){
            ans += i - arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {9,6,4,2,3,5,7,0,1};
        // O/P - 8
        System.out.println(missingNumber(arr));
    }
    
}
