
import java.util.*;

public class UnionOfSortedArrays {
    public static void main(String[] args) {
        int []arr1 = {1,2,3,4,5};
        int []arr2 = {1,2,3,7,8};
        int left = 0 ;
        int right = 0;
        List <Integer> result = new ArrayList();
        while(left<arr1.length || right<arr2.length){
            // skip duplicates 
            while(left>0 && left<arr1.length &&  arr1[left]==arr1[left-1]){
               left++;
            }   
            while(right>0 && right<arr2.length && arr2[right]==arr2[right-1]){
                right++;
            }
            // if one arr exhausted 
            if(left >= arr1.length){
                result.add(arr2[right]);
                right++;
                continue;
            }
             if(right >= arr2.length){
                result.add(arr1[left]);
                left++;
                continue;
            }
            // conparision
            if(arr1[left]<arr2[right]){ 
                result.add(arr1[left]);
                left++;
            }else if(arr1[left]>arr2[right]){
                result.add(arr2[right]);
                right++;
            }else{
                result.add(arr1[left]);
                right++;
                left++;
            }
        }
        System.out.println(result);
    }
    
}
