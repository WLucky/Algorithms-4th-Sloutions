package com.algorithms.chapter1_1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex23 {
    public static int rank(int key, int[] a) {
        return rank(key, a, 0, a.length - 1);
    }

    public static int rank(int key, int[] a, int lo, int hi) {
        if (lo > hi) return -1;
        int mid = lo + (hi - lo) / 2;
        if (key < a[mid]) return rank(key, a, lo, mid - 1);
        else if (key > a[mid]) return rank(key, a, mid + 1, hi);
        else return mid;
    }

    public static void main(String[] args) {
        StdOut.println("+ or -?");
        char symbol = StdIn.readChar();
        StdIn.readLine();
        int[] a = {1, 3, 5, 7};
        StdOut.println("Input keys:");
        String[] keys = StdIn.readLine().split(" ");
        for (int i = 0; i < keys.length; i++) {
            if ((symbol == '+') && (rank(Integer.parseInt(keys[i]), a) == -1)) {
                StdOut.printf("%-4s", keys[i]);
            } else if ((symbol == '-') && (rank(Integer.parseInt(keys[i]), a) > -1)) {
                StdOut.printf("%-4s", keys[i]);
            }
        }
        StdOut.println();
    }
}
