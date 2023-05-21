import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedArray26Test {

    @Test
    void Array1() {
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        assertEquals(5, RemoveDuplicatesFromSortedArray26.removeDuplicates(nums));
    }

    @Test
    void Array2() {
        int[] nums = new int[]{1,1,2};
        assertEquals(2, RemoveDuplicatesFromSortedArray26.removeDuplicates(nums));
    }
}