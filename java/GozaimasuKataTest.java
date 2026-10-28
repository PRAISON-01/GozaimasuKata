package test.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GozaimasuKataTest {
    @Test
    //    @CsvSource(
//            value = {
//                    "Good morning,   Good",
//                    "Aojodhui ou mecredi, ou"
//            }
//    )
    public void testThat_methodReturnsShortestString(){
        String sentence = ". There .. tide";
        String expected = "tide";
        String actual = GozaimasuKata.getShortestWord(sentence);
        assertEquals(expected, actual);
    }

    @Test
    public void testThat_methodReturnsSortedAndSquaredArray() {
        int[] array = {3, 2, 7 , 1, 4};
        int[] expected = {1, 4, 9, 16, 49};
        int[] actual = GozaimasuKata.squareAndSortArray(array);
        assertArrayEquals(expected, actual);
    }
}
