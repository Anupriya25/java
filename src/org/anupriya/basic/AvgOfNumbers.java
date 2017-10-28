package org.anupriya.basic;

import java.util.Arrays;

public class AvgOfNumbers {
    public static void main(String args[]) {
        int[] array = new int []{ 2, 2, 2, 2 };

        System.out.println(Arrays.toString(averages(array)));
    }

    public static double[] averages(int[] numbers) {
        double[] avgs = new double[numbers.length-1];
        if (numbers.length > 1) {
            for (int i = 0; i < numbers.length - 1; i++) {
                avgs[i] = ((float)numbers[i] + numbers[i + 1]) / 2;

                System.out.println(numbers[i]+" "+numbers[i+1]);
                System.out.println((numbers[i] + numbers[i + 1]) / 2);
            }
            return avgs;
        } else {
            return new double[0];
        }
    }
}
