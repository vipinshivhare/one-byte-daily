
public class FirstWordInUpperCase {

    public static String firstWordInUpperCase(String s){
        String[] arr = s.split(" ");
        StringBuilder ans = new StringBuilder();

        for(int i=0;i<arr.length;i++){
            String word = arr[i];
            String capsWord = word.substring(0,1).toUpperCase() + word.substring(1);

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
