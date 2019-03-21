package com.algorithms.chapter1_1;

import edu.princeton.cs.algs4.StdOut;

public class Ex09 {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int pre_shift_N = N;
        int post_shift_N;
        for (int i = 31; i >= 0; i--) {
            post_shift_N = pre_shift_N << 1 >>> 1;
            if (post_shift_N == pre_shift_N) {
                StdOut.print('0');
            } else {
                StdOut.print('1');
            }
            if ((i % 4 == 0) && (i != 0)) {
                StdOut.print(' ');
            }
            pre_shift_N = post_shift_N << 1;
        }
        StdOut.print('\n');
    }
}

/*
 * 8 ---> 0000 0000 0000 0000 0000 0000 0000 1000
 * 25 --> 0000 0000 0000 0000 0000 0000 0001 1001
 * */
