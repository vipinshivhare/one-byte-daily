public class SearchRotatedArray1 {
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 0;
        int ans = -1;
        
        int start = 0, end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                ans = mid;
                break;
            }else if(arr[start] <= arr[mid]){
                if(arr[start] <= target && target <= arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else{
                if(arr[mid] <= target && target <= arr[end]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
        }

        System.out.println("The Taregted index is : " + ans);


    }
}
