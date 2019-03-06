package org.mpak.codewars;

/**
 * Problem:
 * <pre>
 * Simple, given a string of words, return the length of the shortest word(s).
 * String will never be empty and you do not need to account for different data types.
 * </pre>
 * @author Andrei Kuzniatsou
 */
class ShortestWord {

    static int findShort(String s) {
        int min = s.length();
        int temp = 0;
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                min = temp > 0 ? Math.min(temp, min) : min;
                temp = 0;
            } else {
                temp++;
            }
        }
        return Math.min(temp, min);
    }
}
