package com.algorithms.Chapter1_2;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex06 {
    public static void main(String[] args) {
        String s = StdIn.readString();
        String t = StdIn.readString();

        if (s.length() == t.length()) {
            int N = s.length();
            for (int i = 0; i < N; i++) {
                char c = s.charAt(i);
                int fromIndex = 0;
                int j;
                while ((j = t.indexOf(c, fromIndex)) >= 0) {
                    fromIndex = j + 1;
                    int l = i;
                    int k;
                    for (k = j + 1; k % N != j; k++) {
                        l++;
                        if (s.charAt(l % N) != t.charAt(k % N)) {
                            break;
                        }
                    }

                    if (k % N == j) {
                        StdOut.println(s + "is a circular rotation of a string " + t);
                        return;
                    }
                }
            }
        }

        StdOut.println(s + "is not a circular rotation of a string " + t);
    }
}
