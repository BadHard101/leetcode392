package org.example;

public class Main {
    public static boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) return true;

        int posS = 0;
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == s.charAt(posS)) {
                posS++;
                if (posS == s.length()) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}