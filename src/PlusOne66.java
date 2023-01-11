import java.util.Arrays;
import java.util.stream.Stream;

/*
You are given a large integer represented as an integer array digits,
where each digits[i] is the ith digit of the integer. The digits are ordered
from most significant to least significant in left-to-right order.
The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.
 */
public class PlusOne66 {
    public static void main(String[] args) {
        int[] test = plusOne(new int[]{9,9,9,9,9});
        for (int t : test) {
            System.out.println(t);
        }
    }

    static int[] plusOne(int[] digits) {
        for(int i = digits.length - 1; i > 0; i--) {
            digits[i]++;

            if(digits[i] != 10) {
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        digits[0]++;
        if(digits[0] == 10) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            return result;
        } else {
            return digits;
        }
    }
}
