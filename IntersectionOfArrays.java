package Arrays;

import java.util.ArrayList;
// import java.util.*;

public class IntersectionOfArrays {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {2,3,4,8,9};
        ArrayList<Integer> list = new ArrayList<>();
        // List <Integer> result = new ArrayList<>();
        // TC = O(n^2)
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                if(arr1[i]==arr2[j]){
                    list.add(arr1[i]);
                    break;
                }
            }
        }
        System.out.println(list);

    }
}
