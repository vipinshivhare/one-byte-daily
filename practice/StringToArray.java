// Qu - . You are given a single string containing multiple words separated by spaces. 
// Your task is to convert the string into an array of strings, where each array element
// contains one word from the input, and then print each word on a separate line


import java.util.Scanner;

public class StringToArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word : ");
        String s = sc.nextLine();

        String[] arr = s.trim().split("\\s+");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    
}
