
import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicateCharacterFromString {
    public static void removeDuplicateCharacterFromString(String str){
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for(int i=0;i<str.length();i++){
            set.add(str.charAt(i));
        }
        System.out.print("Answer is : ");
        for(char ch : set){
            System.out.print(ch);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = scanner.nextLine();
        removeDuplicateCharacterFromString(str);


    }
    
}
