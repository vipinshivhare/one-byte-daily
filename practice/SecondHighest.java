public class SecondHighest {
    public static void main(String[] args) {
        int[] numbers = {5, 9, 2, 15, 7, 15}; // Example array

        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num > highest) {
                secondHighest = highest;
                highest = num;
            } else if (num > secondHighest && num != highest) {
                secondHighest = num;
            }
        }

        if (secondHighest == Integer.MIN_VALUE) {
            System.out.println("No second highest number found.");
        } else {
            System.out.println("Second highest number is: " + secondHighest);
        }
    }
}
