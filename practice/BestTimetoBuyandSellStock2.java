
import java.util.Scanner;

//122. Best Time to Buy and Sell Stock II (Medium)
class BestTimetoBuyandSellStock2 {
    public static int bestTimetoBuyandSellStock2(int[] arr){
        int profit = 0;
        int start = arr[0];
        for(int i=1;i<arr.length;i++){
            if(start < arr[i]){
                profit += arr[i] - start;
            }
            start = arr[i];
        }

        return profit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();

        System.out.print("Enter "+n+" elements : ");
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Profit is : "+bestTimetoBuyandSellStock2(arr));

    }
    
}