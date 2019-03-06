package org.mpak.codewars;

/**
 * Probles:
 * <pre>
 * An isogram is a word that has no repeating letters, consecutive or non-consecutive.
 * Implement a function that determines whether a string that contains only letters is an isogram.
 * Assume the empty string is an isogram. Ignore letter case.
 *
 * isIsogram "Dermatoglyphics" == true
 * isIsogram "moose" == false
 * isIsogram "aba" == false
 * </pre>
 * @author Andrei Kuzniatsou
 */
public class Isograms {

    public static void main(String[] args) {
        System.out.println(isIsogram(""));
    }

    public static boolean isIsogram(String str) {
        char[] chars = new char[255];
        for (char c : str.toLowerCase().toCharArray()) {
            if (chars[c] < 1) {
                chars[c] = c;
            } else {
                return false;
            }
        }
        return true;
    }
}
