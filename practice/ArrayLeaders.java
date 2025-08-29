import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLeaders {

    public static List<Integer> arrayLeaders(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        int maxi = Integer.MIN_VALUE;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i] >= maxi){
                ans.add(arr[i]);
            }
            maxi = Math.max(arr[i], maxi);
        }
        Collections.reverse(ans);
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {16,17,5,4,3,5,2};
        // O/P - 2,5,17
        List<Integer> ans = arrayLeaders(arr);
        System.out.println("Leaders are: " + ans);
    }

    
    
}
