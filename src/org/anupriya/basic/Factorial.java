package org.anupriya.basic;

public class Factorial {
    public static void main(String args[]) {
        System.out.println(getFactorial(20));
    }

    public static long getFactorial(long n) {
        if (n == 1) {
            return 1;
        }
            return n * getFactorial(n - 1);

    }

}
