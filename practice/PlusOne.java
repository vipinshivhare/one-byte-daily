// Leetcode - 66
// Examples :

// Input: digits = [1,2,3]
// Output: [1,2,4]

// Input: digits = [4,3,2,1]
// Output: [4,3,2,2]

// Input: digits = [9]
// Output: [1,0]

import java.util.Scanner;

public class PlusOne {

    public static int[] plusOne(int[] arr){
        int n = arr.length;
        for(int i=n-1;i>=0;i--){
            if(arr[i] == 9){
                arr[i] = 0;
            }else{
                arr[i]++;
                return arr;
            }
        }
        arr = new int[n+1];
        arr[0] = 1;

        return arr;

    }
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = scanner.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter "+n+" digits : ");

        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }

        int[] ans = plusOne(arr);
        for(int i : ans){
            System.out.print(i);
        }
    }
}
