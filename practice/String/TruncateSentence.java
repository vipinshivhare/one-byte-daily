// 1816 Leetcode
public class TruncateSentence {

    public static String truncateSentence(String s, int k) {
        String[] str = s.split(" ");
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<k;i++){
            if(i != 0){
                ans.append(" "+str[i]); 
            }else{
            ans.append(str[i]); 
            }
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        int k = 4;
        System.out.println(truncateSentence(s,k));
        
    }
    
}




// Input: s = "Hello how are you Contestant", k = 4
// Output: "Hello how are you"
// Explanation:
// The words in s are ["Hello", "how" "are", "you", "Contestant"].
// The first 4 words are ["Hello", "how", "are", "you"].
// Hence, you should return "Hello how are you".
