/*
Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
The relative order of the elements may be changed.

Since it is impossible to change the length of the array in some languages,
you must instead have the result be placed in the first part of the array nums.
More formally, if there are k elements after removing the duplicates,
then the first k elements of nums should hold the final result.
It does not matter what you leave beyond the first k elements.

Return k after placing the final result in the first k slots of nums.

Do not allocate extra space for another array.
You must do this by modifying the input array in-place with O(1) extra memory.
 */

import java.util.Arrays;

public class RemoveElement27 {
    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{3,2,2,3,4,1,3,5,6,3,3,1,3,2,3,3}, 3));
        System.out.println(removeElement(new int[]{3,2,2,3}, 3));
    }

    public static int removeElement(int[] nums, int val) {
        nums = Arrays.stream(nums).filter(n -> n != val).toArray();

        Arrays.stream(nums).forEach(n -> System.out.println(n));
        return nums.length;
    }
}
