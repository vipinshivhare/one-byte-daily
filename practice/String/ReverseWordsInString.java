
public class ReverseWordsInString {

    public static String reverseWordsInString(String s){
        String arr[] = s.split(" ");
        StringBuilder ans = new StringBuilder();
        for(int i = arr.length-1;i>=0;i--){
            if(arr[i].length() == 0){
                continue;
            }
            // All letter in Upper case 
            // String word = arr[i];
            // String capWord = word.toUpperCase();

            // fist letter in Lowecase and Rest is in Uppercase
            // String word = arr[i];
            // String capWord = word.substring(0,1)+word.substring(1).toUpperCase();


            // only first word in upperCase
            String word = arr[i];
            String capWord = word.substring(0,1).toUpperCase()+word.substring(1);

            if(ans.length() == 0){
                ans.append(capWord);

            }else{
                ans.append(" ");
                ans.append(capWord);
            }
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String s = "the sky is blue";
        // O/P - blue is sky the
        System.out.print(reverseWordsInString(s));
    }
}
