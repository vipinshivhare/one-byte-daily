
import java.util.Scanner;

// 125 Leetcode
public class ValidPalindrome {
    public static boolean validPalindrome(String s){
        int start = 0, end = s.length()-1;
        while(start < end){
            while(start < end && !Character.isLetterOrDigit(s.charAt(start))){
                start++;
            }
            while(start < end && !Character.isLetterOrDigit(s.charAt(end))){
                end--;
            }
            while(Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string : ");
        String s1 = sc.nextLine();

        boolean ans = validPalindrome(s1);
        if(ans) System.out.println("Yes it's Valid Palindrome");
        else {System.out.println("No it's not Valid Palindrome");}
        
    }
    
}
