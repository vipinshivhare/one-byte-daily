
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

// Leetcode - 1046
// Input: stones = [2,7,4,1,8,1]
// Output: 1
// Explanation: 
// We combine 7 and 8 to get 1 so the array converts to [2,4,1,1,1] then,
// we combine 2 and 4 to get 2 so the array converts to [2,1,1,1] then,
// we combine 2 and 1 to get 1 so the array converts to [1,1,1] then,
// we combine 1 and 1 to get 0 so the array converts to [1] then that's the value of the last stone.
public class LastStoneWeight {

    public static int lastStoneWeight(int[] arr){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int c : arr){
            pq.add(c);
        }
        while(pq.size() > 1){
            int x = pq.poll();
            int y = pq.poll();

            if(x != y){
                pq.add(x-y);
            }
        }
        return pq.isEmpty() ? 0 : pq.poll();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = scanner.nextInt();
        System.out.print("Enter "+n+" elements : ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
System.out.println(lastStoneWeight(arr));
        


    }
    
}
