package org.mpak.codewars;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mpak.codewars.TheSupermarketQueue;

/**
 * @author Andrei Kuzniatsou
 */
public class TheSupermarketQueueTest {

    @Test
    public void testSolution() {
        assertEquals(12, TheSupermarketQueue.queueTime(new int[]{5, 3, 4}, 1));
        assertEquals(7, TheSupermarketQueue.queueTime(new int[]{5, 3, 4}, 2));
        assertEquals(12, TheSupermarketQueue.queueTime(new int[]{2, 3, 10}, 2));
        assertEquals(10, TheSupermarketQueue.queueTime(new int[]{2, 3, 10}, 3));
        assertEquals(10, TheSupermarketQueue.queueTime(new int[]{10, 2, 3, 3}, 2));
        assertEquals(30, TheSupermarketQueue.queueTime(new int[]{10, 2, 15, 3, 2, 6, 20}, 3));
        assertEquals(22, TheSupermarketQueue.queueTime(new int[]{10, 2, 15, 3, 2, 6, 20}, 5));
        assertEquals(22, TheSupermarketQueue.queueTime(new int[]{10, 2, 15, 3, 2, 6, 20}, 6));
        assertEquals(20, TheSupermarketQueue.queueTime(new int[]{10, 2, 15, 3, 2, 6, 20}, 10));
        assertEquals(0, TheSupermarketQueue.queueTime(new int[]{}, 1));
    }
}
