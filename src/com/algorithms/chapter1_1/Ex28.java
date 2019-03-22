package com.algorithms.chapter1_1;

import edu.princeton.cs.algs4.BinarySearch;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex28 {
    public static void main(String[] args) {
        int[] whitelist = {1, 8, 9, 2, 4, 8, 8, 4, 6, 7, 8, 8, 9, 3, 4,};
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(whitelist);

        for (int i = 0; i < whitelist.length - 1; i++) {
            if (whitelist[i] != whitelist[i + 1]) {
                list.add(whitelist[i]);
            }
        }
        list.add(whitelist[whitelist.length - 1]);

        whitelist = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            whitelist[i] = list.get(i);
        }
        StdOut.println(Arrays.toString(whitelist));

        StdOut.println(BinarySearch.indexOf(whitelist, StdIn.readInt()));
    }
}
