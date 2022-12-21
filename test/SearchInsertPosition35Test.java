import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInsertPosition35Test {

    @Test
    void indexEquals2() {
        assertEquals(2, SearchInsertPosition35.searchInsert(new int[]{1,3,5,6}, 5));
    }

    @Test
    void indexEquals1() {
        assertEquals(1, SearchInsertPosition35.searchInsert(new int[]{1,3,5,6}, 2));
    }
}