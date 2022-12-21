import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElement27Test {

    @Test
    void LengthEquals8() {
        assertEquals(8, RemoveElement27.removeElement(new int[]{3,2,2,3,4,1,3,5,6,3,3,1,3,2,3,3}, 3));
    }

    @Test
    void LengthEquals3() {
        assertEquals(3, RemoveElement27.removeElement(new int[]{3,2,3,4,3,3,1,3}, 3));
    }

    @Test
    void LengthEquals0() {
        assertEquals(0, RemoveElement27.removeElement(new int[]{3,3,3}, 3));
    }

    @Test
    void LengthEquals1() {
        assertEquals(1, RemoveElement27.removeElement(new int[]{0,0,1,0,0,0}, 0));
    }
}