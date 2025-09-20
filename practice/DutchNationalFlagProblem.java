
import java.util.Scanner;

public class DutchNationalFlagProblem {
    public static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

    }


    public static void dutchNationalFlagProblem(int[] arr){
        int start = 0, mid = 0, end = arr.length-1;
        while(mid <= end){
            switch(arr[mid]){
                case 0:
                    swap(arr,start,mid);
                    start++;
                    mid++;
                    break;
                
                case 1:
                    mid++;
                    break;

                case 2:
                    swap(arr, mid, end);
                    end--;
                    break;
            }
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of your array : ");
        int n = scanner.nextInt();
        System.out.print("Enter "+n+" numbers : ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = scanner.nextInt();
        dutchNationalFlagProblem(arr);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        scanner.close();
    }
    
}
