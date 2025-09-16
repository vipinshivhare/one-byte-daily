
import java.util.Scanner;

// 414 Third Maximum Number (Easy)
public class ThirdMaximumNumber {
    public static int thirdMaximumNumber(int[] arr){
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;

        for(int num : arr){
            if(num == first || num == second ||num == third) continue;
            if(num > first){
                third = second;
                second = first;
                first = num;
            }else if(num > second){
                third = second;
                second = num;
            }else if(num > third){
                third = num;
            }
        }

        return third != Long.MIN_VALUE ? (int)third : (int)first;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();

        System.out.print("Enter "+n+" numbers : ");
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("The third maximum number is : "+thirdMaximumNumber(arr));
        
    }
    
}
