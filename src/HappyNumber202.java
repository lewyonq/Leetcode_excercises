import java.util.HashSet;
import java.util.Set;

public class HappyNumber202 {
    public static void main(String[] args) {
        System.out.println(isHappy(3));
    }

    public static boolean isHappy(int n) {
        int current = squareOfDigits(n);
        Set<Integer> set = new HashSet<>();

        while (!set.contains(current)) {
            set.add(current);
            current = squareOfDigits(current);
            if (current == 1) break;
        }

        return current == 1 ? true : false;
    }

    public static int squareOfDigits(int n) {
        char[] numbers = String.valueOf(n).toCharArray();
        int result = 0;

        for (char number : numbers) {
            result += Math.pow((int) (number - 48), 2);
        }

        return result;
    }
}
