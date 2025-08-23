public class MoveZeroes {

    public static void movesZero(int[] arr){
        int j = 0;
        for(int i=1;i<arr.length;i++){
            if (arr[i] != 0) {
                arr[j] = arr[i];
                j++;
            }
        }
        while(j<arr.length){
            arr[j] = 0;
            j++;
        }
        
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,1,8,0,0,3,6,0,222,4,200,1,0,3,12}; 
        // O/P - 1 2 1 8 3 6 222 4 200 1 3 12 0 0 0 0 0

        movesZero(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

    }
    
}
