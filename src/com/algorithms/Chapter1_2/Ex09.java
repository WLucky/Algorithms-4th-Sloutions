package com.algorithms.Chapter1_2;

import edu.princeton.cs.algs4.Counter;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex09 {
    private static int rank(int key, int[] a, int lo, int hi, Counter counter) {
        if (lo > hi) {
            return -1;
        }
        counter.increment();
        int mid = (lo + hi) / 2;
        if (key < a[mid]) {
            return rank(key, a, lo, mid - 1, counter);
        } else if (key > a[mid]) {
            return rank(key, a, mid + 1, hi, counter);
        } else {
            return mid;
        }
    }

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int[] a = new int[N];

        for (int i = 0; i < N; i++) {
            a[i] = i;
        }

        StdOut.println("Please input the key:");
        int key = StdIn.readInt();
        Counter counter = new Counter("examin keys");
        int i = rank(key, a, 0, N - 1, counter);

        if (i < 0) {
            StdOut.println("no found!");
        } else {
            StdOut.println("the index of the key " + key + " in array is " + i);
        }

        StdOut.println(counter);
    }
}
