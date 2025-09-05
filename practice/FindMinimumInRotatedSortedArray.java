import java.util.Scanner;

public class FindMinimumInRotatedSortedArray {
    public static int findMinimumInRotatedSortedArray(int[] arr){
        int start = 0, end = arr.length - 1;
        
        while(start < end){ 
            int mid = start + (end - start) / 2;

            if(arr[mid] <= arr[end]){
                end = mid;
            } else {
                start = mid + 1;       
            }
        }
        return arr[start]; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();

        System.out.print("Enter " + n + " elements : ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Minimum element is: " + findMinimumInRotatedSortedArray(arr));
    }
}
