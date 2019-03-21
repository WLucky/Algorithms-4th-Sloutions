package com.algorithms.chapter1_1;

import edu.princeton.cs.algs4.StdOut;

public class Ex16 {
    public static String exR1(int n) {
        if (n <= 0) return "";
        return exR1(n - 3) + n + exR1(n - 2) + n;
    }

    public static void main(String[] args) {
        String result = exR1(6);
        StdOut.println(result);
    }
}

//311361142246
