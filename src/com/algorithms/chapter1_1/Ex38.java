package com.algorithms.chapter1_1;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class Ex38 {
    public static void main(String[] args) {
        In in = new In(args[0]);
        int[] whitelist = in.readAllInts();
        long startTime;
        long endTime;
        int[] keys = StdIn.readAllInts();

        StdOut.println("BruteForceSearch:");
        startTime = System.currentTimeMillis();
        for (int i = 0; i < keys.length; i++) {
            if (BruteForceSearch.rank(keys[i], whitelist) == -1) {
                StdOut.println(keys[i]);
            }
        }
        endTime = System.currentTimeMillis();
        StdOut.println("BruteForceSearch Time " + (endTime - startTime) + " milliseconds.");

        Arrays.sort(whitelist);
        StdOut.println("BinarySearch:");
        startTime = System.currentTimeMillis();
        for (int i = 0; i < keys.length; i++) {
            if (BinarySearch.rank(keys[i], whitelist) == -1) {
                StdOut.println(keys[i]);
            }
        }
        endTime = System.currentTimeMillis();
        StdOut.println("BinarySearch Time " + (endTime - startTime) + " milliseconds.");

    }
}
