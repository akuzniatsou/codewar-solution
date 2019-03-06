package org.mpak.codewars;

import org.junit.Test;
import org.mpak.codewars.ShortestWord;

import static org.junit.Assert.assertEquals;

/**
 * @author Andrei Kuzniatsou
 */
public class ShortestWordTest {

    @Test
    public void testSolution() {
        assertEquals(3, ShortestWord.findShort("bitcoin take over the world maybe who knows perhaps"));
        assertEquals(3, ShortestWord.findShort("turns out random test cases are easier than writing out basic ones"));
        assertEquals(1, ShortestWord.findShort("turns out random test cases are easier than writing out basic s"));
        assertEquals(1, ShortestWord.findShort("turns out   random test cases are easier than writing out basic s"));
    }

}
