/*
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n,
representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged,
 and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
 */

import java.util.Arrays;

public class MergeSortedArray88 {
    public static void main(String[] args) {
        int[] nums = new int[]{3,4,5,0,0,0};
        merge(nums, 3, new int[]{1,2,6}, 3);
        Arrays.stream(nums).forEach(n -> System.out.println(n));
    }

    static void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m == 0) {
            for(int i = 0; i < nums1.length; i++) {
                nums1[i] = nums2[i];
            }
            return;
        }
        if (n == 0) {
            return;
        }

        int lastUnmergedIndexOfNums1 = m - 1;
        int lastUnmergedIndexOfNums2 = n - 1;

        for(int i = 0; i < nums1.length; i++) {
            if(checkIfAnyArrayFinished(nums1, lastUnmergedIndexOfNums1, nums2, lastUnmergedIndexOfNums2)) {
                return;
            }

            if(nums1[lastUnmergedIndexOfNums1] > nums2[lastUnmergedIndexOfNums2]) {
                nums1[nums1.length - i - 1] = nums1[lastUnmergedIndexOfNums1];
                lastUnmergedIndexOfNums1--;
            } else {
                nums1[nums1.length - i - 1] = nums2[lastUnmergedIndexOfNums2];
                lastUnmergedIndexOfNums2--;
            }
        }

    }

    static boolean checkIfAnyArrayFinished(int[] nums1, int num1Index, int[] nums2, int num2Index) {
        if(num1Index < 0) {
            for(int k = 0; k <= num2Index; k++) {
                nums1[k] = nums2[k];
            }
            return true;
        }

        if(num2Index < 0) {
            return true;
        }

        return false;
    }


}
