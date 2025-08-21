public class RemoveDuplicateFromSoretedArray {

    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4,4,4,4,5};
        
        int j=0;
        for(int i=1;i<arr.length;i++){
            if(arr[j] != arr[i]){
                arr[j+1] = arr[i];
                j++;
            }
        }
        for(int i=0;i<j+1;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
