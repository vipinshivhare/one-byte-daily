public class RearrangeElementBySign {
    public static int[] rearrangeElementBySign(int[] arr){
        int ps = 0, ng = 1;
        int[] ans = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > 0){
                ans[ps] = arr[i];
                ps += 2;
            } else {
                ans[ng] = arr[i];
                ng += 2;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, -2, -5, 2, -4};
        int[] ans = rearrangeElementBySign(arr);

        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
