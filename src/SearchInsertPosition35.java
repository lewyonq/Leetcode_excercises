/*
Given a sorted array of distinct integers and a target value,
return the index if the target is found. If not,
return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.
 */

import java.util.Arrays;

public class SearchInsertPosition35 {
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1,3,5}, 4));
    }

    public static int searchInsert(int[] nums, int target) {
        int index = Arrays.binarySearch(nums,target);
        return index >= 0 ? index : - index - 1;
    }
}
