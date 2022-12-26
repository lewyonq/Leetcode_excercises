import java.util.Arrays;

/*
Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order,
 find two numbers such that they add up to a specific target number.
 Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.

Return the indices of the two numbers, index1 and index2,
added by one as an integer array [index1, index2] of length 2.

The tests are generated such that there is exactly one solution. You may not use the same element twice.

Your solution must use only constant extra space.
 */
public class TwoSumII167 {
    public static void main(String[] args) {
        int[] result = twoSum(new int[]{-1,-1,1,1,1,1,1}, -2);
        for(int r : result) {
            System.out.println(r);
        }
    }

    public static int[] twoSum(int[] numbers, int target) {
        int firstElementIndex = 0;
        while(firstElementIndex != numbers.length - 1) {
            int secondElementIndex = Arrays.binarySearch(numbers,
                    firstElementIndex + 1,
                    numbers.length,
                    (target - numbers[firstElementIndex]));
            if(secondElementIndex > 0) {
                return new int[]{firstElementIndex + 1,secondElementIndex + 1};
            }
            firstElementIndex++;
        }
        return new int[]{};
    }
}