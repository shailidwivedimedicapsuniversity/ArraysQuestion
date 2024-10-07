package Arrays;

public class LinearSeachInString {
    public static void linearSearch(String arr[], String key){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==key){
                System.out.print("key found at index :" +i);
                return;
            }
        }
        System.out.println("key does not found");
    }
    public static void main(String[] args) {
        String subjects[] = {"English","Hindi","Math","Science","Arts","Commerce"};
        linearSearch(subjects, "Art");
    }
    
}
