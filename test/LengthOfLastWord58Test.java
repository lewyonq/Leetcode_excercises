import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthOfLastWord58Test {

    @Test
    void lengthEquals7() {
        assertEquals(7, LengthOfLastWord58.lengthOfLastWord("  AC BD E ABCDEFG"));
    }

    @Test
    void lengthEquals0() {
        assertEquals(0, LengthOfLastWord58.lengthOfLastWord("    \n  "));
    }

    @Test
    void lengthEquals4() {
        assertEquals(4, LengthOfLastWord58.lengthOfLastWord(" a b c d efgh"));
    }
}