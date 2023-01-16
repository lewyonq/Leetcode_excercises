import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortedArray88Test {
    @Test
    void leetCodeFirstCondition() {
        int[] nums = new int[]{1,2,3,0,0,0};
        MergeSortedArray88.merge(nums, 3, new int[]{2,5,6}, 3);
        assertArrayEquals(new int[]{1,2,2,3,5,6}, nums);
    }

    @Test
    void leetCodeSecondCondition() {
        int[] nums = new int[]{1};
        MergeSortedArray88.merge(nums, 1, new int[]{}, 0);
        assertArrayEquals(new int[]{1}, nums);
    }

    @Test
    void myCondition() {
        int[] nums = new int[]{3,5,7,0,0,0,0,0};
        MergeSortedArray88.merge(nums, 3, new int[]{1,2,4,8,11}, 5);
        assertArrayEquals(new int[]{1,2,3,4,5,7,8,11}, nums);
    }

    @Test
    void noElements() {
        int[] nums = new int[]{0};
        MergeSortedArray88.merge(nums, 0, new int[]{1}, 1);
        assertArrayEquals(new int[]{1}, nums);
    }

}