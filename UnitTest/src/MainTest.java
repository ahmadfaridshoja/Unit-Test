import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void reverseArrTest() {
        char[] input = {'a', 's', 'd'};
        char[] expected = {'d', 's', 'a'};
        char[] test= Main.reverseArr(input);
        assertArrayEquals(expected,test);
    }
}