/*
Given a string s, find the length of the longest substring without repeating characters.
 */

public class LongestSubstringWithoutRepeatingCharacters3 {
    public static void main(String[] args) {
        String s = "au";
        System.out.println(lengthOfLongestSubstring(s));
    }

    // first touch, beats ~14% runtime ~55% memory
    static int lengthOfLongestSubstring(String s) {
        if (s.length() == 1)
            return 1;

        int maxLenght = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            int currentLength = 1;

            for (int j = i + 1; j < s.length(); j++) {
                if (s.substring(i, j).indexOf(s.charAt(j)) == -1) {
                    currentLength++;
                } else {
                    break;
                }
            }

            if (currentLength > maxLenght)
                maxLenght = currentLength;
        }

        return maxLenght;
    }
}