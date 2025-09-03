
import java.util.Scanner;

public class NumberofOccurrencesInSortedArray {

    public static int numberofOccurrencesInSortedArray(int[] arr, int target){
        int first = findFirst(arr, target);
        int last = findLast(arr, target);

        if(first == -1) return 0;

        return last - first + 1;
    }

    private static int findFirst(int[] arr, int target){
        int first = -1, start = 0, end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                first = mid;
                end = mid - 1;
            }else if(arr[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return first;
    }


    private static int findLast(int[] arr, int target){
        int last = -1, start = 0, end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                last = mid;
                start = mid + 1;
            }else if(arr[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return last;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();

        System.out.print("Enter "+n+" numbers : ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the targeted number : ");
        int target = sc.nextInt();

        System.out.println(numberofOccurrencesInSortedArray(arr,target));

    }
    
}
