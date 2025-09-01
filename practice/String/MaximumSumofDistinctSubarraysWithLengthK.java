
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// 2461 Leetcode (Medium)
//You are given an integer array nums and an integer k. Find the maximum subarray sum
//of all the subarrays of nums that meet the following conditions: The length of the subarray is k, and
//All the elements of the subarray are distinct.
//Return the maximum subarray sum of all the subarrays that meet the conditions.
// If no subarray meets the conditions, return 0.
//A subarray is a contiguous non-empty sequence of elements within an array.
//Example 1:
//Input: nums = [1,5,4,2,9,9,9], k = 3
//Output: 15

public class MaximumSumofDistinctSubarraysWithLengthK {

    public static int maximumSumofDistinctSubarraysWithLengthK(int[] arr, int k){

        Set<Integer> set = new HashSet<>();
        int left = 0, currsum = 0, maxSum = 0;
        for(int right = 0;right<arr.length;right++){
            while(set.contains(arr[right]) || set.size() == k){
                set.remove(arr[left]);
                currsum -= arr[left];
                left++;
            }
            set.add(arr[right]);
            currsum += arr[right];
            if(currsum > maxSum){
                maxSum = currsum;
            }
        }
        return maxSum;
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
            System.out.print("Enter the value of k : ");
            int k = sc.nextInt();

            System.out.print(maximumSumofDistinctSubarraysWithLengthK(arr,k));
        }
}
