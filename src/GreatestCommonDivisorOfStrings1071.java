/*
Given two strings str1 and str2, return the largest
string x such that x divides both str1 and str2.
 */

public class GreatestCommonDivisorOfStrings1071 {
    public static void main(String[] args) {
        System.out.println(gcdOfStrings("abcabc", "abc"));
    }

    public static String gcdOfStrings(String str1, String str2) {
        int maxLength = 0;
        String resultSubstring = "";

        for (int i = 1; i <= Math.min(str1.length(), str2.length()); i++) {
            String currentSubstring = str1.substring(0, i);
            if (isFactor(str1, currentSubstring) &&
                    isFactor(str2, currentSubstring) &&
                    currentSubstring.length() > maxLength) {
                maxLength = currentSubstring.length();
                resultSubstring = currentSubstring;
            }
        }

        return resultSubstring;
    }

    public static boolean isFactor(String s, String subs) {
        if(s.length() % subs.length() != 0) {
            return false;
        }

        for(int i = 0; i <= s.length() - subs.length(); i += subs.length()) {
            if (!s.substring(i, i + subs.length()).equals(subs)) {
                return false;
            }
        }

        return true;
    }
}

// first touch

//    public static String gcdOfStrings(String str1, String str2) {
//        int maxLength = 0;
//        String resultSubstring = "";
//
//        for (int i = 1; i <= Math.min(str1.length(), str2.length()); i++) {
//            String currentSubstring = str1.substring(0, i);
//            if (isFactor(str1, currentSubstring) &&
//                    isFactor(str2, currentSubstring) &&
//                    currentSubstring.length() > maxLength) {
//                maxLength = currentSubstring.length();
//                resultSubstring = currentSubstring;
//            }
//        }
//
//        return resultSubstring;
//    }
//
//    public static boolean isFactor(String s, String subs) {
//        if(s.length() % subs.length() != 0) {
//            return false;
//        }
//
//        for(int i = 0; i <= s.length() - subs.length(); i += subs.length()) {
//            if (!s.substring(i, i + subs.length()).equals(subs)) {
//                return false;
//            }
//        }
//
//        return true;
//    }
