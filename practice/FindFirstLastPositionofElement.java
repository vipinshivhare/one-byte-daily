import java.util.Scanner;

public class FindFirstLastPositionofElement {

    public static int findFirst(int[] arr, int target){
        int start = 0, end = arr.length -1, ansFirst = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                ansFirst = mid;
                end = mid - 1;
            }else if(arr[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return ansFirst;
    }

    public static int findLast(int[] arr, int target){
        int start = 0, end = arr.length -1, ansLast = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                ansLast = mid;
                start = mid + 1;
            }else if(arr[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return ansLast;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the "+n+" number : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target : ");
        int target = sc.nextInt();

        int first = findFirst(arr, target);
        int last = findLast(arr, target);
        
        System.out.println("First index is : "+first+" and last is : "+last);   
    }
}
