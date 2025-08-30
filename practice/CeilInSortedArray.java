// - Print the index of floor
public class CeilInSortedArray {
    public static int ceilInSortedArray(int[] arr, int target){
        int start = 0 , end = arr.length - 1, ans = 0;
        while(start <= end){
            int mid  = start + (end - start) / 2;
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
        int arr[] = {1,2,3,4,5,6,7,10,11,11,13,15,19};
        // O/P - 10
        int target = 12;
        System.out.println("Index is : " + ceilInSortedArray(arr,target));
    }
}
