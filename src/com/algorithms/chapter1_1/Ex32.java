package com.algorithms.chapter1_1;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex32 {

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        double l = Double.parseDouble(args[1]);
        double r = Double.parseDouble(args[2]);

        StdOut.println("Please input a sequence of double values:");
        String[] stringArray = StdIn.readLine().split(" ");
        double[] doubleArray = new double[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            doubleArray[i] = Double.parseDouble(stringArray[i]);
        }

        double step = (r - l) / N;
        int[] num = new int[N];
        int max = 0;
        for (int i = 0; i < doubleArray.length; i++) {
            double element = doubleArray[i];
            if (element >= l && element <= r) {
                for (int j = 0; j < N; j++) {
                    if (element > l + step * j && element <= l + step * j + step) {
                        num[j]++;
                        if (max < num[j]) {
                            max = num[j];
                        }
                    }
                }
            }
        }

        for (int i = 0; i < N; i++) {
            double x = (1.0 * i + 0.5) / N;
            double y = num[i] / (max * 2.0);
            double rw = 0.4 / N;
            StdDraw.filledRectangle(x, y, rw, y);
        }
    }
}
