import java.util.Arrays;
import java.util.Stack;
import java.util.stream.Collectors;

/*
Given an integer array nums, move all 0's to the end of it
while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.
 */
public class MoveZeros283 {
    public static void main(String[] args) {
        int[] nums = new int[]{0,0,0,1,2,3,0,4,0,5,0,6,0,7,1};
        moveZeroes(nums);
        for(int n : nums) {
            System.out.print(n);
        }
    }

    //search for a non-zero element, switch with the first zero element found in an array
    public static void moveZeroes(int[] nums) {
        int notZero = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                nums[notZero] = nums[i];
                notZero++;
            }
        }

        for(int i = notZero; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
