package com.algorithms.chapter1_1;

import edu.princeton.cs.algs4.StdRandom;

public class Ex37 {
    public static void badShuffle(int[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int r = StdRandom.uniform(N);
            int temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
    }

    public static void main(String[] args) {
        int M = Integer.parseInt(args[0]);
        int N = Integer.parseInt(args[1]);

        int[] a = new int[M];
        int[][] num = new int[M][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                a[j] = j;
            }
            badShuffle(a);
            for (int j = 0; j < M; j++) {
                num[a[j]][j]++;
            }
        }
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                System.out.printf("%6d ", num[i][j]);
            }
            System.out.println();
        }
    }
}
/*
 * 思考：i--N-1的方法可以保证每张牌位置不动的概率为1/N，而0--N-1的方法保证不了这个。这个理由可以排除第二个方法。但是仅仅是洗牌方案的必要条件。
 * */
