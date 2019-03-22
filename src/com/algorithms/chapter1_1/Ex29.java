package com.algorithms.chapter1_1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex29 {
    public static int rank(int key, int[] a, int lo, int hi) {
        if (lo > hi) return -1;
        int mid = lo + (hi - lo) / 2;
        if (key < a[mid]) return rank(key, a, lo, mid - 1);
        else if (key > a[mid]) return rank(key, a, mid + 1, hi);
        else return mid;
    }

    public static int rank(int key, int[] a) {
        int keyIndex = rank(key, a, 0, a.length - 1);

        if (keyIndex == -1) {
            return -1;
        }

        while ((keyIndex > 0) && (a[keyIndex] == key)) {
            keyIndex--;
        }

        return keyIndex + 1;
    }

    public static int count(int key, int[] a) {
        int keyIndex = rank(key, a);
        int keyCount = 1;
        if (keyIndex < 0) {
            return -1;
        }

        while (a[keyIndex] == a[++keyIndex]) {
            keyCount++;
        }

        return keyCount;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 4, 4, 4, 5, 6, 7, 7, 7};
        StdOut.println("Input the key:");
        int key = StdIn.readInt();
        StdOut.println("The number of elements that smaller than the key is " + rank(key, a) + "\nThe euqal is " + count(key, a));
    }
}
