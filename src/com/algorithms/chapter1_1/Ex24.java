package com.algorithms.chapter1_1;

import edu.princeton.cs.algs4.StdOut;

public class Ex24 {
    public static int gcd(int p, int q) {
        StdOut.println("p = " + p + " q = " + q);
        if (q == 0) return p;
        int r = p % q;
        return gcd(q, r);
    }

    public static void main(String[] args) {
        int p = Integer.parseInt(args[0]);
        int q = Integer.parseInt(args[1]);

        StdOut.println("The greatest common divisor of " + p + " and " + q + " is " + gcd(p, q));
    }
}


//p = 1111111 q = 1234567
//p = 1234567 q = 1111111
//p = 1111111 q = 123456
//p = 123456 q = 7
//p = 7 q = 4
//p = 4 q = 3
//p = 3 q = 1
//p = 1 q = 0
//The greatest common divisor of 1111111 and 1234567 is 1
