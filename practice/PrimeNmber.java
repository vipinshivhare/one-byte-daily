
import java.util.Scanner;

public class PrimeNmber {
    public static boolean checkPrime(int n){
        for(int i=2;i*i<=n;i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = scanner.nextInt();
        boolean ans = checkPrime(n);
        if(ans) System.out.println(n+" is prime number");
        else System.out.println(n+" is not prime number");
        scanner.close();
        
    }
    
}
