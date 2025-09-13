import java.util.Scanner;
// here first and last element is same this is difference 
public class SearchInRotatedSortedArray2 {

    public static boolean searchInRotatedSortedArray2(int[] arr, int target){
        int start = 0, end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return true;
            }
            else if(arr[start] == arr[mid] && arr[end] == arr[mid]){
                start++;
                end--;
            }
            else if(arr[start] <= arr[mid]){
                if(arr[start] <= target && target < arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
            else{
                if(arr[mid] < target && target <= arr[end]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        //Enter the size of array : 7


        int n = sc.nextInt();

        System.out.print("Enter "+n+" numbers : ");
        //Enter 7 numbers : 2 5 6 0 0 1 2
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target : ");
        // Enter the target : 0
        int target = sc.nextInt();

        boolean ans = searchInRotatedSortedArray2(arr, target);

        if(ans) System.out.println("Yes ("+ans+") it's present!"); // O/P - true
        else System.out.println("No ("+ans+") it's not present!");
    }
    
}
