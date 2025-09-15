
import java.util.Scanner;

// 11 Leetcode (Medium)
public class ContainerWithMostWater {
    public static int containerWithMostWater(int[] arr){
        int left = 0, right = arr.length-1, maxArea = 0;

        while(left < right){
           int area = Math.min(arr[right], arr[left]) * (right - left);
            if(area > maxArea) maxArea = area;

            if(arr[left] < arr[right]) left++;
            else right--;
        }

        return maxArea;
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

        System.out.println("Answer is : "+containerWithMostWater(arr));
    }
    
}