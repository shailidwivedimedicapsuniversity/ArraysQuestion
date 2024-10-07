public class MinimumMoves2 {

    public static int minMoves(String word) {
        int[] charCount = new int[26]; // To store frequency of each character
        int removals = 0;

        // Count frequency of each character
        for (char c : word.toCharArray()) {
            charCount[c - 'a']++;
        }

        // Iterate through each character's frequency
        for (int count : charCount) {
            // If a character appears more than once, it can be completely removed
            if (count > 1) {
                removals += count - 1;
            }
        }

        return removals;
    }

    public static void main(String[] args) {
        String word = "baabacaa";
        int minMoves = minMoves(word);
        System.out.println("Minimum moves required: " + minMoves);
    }
}
