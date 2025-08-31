// Qu - You are given a string S consisting of lowercase and/or uppercase
// English letters, digits, spaces, and special characters. 
// Your task is to find the longest substring of S that does not contain any repeating 
//characters and print: 1. The substring itself. 2. The length of that substring.


import java.util.*;

// 1st Using Sliding Window

public class LongestUniqueSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        // Sliding window
        Set<Character> set = new HashSet<>();
        int left = 0, maxLen = 0, startIdx = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            // Agar duplicate hai to left pointer aage badhao
            while (set.contains(c)) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(c);

            // Max substring update karo
            if (right - left + 1 > maxLen) {
                maxLen = right - left + 1;
                startIdx = left;
            }
        }

        // Substring nikalna
        String longestSub = s.substring(startIdx, startIdx + maxLen);

        // Output
        System.out.println("Longest Substring without repeating characters: " + longestSub);
        System.out.println("Length: " + maxLen);
    }
}


// 2nd Using nested Loop

// public class LongestUniqueSubstring {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the string: ");
//         String s = sc.nextLine();

//         int maxLen = 0;
//         String Longest = "";
        

//         for(int i=0;i<s.length();i++){
//             String current = "";
//             for(int j=i;j<s.length();j++){
//                 char c = s.charAt(j);

//                 if(current.indexOf(c) != -1){
//                     break;
//                 }else{
//                     current += c;
//                 }

//                 if(current.length() > maxLen){
//                     maxLen = current.length();
//                     Longest = current;
//                 }

//             }
//         }
//         System.out.println("Longest Substring without repeating characters: " + Longest);
//         System.out.println("Length: " + maxLen);


//     }
// }
