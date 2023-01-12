import java.util.Arrays;

/*
Given an integer array nums sorted in non-decreasing order,
return an array of the squares of each number sorted in non-decreasing order.
 */
public class SquaresOfASortedArray977 {
    public static void main(String[] args) {
        int[] num = sortedSquares(new int[]{-4,-1,0,3,10});
        for(int n : num) {
            System.out.println(n);
        }
    }

    public static int[] sortedSquares(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            nums[i] *= nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
