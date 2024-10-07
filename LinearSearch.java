package Arrays;
import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        // taking an arrAY as input from user
        System.out.println("taking arrray of 5 length as input");
        for(int i=0; i<arr.length; i++ ){
            arr[i] = sc.nextInt();
        }
        System.out.print("Your array is : ");
        for(int i=0; i<arr.length; i++ ){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("Enter a Key to search : ");
        int key = sc.nextInt();
        for(int i=0; i<arr.length; i++){
            if(arr[i]==key){
                System.out.println("Index is :"+i);
                return;
            }
        }
        System.out.println("Index is not found in given array");
    }
    
}
