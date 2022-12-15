import java.util.Arrays;
import java.util.stream.IntStream;

public class LongestCommonPrefix14 {
    /*
    Write a function to find the longest common prefix string amongst an array of strings.

    If there is no common prefix, return an empty string "".
     */
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";

        //starting from first whole word
        String pref = strs[0];

        //checking every word in strs array
        for(int i = 0; i < strs.length; i++) {
            //if a word have given prefix, index of this prefix is 0 - it starts from index = 0
            while(strs[i].indexOf(pref) != 0) {
                //if a word doesn't have given prefix, cut a letter from the end of the prefix
                pref = pref.substring(0, pref.length() - 1);
                if(pref.isEmpty()) return "";
            }
        }

        return pref;
    }
}
