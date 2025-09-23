
import java.util.*;

public class CharacterFrequency {
    public static int characterFrequency(String str, char ch){
        int count = 0;
        for(int i=0;i<str.length();i++){
            if(Character.toLowerCase(str.charAt(i)) == Character.toLowerCase(ch)) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = scanner.nextLine();

        System.out.print("Enter the character : ");
        char ch = scanner.next().charAt(0);

        System.out.println("Frequency of "+ch+" is "+characterFrequency(str,ch));

        scanner.close();
    }
    
}
