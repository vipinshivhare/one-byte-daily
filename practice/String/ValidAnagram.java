
import java.util.HashMap;
import java.util.Scanner;

public class ValidAnagram {
    public static Boolean validAnagram(String s1, String s2){
        if(s1.length() != s2.length()) return false;

        HashMap <Character, Integer> map = new HashMap<>();
        for(char c : s1.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(char c : s2.toCharArray()){
            if(!map.containsKey(c) || map.get(c) <= 0 ) return false;
            map.put(c, map.get(c) - 1);
        }
        
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string : ");
        String s1 = sc.nextLine();

        System.out.print("Enter the second string : ");
        String s2 = sc.nextLine();

        boolean ans = validAnagram(s1,s2);
        if(ans) System.out.println("Yes it's Valid Anagram");
        else {System.out.println("No it's not Valid Anagram ");}
    }
    
}
