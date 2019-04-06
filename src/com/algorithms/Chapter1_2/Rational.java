package com.algorithms.Chapter1_2;

import edu.princeton.cs.algs4.StdOut;

public class Rational {
    private final int numerator;
    private final int denominator;
    private static int MAX = 2147483647;
    private static int MIN = -2147483648;

    public Rational(int numerator, int denominator) throws ArithmeticException {
        if (denominator == 0) {
            throw new ArithmeticException("Divide by zero");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    private int gcd(int p, int q) {
        if (q == 0) return p;
        int r = p % q;
        return gcd(q, r);
    }

    public Rational plus(Rational b) {

        int n = numerator * b.denominator + b.numerator * denominator;
        int d = denominator * b.denominator;

        assert !isTimesOverflow(numerator, b.denominator, numerator * b.denominator) : "Times overflow";
        assert !isTimesOverflow(b.numerator, denominator, b.numerator * denominator) : "Times overflow";
        assert !isTimesOverflow(denominator, b.denominator, d) : "Times overflow";
        assert !isPlusOverflow(numerator * b.denominator, b.numerator * denominator, n) : "Plus overflow";

        int div = gcd(Math.abs(n), Math.abs(d));

        if (div > 0) {
            n /= div;
            d /= div;
        }

        return new Rational(n, d);
    }

    public Rational minus(Rational b) {
        int n = numerator * b.denominator - b.numerator * denominator;
        int d = denominator * b.denominator;

        assert !isTimesOverflow(numerator, b.denominator, numerator * b.denominator) : "Times overflow";
        assert !isTimesOverflow(b.numerator, denominator, b.numerator * denominator) : "Times overflow";
        assert !isTimesOverflow(denominator, b.denominator, d) : "Times overflow";

        int div = gcd(Math.abs(n), Math.abs(d));

        if (div > 0) {
            n /= div;
            d /= div;
        }

        return new Rational(n, d);
    }

    public Rational times(Rational b) {
        int n = numerator * b.numerator;
        int d = denominator * b.denominator;

        assert !isTimesOverflow(numerator, b.numerator, n) : "Times overflow";
        assert !isTimesOverflow(denominator, b.denominator, d) : "Times overflow";

        int div = gcd(Math.abs(n), Math.abs(d));

        if (div > 0) {
            n /= div;
            d /= div;
        }

        return new Rational(n, d);
    }

    public Rational divides(Rational b) {
        int n = numerator * b.denominator;
        int d = denominator * b.numerator;

        assert !isTimesOverflow(numerator, b.denominator, n) : "Times overflow";
        assert !isTimesOverflow(denominator, b.numerator, d) : "Times overflow";

        int div = gcd(Math.abs(n), Math.abs(d));

        if (div > 0) {
            n /= div;
            d /= div;
        }

        return new Rational(n, d);
    }

    public boolean equals(Rational that) {
        int n1 = numerator;
        int d1 = denominator;
        int n2 = that.numerator;
        int d2 = that.denominator;
        int div = gcd(Math.abs(n1), Math.abs(d1));

        if (div > 0) {
            n1 /= div;
            d1 /= div;
        }

        div = gcd(Math.abs(n2), Math.abs(d2));

        if (div > 0) {
            n2 /= div;
            d2 /= div;
        }


        return (n1 == n2) && (d1 == d2);
    }

    public String toString() {
        return "" + numerator + "/" + denominator;
    }

    private boolean isPlusOverflow(int a, int b, int n) {
        return ((a > 0) && (b > 0) && (n <= 0)) || ((a < 0) && (b < 0) && (n >= 0));
    }

    private boolean isTimesOverflow(int a, int b, int n) {
        return a != 0 && n / a != b;
    }

    public static void main(String[] args) {
        Rational r1 = new Rational(MAX, 1);
        Rational r2 = new Rational(4, 6);
        Rational r3 = new Rational(2, 3);
        StdOut.println(r1.plus(r1));
        StdOut.println(r2.minus(r1));
        StdOut.println(r1.times(r2));
        StdOut.println(r1.divides(r2));
        StdOut.println(r1.equals(r2));
        StdOut.println(r2.equals(r3));
    }
}
