//724. Find Pivot Index || Easy

//The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's righ
//If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.
//Return the leftmost pivot index. If no such index exists, return -1.
//Example 1: Input: nums = [1,7,3,6,5,6] || Output: 3
//Explanation: The pivot index is 3.
//Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
//Right sum = nums[4] + nums[5] = 5 + 6 = 11
//Example 2: Input: nums = [1,2,3] || Output: -1
//Explanation: There is no index that satisfies the conditions in the problem statement.

import java.util.Scanner;

public class FindPivotIndex {
    public static int findPivotIndex(int[] arr){
        int totalsum = 0, leftsum = 0;
        for(int num : arr){
            totalsum += num;
        }
        for(int i=0;i<arr.length;i++){
            int rightsum = totalsum - arr[i] -leftsum;
            if (leftsum == rightsum) {
                return i;
            }
            leftsum += arr[i];
        }
        return -1;
    }


    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        //Enter the size of array : 6
        int n = sc.nextInt();

        System.out.print("Enter "+n+" numbers : ");
        //Enter 7 numbers : 1 7 3 6 5 6
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Pivot index is : "+findPivotIndex(arr));

    }
    
}




