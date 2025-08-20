public class CheckSortedRotatedArray {
    public static boolean checkRotated(int[] arr){
        int count = 0;

        for(int i=1;i<arr.length;i++){
            if(arr[i-1] > arr[i]){
                count++;
            }
        }
        if(arr[0] < arr[arr.length-1]) count++;

        return count<=1;
    }


    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        boolean ans = checkRotated(arr);
        System.out.println(ans);
    }
    
}
