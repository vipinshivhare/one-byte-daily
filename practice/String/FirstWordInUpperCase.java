
public class FirstWordInUpperCase {

    public static String firstWordInUpperCase(String s){
        String[] arr = s.split(" ");
        StringBuilder ans = new StringBuilder();

        for(int i=0;i<arr.length;i++){
            String word = arr[i];
            String capsWord = word.substring(0,1).toUpperCase() + word.substring(1);
            // word.substring(0,1) se first word le lia and Uppercase lia and word.substring(1) se purani wali string me 1 ke baad me means 1 char hta ke aage ka jud gya
            if(ans.length() == 0){
                ans.append(capsWord);
            }else{
                ans.append(" ");
                ans.append(capsWord);
            }
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String s = "my name is vipin shivhare";
        //O/P - My Name Is Vipin Shivhare
        System.out.println(firstWordInUpperCase(s));
    }
    
}



// class Solution {
//     public String reverseWords(String s) {
//     StringBuilder ans = new StringBuilder();
//     int startIndex = s.length()-1;
//         while(startIndex >= 0){
//             while(startIndex >= 0 && s.charAt(startIndex) == ' '){
//                 startIndex--;
//             }
//             if(startIndex < 0){
//                 break;
//             }
//             int endIndex = startIndex;
//             while(startIndex >= 0 && s.charAt(startIndex) != ' '){
//                 startIndex--;
//             }
//             if(ans.length() == 0){
//                 ans.append(s.substring(startIndex+1,endIndex+1));
//             }else{
//                 ans.append(" ");
//                 ans.append(s.substring(startIndex+1,endIndex+1));
//             }
//         }
//         return ans.toString();
//     }
// }