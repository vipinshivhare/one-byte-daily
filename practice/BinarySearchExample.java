public class BinarySearchExample {

    public static int binarySearch(int[] arr, int target) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid; 
            }
            else if (arr[mid] < target) {
                start = mid + 1;
            } 
            else {
                end = mid - 1;
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 45, 56, 72};
        int target = 23;

        int result = binarySearch(arr, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in array.");
        }
    }
}
