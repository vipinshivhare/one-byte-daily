public class FloorCeilInSortedArray {
    public static int getFloor(int[] arr,int target){
        int start = 0, end = arr.length -1, ans = 0;
        while(start <= end){
            int mid  = start + (end - start) / 2;
            if(arr[mid] <= target){
                ans = mid;
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return ans;
    }

    public static int getCeil(int[] arr, int target){
        int start = 0, end = arr.length - 1, ans = 0;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] >= target){
                ans = mid;
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,7,10,11,11,13,15,19,22,30,45};
        //O/P - 7,8
        int target = 14;
        int floor = getFloor(arr, target);
        int ceil = getCeil(arr, target);

        System.out.println("Index of Floor is : "+floor+" Index of  and Ceil is : "+ceil);
    }
    
}
