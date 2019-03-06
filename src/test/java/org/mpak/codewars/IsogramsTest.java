package org.mpak.codewars;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Andrei Kuzniatsou
 */
public class IsogramsTest {
    @Test
    public void testSolution() {
        assertEquals(true, Isograms.isIsogram("Dermatoglyphics"));
        assertEquals(true, Isograms.isIsogram("Isogram"));
        assertEquals(false, Isograms.isIsogram("moose"));
        assertEquals(false, Isograms.isIsogram("isIsogram"));
        assertEquals(false, Isograms.isIsogram("aba"));
        assertEquals(false, Isograms.isIsogram("moOse"));
        assertEquals(true, Isograms.isIsogram("thumbscrewjapingly"));
        assertEquals(true, Isograms.isIsogram(""));
    }
}
