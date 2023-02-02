/*
In an alien language, surprisingly, they also use English lowercase letters,
but possibly in a different order. The order of the alphabet is some permutation of lowercase letters.

Given a sequence of words written in the alien language, and the order of the alphabet,
return true if and only if the given words are sorted lexicographically in this alien language.
 */
public class VerifyingAnAlienDictionary953 {
    public static void main(String[] args) {
        System.out.println(isAlienSorted(new String[]{"hello", "leetcode"}, "hlabcdefgijkmnopqrstuvwxyz"));
    }

    public static boolean isAlienSorted(String[] words, String order) {
        for (int i = 0; i < words.length - 1; i++) {
            //condition if the second word is a sublist of first element
            if (words[i].contains(words[i + 1]) && words[i].length() > words[i + 1].length()) {
                return false;
            }
            for (int j = 0; j < Math.min(words[i].length(), words[i + 1].length()); j++) {
                if (order.indexOf(words[i].charAt(j)) > order.indexOf(words[i + 1].charAt(j))) {
                    return false;
                } else if (order.indexOf(words[i].charAt(j)) < order.indexOf(words[i + 1].charAt(j))) {
                    break;
                }
            }
        }

        return true;
    }
}
