package org.anupriya.basic;

import java.util.Arrays;

public class MinimumDenomination {
    public static void main(String args[]) {
        System.out.println(Arrays.toString(withdraw(230)));
    }

    public static int[] withdraw(int n) {
        int q = n / 100;
        int[] list = new int[3];
        for (int i = q; i >= 0; i--) {
            int a1 = n - (100 * i);

            for (int j = a1 / 50; j >= 0; j--) {
                if ((a1 - (50 * j)) % 20 == 0) {
                    list[0] = i;
                    list[1] = j;
                    list[2] = (a1 - (50 * j)) / 20;
                    return list;
                }
            }
        }
        return list;
    }
}
