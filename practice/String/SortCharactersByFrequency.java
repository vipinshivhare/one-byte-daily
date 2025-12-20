
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class SortCharactersByFrequency {
    public static String sortCharactersByFrequency(String s){
        Map<Character, Integer> map = new HashMap<>();
        for( char ch : s.toCharArray() ) {
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        List<Character> list = new ArrayList<>(map.keySet());
        StringBuilder sb = new StringBuilder();
        list.sort((a,b) -> map.get(b) - map.get(a));
        // ye pta h na b-a se descending order me hota hai to bs wahi concept hai bs 
        //yha map.get(b) -map.get(a) kr dia hai to (map.get se frequencey atti hai na ) 
        //to freq ke basis pr desc me sort kr dia 
        for(char c : list){
            for(int i=0;i<map.get(c);i++){//  like c ki jitni freq hogi utni baar print ho jaiga 
                sb.append(c);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String : "); // tree
        String s = scanner.next();
        // System.out.println(s);
        System.out.println(sortCharactersByFrequency(s));// eert
    }
}
