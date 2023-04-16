import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SubstractTheProductandSum1281 {
    public static void main(String[] args) {
        System.out.println(substractProductAndSum(1234));
    }


    //just streams
    public static int substractProductAndSum(int n) {
        int sum = String.valueOf(n).chars().map(Character::getNumericValue).sum();
        int product = String.valueOf(n).chars().map(Character::getNumericValue).reduce(1, (a,b) -> a * b);

        return product - sum;
    }
}
