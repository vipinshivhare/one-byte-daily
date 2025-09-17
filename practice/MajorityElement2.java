import java.util.Scanner;

public class MajorityElement2 {

    // Step 1: Find candidate for majority element
    public static int majorityElement(int[] arr) {
        int major = arr[0], vote = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == major) {
                vote++;
            } else if (vote == 0) {
                major = arr[i];
                vote = 1;
            } else {
                vote--;
            }
        }

        return major;
    }

    // Step 2: Verify if candidate is actually majority
    public static boolean isMajority(int[] arr, int candidate) {
        int count = 0;
        for (int num : arr) {
            if (num == candidate) {
                count++;
            }
        }
        return count > arr.length / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int n = scanner.nextInt();

        System.out.print("Enter "+n+" elements : ");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int candidate = majorityElement(arr);

        if (isMajority(arr, candidate)) {
            System.out.println(candidate);
        } else {
            System.out.println(-1);
        }

        scanner.close();
    }
}
