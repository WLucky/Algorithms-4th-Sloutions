package com.algorithms.chapter1_1;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class Ex38 {
    public static void main(String[] args) {
        In in = new In(args[0]);
        int[] whitelist = in.readAllInts();
        StdOut.println("whitelist size: " + whitelist.length);
        long startTime;
        long endTime;
        in = new In(args[1]);
        int[] keys = in.readAllInts();
        StdOut.println("keys size: " + keys.length);

        StdOut.println("BruteForceSearch:");
        int mismatchCount = 0;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < keys.length; i++) {
            if (BruteForceSearch.rank(keys[i], whitelist) == -1) {
                mismatchCount++;
            }
        }
        endTime = System.currentTimeMillis();
        StdOut.println("BruteForceSearch  mismatchCount " + mismatchCount);
        StdOut.println("BruteForceSearch Time " + (endTime - startTime) + " milliseconds. ");

        Arrays.sort(whitelist);
        StdOut.println("BinarySearch:");
        mismatchCount = 0;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < keys.length; i++) {
            if (BinarySearch.rank(keys[i], whitelist) == -1) {
                mismatchCount++;
            }
        }
        endTime = System.currentTimeMillis();
        StdOut.println("BinarySearch  mismatchCount " + mismatchCount);
        StdOut.println("BinarySearch Time " + (endTime - startTime) + " milliseconds.");

    }
}

/* 尝试使用文件重定向输入 没有成功  使用了命令行参数模式 */

//whitelist size: 1000000
//keys size: 1000000
//BruteForceSearch:
//BruteForceSearch  mismatchCount 367966
//BruteForceSearch Time 145410 milliseconds.
//BinarySearch:
//BinarySearch  mismatchCount 367966
//BinarySearch Time 157 milliseconds.
