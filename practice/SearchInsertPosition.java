public class SearchInsertPosition {
    public static int searchInsertPosition(int[] arr, int target){
        int start = 0, end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] > target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,8,10,12,13,16,19};
        // O/P - 9
        int target = 17;
        System.out.println(searchInsertPosition(arr,target));
    }
    
}
