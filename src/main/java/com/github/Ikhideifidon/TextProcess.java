package com.github.Ikhideifidon;

public class TextProcess {

    // T(n) = O(mn) worst case
    public static int findBruteForce(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();
        if (m > n) return -1;
        for (int i = 0; i <= m - n; i++) {
            int index = 0;                  // Start index
            while (index < n && text.charAt(i + index) == pattern.charAt(index))
                index++;
            if (index == n)
                return i;
        }
        // Failed search
        return -1;
    }
}
