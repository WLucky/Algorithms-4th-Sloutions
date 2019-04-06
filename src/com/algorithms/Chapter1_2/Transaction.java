package com.algorithms.Chapter1_2;

import edu.princeton.cs.algs4.StdOut;

public class Transaction {
    private String who;
    private Date when;
    private double amount;

    public Transaction(String who, Date when, double amount) {
        this.who = who;
        this.when = when;
        this.amount = amount;
    }

    public Transaction(String transaction) {
        String[] fields = transaction.split("\\s+");
        this.who = fields[0];
        this.when = new Date(fields[1]);
        this.amount = Double.parseDouble(fields[2]);
    }

    public String who() {
        return who;
    }

    public Date when() {
        return when;
    }

    public double amount() {
        return amount;
    }

    public String toString() {
        return (who + " " + when + " " + amount);
    }

    public boolean equals(Object x) {
        if (this == x) return true;
        if (x == null) return false;
        if (this.getClass() != x.getClass()) return false;
        Transaction that = (Transaction) x;
        if (!this.who.equals(that.who)) return false;
        if (!this.when.equals(that.when)) return false;
        if (this.amount != that.amount) return false;
        return true;
    }

    public static void main(String[] args) {
        Transaction transaction1 = new Transaction("wpj", new Date(4, 2, 2019), 11.3);
        Transaction transaction2 = new Transaction("wpj", new Date(4, 2, 2019), 11.3);
        Transaction transaction3 = new Transaction("wpj", new Date(4, 3, 2019), 11.3);
        Transaction transaction4 = new Transaction("wpj 4/2/2019 11.3");

        StdOut.println(transaction1);
        StdOut.println(transaction2);
        StdOut.println(transaction3);
        StdOut.println(transaction4);


        StdOut.println("transaction1 == transaction2;" + (transaction1.equals(transaction2)));
        StdOut.println("transaction1 == transaction3;" + (transaction1.equals(transaction3)));
        StdOut.println("transaction1 == transaction4;" + (transaction1.equals(transaction4)));

    }
}
