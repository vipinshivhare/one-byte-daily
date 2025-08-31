
import java.util.Scanner;
import java.util.stream.IntStream;

public class AverageByMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many subject you have : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the all "+n+" subjects marks : ");
        
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        // int sum = 0;
        // for(int i=0;i<n;i++){
        //     sum += arr[i];
        // }
        // int avg = sum / n;
       // System.out.println("Average is : "+ avg);

        double Avg = IntStream.of(arr).average().orElse(0.0);
        System.out.println("Average is : "+ Avg+ "%");

        if(Avg >= 75){
            System.out.println("Distinction");
        }else if(Avg > 50 && Avg < 75){
            System.out.println("Just Pass");
        }else{
            System.out.println("Failed - Parent Meeting required");
        }

        sc.close();


    }
    
}
