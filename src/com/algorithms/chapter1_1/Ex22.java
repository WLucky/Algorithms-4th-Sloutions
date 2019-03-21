package com.algorithms.chapter1_1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex22 {
    public static int rank(int key, int[] a) {
        return rank(key, a, 0, a.length - 1, 0);
    }

    public static int rank(int key, int[] a, int lo, int hi, int depth) {
        // Index of key in a[], if present, is not smaller than lo
        // and not larger than hi.
        for (int i = 0; i < depth; i++) {
            StdOut.print(" ");
        }
        StdOut.printf("lo = %d, hi = %d\n", lo, hi);
        if (lo > hi) return -1;
        int mid = lo + (hi - lo) / 2;
        if (key < a[mid]) return rank(key, a, lo, mid - 1, depth + 1);
        else if (key > a[mid]) return rank(key, a, mid + 1, hi, depth + 1);
        else return mid;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int key = StdIn.readInt();

        StdOut.printf("The index of the key is %d", rank(key, a));
    }
}
