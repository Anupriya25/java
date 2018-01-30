package org.anupriya.basic;

public class DRoot {
    public static void main(String args[]) {
        System.out.println(digital_root(7));
    }

    public static int digital_root(int n) {
        int sum = 0;
        String s = String.valueOf(n);
        int length = s.length();
        if (length > 1) {
            for (int i = 0; i < length; i++) {
                sum = sum + Integer.valueOf(String.valueOf(s.charAt(i)));
            }
            if (sum > 9) {
                sum = digital_root(sum);
            }

            return sum;
        } else {
            return n;
        }
    }


}