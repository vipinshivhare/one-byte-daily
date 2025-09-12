// 242 Leetcode
import java.util.Arrays;
import java.util.Scanner;

public class ValidAnagram {
    // 1st using HashMap
    // public static Boolean validAnagram(String s1, String s2){
    //     if(s1.length() != s2.length()) return false;

    //     HashMap <Character, Integer> map = new HashMap<>();
    //     for(char c : s1.toCharArray()){
    //         map.put(c, map.getOrDefault(c, 0) + 1);
    //     }

    //     for(char c : s2.toCharArray()){
    //         if(!map.containsKey(c) || map.get(c) <= 0 ) return false;
    //         map.put(c, map.get(c) - 1);
    //     }
        
    //     return true;
    // }

// 2nd using array
    // public static Boolean validAnagram(String s1, String s2){
    //     if(s1.length() != s2.length()) return false;

    //     char[] arr = new char[26];
    //     for(int i=0;i<s1.length();i++){
    //         arr[s1.charAt(i) - 'a']++;
    //         arr[s2.charAt(i) - 'a']--;
    //     }
    //     for(char c : arr){
    //         if(c != 0) return false;
    //     }
        
    //     return true;
    // }


    // 3rd using sort in Arrays
    public static Boolean validAnagram(String s1, String s2){
        if(s1.length() != s2.length()) return false;

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Arrays.equals(arr1, arr2);
        
        return Arrays.equals(arr1, arr2);
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
