import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefix14Test {

    @Test
    void longestCommonPrefixForArrayOf3Strings() {
        assertEquals("fl",LongestCommonPrefix14.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }

    @Test
    void longestCommonPrefixForArrayOf3Strings2() {
        assertEquals("",LongestCommonPrefix14.longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }
}