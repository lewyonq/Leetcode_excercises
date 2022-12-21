/*
Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal substring consisting of non-space characters only.
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LengthOfLastWord58 {
    public static void main(String[] args) {
    }

    public static int lengthOfLastWord(String s) {
        s = s.strip();
        if(s.length() == 0) return 0;
        return s.substring(s.lastIndexOf(" ") + 1).length();

        //slower but working as well
//        List<String> l = Arrays.stream(s.strip().split(" ")).collect(Collectors.toList());
//        return l.get(l.size() - 1).length();
    }
}
