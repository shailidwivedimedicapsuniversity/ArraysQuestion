import java.util.*;
public class MinimumMoves {
    public static int minMoves(String word) {
        int n = word.length();
        int[] leftOccurrences = new int[n]; // stores the index of the leftmost occurrence of each character
        int[] rightOccurrences = new int[n]; // stores the index of the rightmost occurrence of each character
        
        // Initialize leftOccurrences array
        int[] firstIndex = new int[26]; // to store the first index of each character
        for (int i = 0; i < n; i++) {
            int index = word.charAt(i) - 'a';
            leftOccurrences[i] = firstIndex[index];
            firstIndex[index] = i + 1;
        }
        
        // Initialize rightOccurrences array
        Arrays.fill(firstIndex, 0); // reset the array
        for (int i = n - 1; i >= 0; i--) {
            int index = word.charAt(i) - 'a';
            rightOccurrences[i] = firstIndex[index];
            firstIndex[index] = i + 1;
        }
        
        int minMoves = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int moves = 1; // initial move to delete the character itself
            if (leftOccurrences[i] != 0) moves++; // if there's a left occurrence to delete
            if (rightOccurrences[i] != 0) moves++; // if there's a right occurrence to delete
            minMoves = Math.min(minMoves, moves);
        }
        return minMoves;
    }

    public static void main(String[] args) {
        String word = "adabacaea"; 
        int result = minMoves(word);
        System.out.println("Minimum number of moves: " + result); // Output: Minimum number of moves: 2
    }
}   