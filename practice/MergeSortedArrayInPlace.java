// 88 leetcode - here they gave space of 1 and 2 arrays in 1st array means gave space of 2 array in first array itself

import java.util.Scanner;

public class MergeSortedArrayInPlace {

    public static void mergeSortedArrayInPlace(int[] arr1,int n1, int[] arr2, int n2){
        int p1 = n1 -1;
        int p2 = n2 -1;
        int right = n1 + n2 -1;
        
        while(p2 >= 0){
            if(p1>=0 && arr1[p1] > arr2[p2]){
                arr1[right] = arr1[p1];
                p1--;
            }else{
                arr1[right] = arr2[p2];
                p2--;
            }
            right--;
        }
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of first array : ");
        int n1 = sc.nextInt();

        System.out.print("Enter the size of second array : ");
        int n2 = sc.nextInt();

        int[] arr1 = new int[n1+n2];
        // 2 1 10 23 14 21 4
        System.out.print("Enter "+n1+" elements : ");
        for(int i=0;i<n1;i++){
            arr1[i] = sc.nextInt();
        }

        int[] arr2 = new int[n2];
        System.out.print("Enter "+n2+" elements : ");
        for(int i=0;i<n2;i++){
            arr2[i] = sc.nextInt();
        }

        mergeSortedArrayInPlace(arr1, n1, arr2, n2);
        
        for(int i=0;i<n1+n2;i++){
            System.out.print(arr1[i] + " ");
        }
        


    }
    
}
