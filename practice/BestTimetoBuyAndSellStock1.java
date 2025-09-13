// 121 Leetcode
import java.util.Scanner;

public class BestTimetoBuyAndSellStock1 {
    public static int bestTimetoBuyAndSellStock1(int[] arr){
        int min = Integer.MAX_VALUE;
        int profit = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] < min) min = arr[i];
            if(arr[i] - min > profit) profit = arr[i] - min; 
        }
        return profit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of your array : ");
        int n = sc.nextInt();
        // 7

        int[] arr = new int[n];
        // 2 1 10 23 14 21 4
        System.out.print("Enter "+n+" elements : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(bestTimetoBuyAndSellStock1(arr));
        // 22
    }
    
}
