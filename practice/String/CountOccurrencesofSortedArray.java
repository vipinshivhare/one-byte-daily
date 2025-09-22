
import java.util.Scanner;

public class CountOccurrencesofSortedArray {
    public static void countOccurrencesofSortedArray(int[] arr){
        int count = 1;
        for(int i=1;i<arr.length;i++){
            if(arr[i] == arr[i-1]){
                count++;
            }else{
                System.out.println(arr[i-1]+" occurs "+count+" times");
                count = 1;
            }
        }
        System.out.println(arr[arr.length - 1]+" occurs "+count+" times");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter "+n+" sorted elements : ");
        for(int i=0;i<n;i++) arr[i] = scanner.nextInt();

        countOccurrencesofSortedArray(arr);

        scanner.close();
    }
    
}
