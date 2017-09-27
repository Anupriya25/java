package org.anupriya.basic;

import java.util.Scanner;

public class SameDIgit {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int x = in.nextInt();
        System.out.print("Input the second number: ");
        int y = in.nextInt();
        System.out.println(isSameDigits(getRemainder(x), getQuotient(x), getRemainder(y), getQuotient(y)));
    }

    public static int getRemainder(int num) {
        int remainder;
        remainder = num % 10;
        return remainder;
    }

    public static int getQuotient(int num) {
        int quotient;
        quotient = num - getRemainder(num) / 10;
        return quotient;
    }

    private static Boolean isSameDigits(int r1, int q1, int r2, int q2) {
        return r1 == r2 || r1 == q2 || q1 == r1 || q1 == q2;
    }
}
