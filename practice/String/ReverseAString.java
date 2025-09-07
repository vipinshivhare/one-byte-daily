
import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.nextLine();
        // System.out.print("Reverse string of "+str+" is : ");
        // for(int i=str.length()-1;i>=0;i--){
        //     System.out.print(str.charAt(i));
        // }

        StringBuilder s = new StringBuilder();
        s.append(str);
        s.reverse();
        System.out.print("Reverse string of "+str+" is : "+s);
    }
    
}
