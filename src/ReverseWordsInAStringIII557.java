/*
Given a string s, reverse the order of characters in each word
within a sentence while still preserving whitespace and initial word order.
 */

import java.util.Arrays;
import java.util.List;

public class ReverseWordsInAStringIII557 {
    public static void main(String[] args) {
        String test = "Let's take LeetCode contest";
        String revTest = reverseWords(test);
        System.out.println(revTest);
    }

    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] sArray = s.split(" ");

        for(String word: sArray) {
            sb.append(reverseString(word.toCharArray()));
            sb.append(" ");
        }
        sb.setLength(sb.length() - 1);

        return sb.toString();

        //a bit slower version
//        List<String> sList = Arrays.asList(s.split(" "));
//        for (int i = 0; i < sList.size(); i++) {
//            sList.set(i, reverseString(sList.get(i).toCharArray()));
//        }
//        return String.join(" ", sList);
    }

    public static String reverseString(char[] s) {
        for(int i = 0; i < (s.length / 2); i++) {
            char temp = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = temp;
        }
        return String.valueOf(s);
    }
}
