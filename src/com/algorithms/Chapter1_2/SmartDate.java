package com.algorithms.Chapter1_2;

import edu.princeton.cs.algs4.StdOut;

public class SmartDate {
    private final int month;
    private final int day;
    private final int year;

    public SmartDate(int m, int d, int y) {
        switch (m) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (d > 0 && d <= 31) {
                    month = m;
                    day = d;
                    year = y;
                } else {
                    throw new IllegalArgumentException("Illegal date");
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (d > 0 && d <= 30) {
                    month = m;
                    day = d;
                    year = y;
                } else {
                    throw new IllegalArgumentException("Illegal date");
                }
                break;
            case 2:
                if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
                    if (d > 0 && d <= 29) {
                        month = m;
                        day = d;
                        year = y;
                    } else {
                        throw new IllegalArgumentException("Illegal date");
                    }
                } else {
                    if (d > 0 && d <= 28) {
                        month = m;
                        day = d;
                        year = y;
                    } else {
                        throw new IllegalArgumentException("Illegal date");
                    }
                }
                break;
            default:
                throw new IllegalArgumentException("Illegal date");
        }
    }

    public int month() {
        return month;
    }

    public int day() {
        return day;
    }

    public int year() {
        return year;
    }

    public String toString() {
        return month() + "/" + day() + "/" + year();
    }
/*
基姆拉尔森计算公式
W= (d+2*m+3*(m+1)/5+y+y/4-y/100+y/400) mod 7

在公式中d表示日期中的日数，m表示月份数，y表示年数。

注意：在公式中有个与其他公式不同的地方：

把一月和二月看成是上一年的十三月和十四月，例：如果是2004-1-10则换算成：2003-13-10来代入公式计算。
以公元元年为参考，公元元年1月1日为星期一
*/

    public String dayOfWeek() {
        int weekDay = -1;
        int month = this.month;
        int year = this.year;

        if (month <= 2) {
            month += 12;
            --year;
        }

        weekDay = (day + 2 * month + 3 * (month + 1) / 5 + year + year / 4 - year / 100 + year / 400) % 7;

        switch (weekDay) {
            case 0:
                return "Monday";
            case 1:
                return "Tuesday";
            case 2:
                return "Wednesday";
            case 3:
                return "Thursday";
            case 4:
                return "Friday";
            case 5:
                return "Saturday";
            case 6:
                return "Sunday";
            default:
                return null;
        }
    }

    public boolean equals(Object x) {
        if (this == x) return true;
        if (x == null) return false;
        if (this.getClass() != x.getClass()) return false;
        SmartDate that = (SmartDate) x;
        if (this.day != that.day) return false;
        if (this.month != that.month) return false;
        if (this.year != that.year) return false;
        return true;
    }

    public static void main(String[] args) {
        int y = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        int d = Integer.parseInt(args[2]);

        try {
            SmartDate date = new SmartDate(m, d, y);
            StdOut.println(date);
            StdOut.println(date.dayOfWeek());
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
