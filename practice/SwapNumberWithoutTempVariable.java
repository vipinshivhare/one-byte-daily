
import java.util.Scanner;

public class SwapNumberWithoutTempVariable {
    public static int[] swap(int num1, int num2){
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        return new int[]{num1, num2};
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = scanner.nextInt();

        int[] ans = swap(num1, num2);
        System.out.println(ans[0]+" "+ans[1]);

        scanner.close();
    }
    
}

