import java.util.Arrays;

public class MinimumSumofFourDigitNumberAfterSplittingDigits2160 {
    public static void main(String[] args) {
        System.out.println(minimumSum(2932));
    }

    public static int minimumSum (int num) {
        char[] chars = String.valueOf(num).toCharArray();
        Arrays.sort(chars);
        return ((int) chars[0] - 48) * 10 +
               ((int) chars[1] - 48) * 10 +
               ((int) chars[2] - 48) +
               ((int) chars[3] - 48);
    }
}
