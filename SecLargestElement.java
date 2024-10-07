package Arrays;
public class SecLargestElement{
    public static int secondLargest(int arr[]){
        int largest = arr[0];
        int secLargest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length; i++){
            if(largest<arr[i]){
                secLargest = largest;
                largest = arr[i];
            }  else if(arr[i]<largest &&arr[i]>secLargest){
                secLargest = arr[i];
            }
        }
        return secLargest;
    }
    public static int secondSmallest(int arr[]){
        int smallest =arr[0];
        int secSmallest = Integer.MAX_VALUE;
        for(int i=0;i<arr.length; i++){
            if(smallest>arr[i]){
                secSmallest = smallest;
                smallest= arr[i];
            }else if(arr[i]>smallest && arr[i]<secSmallest){
                secSmallest = arr[i];
            }
        }
        return secSmallest;
    }
    public static void main(String[] args) {
        // int arr[]= {1,2,3,5,4};
        int arr[] ={7,2,1,5,3};
        int secLargest = secondLargest(arr);
        int secSmallest = secondSmallest(arr);
        System.out.println(secLargest);
        System.out.println(secSmallest);
    }
}

