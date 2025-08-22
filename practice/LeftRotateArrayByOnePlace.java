// 1st approach

// public class LeftRotateArrayByOnePlace {

//     public static void main(String[] args) {
//         int[] arr = {1,2,3,4,5,6,7};
//         int k = 3;
//         int n = arr.length;

//         int[] ans = new int[n];
//         k = k % n;

//         for(int i=0;i<n;i++){
//             ans[(i+k)%n] = arr[i];
//         }
//         for(int i=0;i<n;i++){
//             arr[i] = ans[i];
//             System.out.print(ans[i] + " ");
//         }
//     }
// }


// 2nd approach

public class LeftRotateArrayByOnePlace {

    public static void reverse(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7}; // O/P = {5,6,7,1,2,3,4}
        int k = 3;
        int n = arr.length;
        k = k % n;

        reverse(arr, 0, n-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);

        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }


    }
}
