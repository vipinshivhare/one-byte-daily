// Dutch National Flag Problem
public class SortColours {

    private static void swap(int[] arr, int start, int mid){
        int temp = arr[start];
        arr[start] = arr[mid];
        arr[mid] = temp; 
    }

    public static void sortColours(int[] arr){
        int start = 0, mid = 0, end = arr.length - 1;
        
        while(mid <= end){
            switch(arr[mid]){
                case 0 : 
                    swap(arr, start, mid);
                    start++;
                    mid++;
                    break;

                case 1 :
                    mid++;
                    break;
                
                case 2 :
                    swap(arr, mid, end);
                    end--;
                    break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        // O/P - 0,0,1,1,2,2

        sortColours(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }
}
