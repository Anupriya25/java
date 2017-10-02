package org.anupriya.basic;

public class BasicProg {

    public static void main(String args[]) {
       // System.out.println(nbYear(1500, 5, 100, 5000));
       // System.out.println(nbYear(1500000, 2.5, 10000, 2000000));
        System.out.println(nbYear(1500000, 0.25, 1000, 2000000));
    }

    public static int nbYear(int p0, double percent, int aug, int p) {
        float per = (float) percent / 100;
        System.out.println(per);
        int totalInhabitants = (int) ((per * p0) + aug);
        System.out.println(totalInhabitants);

        return (int) ((p - p0) / totalInhabitants);
    }
}
