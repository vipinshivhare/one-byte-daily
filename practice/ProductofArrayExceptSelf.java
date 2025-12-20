
import java.util.Scanner;

// 238 leetcode - 
// Example 1:
// Input: nums = [1,2,3,4]
// Output: [24,12,8,6]

// Example 2:
// Input: nums = [-1,1,0,-3,3]
// Output: [0,0,9,0,0]
//COncept :  prsent wale left ko chod ke uske left me jitne hai sbka multiply krke present wale me like dege

public class ProductofArrayExceptSelf {

    public static void productofArrayExceptSelf(int[] arr, int n){

        int[] left = new int[n];
        int[] right = new int[n];
        int[] ans = new int[n];

        left[0] = 1;
        for(int i=1;i<n;i++){
            left[i] = left[i-1] * arr[i-1];
        }

        right[n-1] = 1;
        for(int i=n-2;i>-1;i--){
            right[i] = right[i+1] * arr[i+1];
        }

        for(int i=0;i<n;i++){
            ans[i] = left[i] * right[i];
            System.out.print(ans[i]+" ");
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        System.out.print("Enter the size of array : ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter "+n+" digit : ");
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }

        productofArrayExceptSelf(arr,n);






    }
    
    
}
