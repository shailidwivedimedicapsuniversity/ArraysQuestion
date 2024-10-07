package Arrays;

public class BasicPatterns {
    public static void printTraingle(int n) {
        //  Alphabetic hill equilater traingle
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }

            char ch = 'A';
            for(int j=1; j<=2*i-1; j++){
                System.out.print(ch+" ");
                if(j<i){
                    ch++;
                }   else{
                    ch--;
                }
            }
            System.out.println();
        }
    }

    public static void reverseHalfPyramid(int n){
        for(int i=n; i>=1; i--){
            char ch = (char)('A'+n-i) ;
            for(int j=1; j<=i; j++){
                System.out.print(ch+" ");
                ch++; 
            }
            System.out.println();
        }
    } 
    public static void halfPyramidChar(int n){
         for(int i=1; i<=n; i++){
            char ch = (char)('A'+n-1) ;
            for(int j=1; j<=i; j++){
                System.out.print(ch+" ");
                ch--; 
            }
            System.out.println();
        } 
    }
    public static void halfPyramid(int n){
           for(int i=1; i<=n; i++){
            char ch = (char)('A'+n-i) ;
            for(int j=1; j<=i; j++){
                System.out.print(ch+" ");
                ch++; 
            }
            System.out.println();
        }
    }
    public static void getNumberPattern(int n) {
        // Write your code here.
        for(int i=1; i<=2*n-1; i++){
            for(int j=1; j<=2*n-1; j++){
                int topD = i-1; 
                int leftD = j-1; 
                int rightD = (2*n-1)-j; 
                int downD = (2*n-1)-i;

                int val = Math.min(Math.min(topD, downD),
                Math.min(leftD,rightD));
                System.out.print(n-val+" ");
            }
            System.out.println();
        }
    }

    public static String printLargestString(String[] str){
        String largest = str[0];
        for(int i=1; i<str.length; i++){
            if(largest.compareTo(str[i])<0){
                largest = str[i];
            }
        }
        return largest;
    }

    public static int clearBitsInRange(int n, int i, int j){
        int a = (-1<<(j+1));
        int b = (1<<i)-1;
        int bitMask = a | b;
        return n&bitMask;
    }

    public static int countSetBits(int n){
        int count = 0;
        while (n>0) {
            n = n & (n-1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        // printTraingle(5);
        // reverseHalfPyramid(5);
        // halfPyramidChar(3);
        // halfPyramid(5);
        // getNumberPattern(3);
        String str[] = {"bhupendra", "dharmenda", "dhirendra"};
        // String str[]  = {"shaili","naili"};
        System.out.println(printLargestString(str));
        System.out.println(1%2);
        System.out.println(clearBitsInRange(2507, 2, 9));  
        System.out.println(countSetBits(15));      
    }
}
