/*
An integer n is strictly palindromic if, for every base b between 2 and n - 2 (inclusive),
the string representation of the integer n in base b is palindromic.

Given an integer n, return true if n is strictly palindromic and false otherwise.

A string is palindromic if it reads the same forward and backward.
 */
public class StrictlyPalindromicNumber2396 {
    public static void main(String[] args) {
        System.out.println(isPalindromicInBase(9, 2));
    }

    public static boolean isStrictlyPalindromic(int n) {
        for (int i = 2; i <= n - 2; i++) {
            if(!isPalindromicInBase(n, i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindromicInBase(int number, int base) {
        StringBuilder sb = new StringBuilder();

        while (number > 0) {
            int r = number % base;
            sb.append(r);
            number /= base;
        }
        return sb.toString().equals(sb.reverse().toString()) ? true : false;
    }
}
