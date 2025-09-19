
import java.util.Scanner;

public class FactorialOfANumber {
    // public static int factorialOfANumber(int n){
    //     if(n == 0 || n == 1) return 1;
    //     return n * factorialOfANumber(n-1);
    // }

    public static int factorialOfANumber(int n){
        int factorial = 1;
        for(int i=2;i<=n;i++){
            factorial *= i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = scanner.nextInt();
        System.out.println(factorialOfANumber(n));
    }
    
}
