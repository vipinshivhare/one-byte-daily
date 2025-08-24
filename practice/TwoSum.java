
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] arr, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int complement = target - arr[i];
            if(map.containsKey(complement)){
                return new int[] { map.get(complement),i };
            }
            map.put(arr[i], i);
        }
        return new int[] {} ;
    }


    public static void main(String[] args) {
        int[] arr = {2,11,2,5,4,15};
        // O/P - [3,4]
        int target = 9;
        System.out.println( Arrays.toString(twoSum(arr, target)));
    }
    
}
