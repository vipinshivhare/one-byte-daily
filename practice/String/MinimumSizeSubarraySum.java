//209. Minimum Size Subarray Sum {Medium}

//Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.
//Example 1:

//Input: target = 7, nums = [2,3,1,2,4,3] 2 3 1 2 4 3
//Output: 2
//Explanation: The subarray [4,3] has the minimal length under the problem constraint.
//Example 2:
//Input: target = 4, nums = [1,4,4]
//Output: 1

import java.util.Scanner;

public class MinimumSizeSubarraySum {

    public static int minimumSizeSubarraySum(int[] arr, int target){
        int left = 0, currsum = 0, minlen = Integer.MAX_VALUE;
        for(int right=0;right<arr.length;right++){
            currsum += arr[right];
            while(currsum >= target){
                if(right - left + 1 > minlen){
                    minlen = right - left + 1;
                }
                currsum -= arr[left];
                left++;
            }   
        }
        return minlen == Integer.MAX_VALUE ? 0 : minlen;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter the size of your array : ");
            int n = sc.nextInt();
            System.out.print("Enter the "+n+" numbers : ");
            int arr[] = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            System.out.print("Enter the value of target : ");
            int target = sc.nextInt();

            System.out.println(minimumSizeSubarraySum(arr,target));
    }
    
}
