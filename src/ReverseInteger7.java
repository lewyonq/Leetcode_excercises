/*
Given a signed 32-bit integer x, return x with its digits reversed.
If reversing x causes the value to go outside the signed 32-bit integer range [-2^31, 2^31 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 */
public class ReverseInteger7 {
    public static void main(String[] args) {
        System.out.println(reverse(-96463241));
    }

    public static int reverse(int x) {
        String number = String.valueOf(x);
        char[] numberArray;
        boolean isNegative = false;

        if(number.startsWith("-")) {
            isNegative = true;
            numberArray = number.substring(1).toCharArray();
        } else {
            numberArray = number.toCharArray();
        }

        for(int i = 0; i < (numberArray.length / 2); i++) {
            char temp = numberArray[i];
            numberArray[i] = numberArray[numberArray.length - 1 - i];
            numberArray[numberArray.length - 1 - i] = temp;
        }
        int result = Integer.parseInt(String.valueOf(numberArray));
        return (isNegative) ? -result : result;
    }
}
