package com.algorithms.chapter1_1;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Ex35 {
    public static void main(String[] args) {
        int SIDES = 6;
        double[] dist = new double[2 * SIDES + 1];
        for (int i = 1; i <= SIDES; i++)
            for (int j = 1; j <= SIDES; j++)
                dist[i + j] += 1.0;
        for (int k = 2; k <= 2 * SIDES; k++)
            dist[k] /= 36.0;

        StdOut.println("The probability distribution is:");
        for (int i = 2; i < dist.length; i++) {
            StdOut.printf("%6d ", i);
        }
        StdOut.println();
        for (int i = 2; i < dist.length; i++) {
            StdOut.printf("%6.3f ", dist[i]);
        }
        StdOut.println();

        int totalCount = 0;
        int hitCount = 0;
        double probability = 0;
        /* 取出现7的概率进行试验 */
        for (; ; ) {
            int val1 = StdRandom.uniform(1, 7);
            int val2 = StdRandom.uniform(1, 7);
            totalCount++;

            if (val1 + val2 == 7) {
                hitCount++;
            }
            probability = (double) hitCount / totalCount;
            probability = Double.parseDouble(String.format("%.3f", probability));
            if (totalCount % 1000 == 0) {
                StdOut.println("totalCount = " + totalCount + " hitCount = " + hitCount + " probability = " + probability);
            }

            if (probability == 0.167) {
                StdOut.println("Success !!!!totalCount = " + totalCount + " hitCount = " + hitCount + " probability = " + probability);
                break;
            }
        }
    }
}

//The probability distribution is:
//2      3      4      5      6      7      8      9     10     11     12
//0.028  0.056  0.083  0.111  0.139  0.167  0.139  0.111  0.083  0.056  0.028
//Success !!!!totalCount = 436 hitCount = 73 probability = 0.167
