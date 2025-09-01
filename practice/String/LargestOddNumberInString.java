
public class LargestOddNumberInString {
    public static String largestOddNumberInString(String s){
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i) % 2 != 0){
                return s.substring(0, i+1);
            }
        }
        return "";
    }
    public static void main(String[] args) {
        String s = "35427642";
        // O/P = 35427

        System.out.println(largestOddNumberInString(s));
    }
    
}
