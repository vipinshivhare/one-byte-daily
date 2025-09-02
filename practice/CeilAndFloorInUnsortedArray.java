
import java.util.Arrays;
import java.util.Scanner;

public class CeilAndFloorInUnsortedArray {

    public static int[] ceilAndFloorInUnsortedArray(int[] arr, int x){
        int ceil = -1, floor = -1;

        for(int i=0;i<arr.length;i++){
            if(arr[i] <= x){
                if(arr[i] > floor || floor == -1){
                    floor = arr[i];
                }
            }
            if(arr[i] >= x){
                if(arr[i] < ceil || ceil == -1){
                    ceil = arr[i];
                }
            }

        }

        return new int[] {floor, ceil};
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

        System.out.print("Enter the value of comparing : ");
        int x = sc.nextInt();

        System.out.println(Arrays.toString(ceilAndFloorInUnsortedArray(arr, x)));
        
        
    }
    
}
