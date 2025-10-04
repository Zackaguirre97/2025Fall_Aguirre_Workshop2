package com.pluralsight;

public class InputUtils {
    public static boolean isInteger(String s) {
        if (s == null || s.isEmpty()) return false;
        try {
            Integer.parseInt(s);
            return true;
        }  catch (NumberFormatException e) {
            return false;
        }
    }
}
