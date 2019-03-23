package com.algorithms.chapter1_1;

public class BinarySearch {

    public static int rank(int key, int[] a) {
        return rank(key, a, 0, a.length);
    }

    private static int rank(int key, int[] a, int lo, int hi) {
        if (lo > hi) {
            return -1;
        }
        int mid = (lo + hi) / 2;
        if (a[mid] == key) {
            return mid;
        } else if (a[mid] > key) {
            return rank(key, a, lo, mid - 1);
        } else {
            return rank(key, a, mid + 1, hi);
        }
    }
}
