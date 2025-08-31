
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//Given a string s, find the length of the longest substring without duplicate characters.
//Example 1:
//Input: s = "abcabcbb"
//Output: 3
//Explanation: The answer is "abc", with the length of 3.

public class LongestSubstringWithoutRepeatingChar {

    public static int longestSubstringWithoutRepeatingChar(String s){
        Set<Character> set = new HashSet<>();
        int left = 0, maxlen = 0, startidx = 0;
        for(int right=0;right<s.length();right++){
            char c = s.charAt(right);
            while(set.contains(c)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(c);
            maxlen = Math.max(maxlen, right-left+1);
        }
        // for printing substtring also
        //     if(right-left+1 > maxlen){
        //         maxlen = right-left+1;
        //         startidx = left;
        //     }
        // }
        // String subString = s.substring(startidx, startidx+maxlen);

        return maxlen;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string : ");
        String s = sc.nextLine();
        System.out.println(longestSubstringWithoutRepeatingChar(s));


    }
    
}
