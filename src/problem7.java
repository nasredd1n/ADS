public class problem7 {
    public static void printPermutations(String s) {
        char[] chars = s.toCharArray();
        printPermutations(chars, 0);
    }

    private static void printPermutations(char[] chars, int index) {
        if (index == chars.length - 1) {
            System.out.println(new String(chars)); // base case: print permutation when last index is reached
        } else {
            for (int i = index; i < chars.length; i++) {
                swap(chars, index, i);
                printPermutations(chars, index + 1); // recursive call with next index
                swap(chars, index, i);
            }
        }
    }

    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}
