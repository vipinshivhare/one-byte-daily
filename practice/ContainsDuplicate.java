
import java.util.Arrays;
import java.util.Scanner;

// 217 leetcode

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] arr){
        // using HashSet
        // HashSet<Integer> set = new HashSet<>();
        // for(int num : arr){
        //     if(set.contains(num)) return true;
        //     set.add(num);
        // }

        // using HashMap
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int num : arr){
        //     if(map.containsKey(num) && map.get(num) >= 1) return true;
        //     map.put(num, map.getOrDefault(num, 0) + 1);
        // }

        // using arrays sort fn
        Arrays.sort(arr);
        for(int i=1;i<arr.length;i++){
            if(arr[i] == arr[i-1]) return true;
        }

        return false;
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

        boolean ans = containsDuplicate(arr);
        if(ans) System.out.println("Yes! its contain duplicates");
        else{System.out.println("No! its not contain duplicates");}

        
    }
    
}
