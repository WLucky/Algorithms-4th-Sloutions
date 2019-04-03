package com.algorithms.Chapter1_2;

import edu.princeton.cs.algs4.*;

public class Ex03 {

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        double min = Double.parseDouble(args[1]);
        double max = Double.parseDouble(args[2]);
        Interval2D[] interval2DS = new Interval2D[N];
        Point2D[] leftTopPoints = new Point2D[N];
        Point2D[] rightBottomPoints = new Point2D[N];
        StdDraw.setXscale(min, max);
        StdDraw.setYscale(min, max);

        for (int i = 0; i < N; i++) {
            double a = StdRandom.uniform(min, max);
            double b = StdRandom.uniform(min, max);
            double left, right, top, bottom;
            Interval1D x, y;
            left = (a > b) ? b : a;
            right = (a > b) ? a : b;
            a = StdRandom.uniform(min, max);
            b = StdRandom.uniform(min, max);
            bottom = (a > b) ? b : a;
            top = (a > b) ? a : b;

            x = new Interval1D(left, right);
            y = new Interval1D(bottom, top);

            leftTopPoints[i] = new Point2D(left, top);
            rightBottomPoints[i] = new Point2D(right, bottom);
            interval2DS[i] = new Interval2D(x, y);
            interval2DS[i].draw();
        }

        int containNum = 0, intersectNum = 0;
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N; j++) {
                if (j > i && interval2DS[i].intersects(interval2DS[j])) {
                    StdOut.println(interval2DS[i] + " intersects " + interval2DS[j]);
                    intersectNum++;
                }

                if (j != i && interval2DS[i].contains(leftTopPoints[j]) && interval2DS[i].contains((rightBottomPoints[j]))) {
                    StdOut.println(interval2DS[i] + " contains " + interval2DS[j]);
                    containNum++;
                }
            }
        }

        StdOut.println("Intersect Count: " + intersectNum);
        StdOut.println("Contain Count: " + containNum);
    }
}
