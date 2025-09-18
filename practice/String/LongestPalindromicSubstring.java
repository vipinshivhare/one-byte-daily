// 5 Longest Palindromic Substring (Medium)
import java.util.Scanner;


public class LongestPalindromicSubstring {
    public static String palindromeChecker(String str, int start, int end){
        while(start >= 0 && end < str.length() && str.charAt(start) == str.charAt(end)){
            start--;
            end++;
        }

        return str.substring(start+1, end);
    }
    public static String longestPalindromicSubstring(String str){
        String LPS = "";
        for(int i=0;i<str.length();i++){
            String odd = palindromeChecker(str, i, i);
            String even = palindromeChecker(str, i, i+1);

            if(odd.length() > LPS.length()) LPS = odd;
            if(even.length() > LPS.length()) LPS = even;
        }
        return LPS;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = scanner.nextLine();
        System.out.print("Largest Palindrome Substring is : "+longestPalindromicSubstring(str));

        scanner.close();
        
    }
    
}
