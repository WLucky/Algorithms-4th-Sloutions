package com.algorithms.chapter1_1;

import edu.princeton.cs.algs4.StdOut;

public class Ex19 {
    public static long F(int N) {
        if (N == 0) return 0;
        if (N == 1) return 1;
        return F(N - 1) + F(N - 2);
    }

    public static long Fb(long[] buffer, int N) {
        long val;
        if (N == 0) return 0;
        if (N == 1) return 1;
        if (buffer[N] != 0) {
            return buffer[N];
        }
        val = Fb(buffer, N - 1) + Fb(buffer, N - 2);
        if (buffer[N] == 0) {
            buffer[N] = val;
        }
        return val;
    }

    public static void main(String[] args) {
        long[] buffer = new long[100];
        for (int N = 0; N < 100; N++)
            StdOut.println(N + " " + Fb(buffer, N));
    }
}

/*
0 0
1 1
2 1
3 2
4 3
5 5
6 8
7 13
8 21
9 34
10 55
11 89
12 144
13 233
14 377
15 610
16 987
17 1597
18 2584
19 4181
20 6765
21 10946
22 17711
23 28657
24 46368
25 75025
26 121393
27 196418
28 317811
29 514229
30 832040
31 1346269
32 2178309
33 3524578
34 5702887
35 9227465
36 14930352
37 24157817
38 39088169
39 63245986
40 102334155
41 165580141
42 267914296
43 433494437
44 701408733
45 1134903170
46 1836311903
*/
