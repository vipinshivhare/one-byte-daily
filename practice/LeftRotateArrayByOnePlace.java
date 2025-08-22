public class LeftRotateArrayByOnePlace {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        int n = arr.length;

        int[] ans = new int[n];
        k = k % n;

        for(int i=0;i<n;i++){
            ans[(i+k)%n] = arr[i];
        }
        for(int i=0;i<n;i++){
            arr[i] = ans[i];
            System.out.print(ans[i] + " ");
        }
    }
}
