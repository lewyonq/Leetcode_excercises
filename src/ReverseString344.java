/*
Write a function that reverses a string.
The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.
 */

public class ReverseString344 {
    public static void main(String[] args) {
        char[] test = new char[]{'h','e','l','l','o'};
        reverseString(test);
        for(char c : test) {
            System.out.print(c);
        }
    }

    public static void reverseString(char[] s) {
        for(int i = 0; i < (s.length / 2); i++) {
            char temp = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = temp;
        }
    }
}
