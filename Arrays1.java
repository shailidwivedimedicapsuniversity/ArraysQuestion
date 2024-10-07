package Arrays;
public class Arrays1{
    // passing array as an argument
    public static void update(int marks[], int number){
        number = 1110;
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String args[]){
        int marks[] = {95,96,97};
        int n = 3;
        update(marks, n);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(n);

    }
}