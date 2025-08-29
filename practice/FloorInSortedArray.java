public class FloorInSortedArray {
    // 1st 
    // public static int floorInSortedArray(int[] arr, int target){
    //     int ans = -1;
    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i] < target){
    //             ans = i;
    //         }
    //     }
    //     return ans;
    // }

    // 2nd
    public static int floorInSortedArray(int[] arr, int target){
        int ans = -1;
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start + (end - start) / 2;
            if(arr[mid] <= target){
                ans = mid;
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,10,10,12,19};
        // O/P - 6
        int target = 9;
        System.out.println("Index is : " + floorInSortedArray(arr,target));
    }
    
}
