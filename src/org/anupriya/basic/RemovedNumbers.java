package org.anupriya.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemovedNumbers {
    public static void main(String args[]) {

//        removeNb(26).forEach(numbers -> System.out.println(Arrays.toString(numbers)));

        for (long[] numbers : removeNb(100)) {
            System.out.println(Arrays.toString(numbers));
        }
    }

    public static List<long[]> removeNb(long n) {
        // your code
        List<long[]> excludedNo = new ArrayList<>();
        long[] numbers;
        long sum = 0;
        for (long k = 1; k <= n; k++) {
            sum = sum + k;
        }
        for (int i = 1; i <= n; i++) {
            for (long j = 1; j <= n; j++) {
                if (i == j) {
                    continue;
                }
                if ((i * j) == (sum - (i + j))) {
                    numbers = new long[2];
                    numbers[0] = i;
                    numbers[1] = j;
                    excludedNo.add(numbers);

                }
            }
        }
        return  excludedNo;
    }

    public static long sumNumbers(long i, long j, long n) {
        long sum = 0;
        for (long k = 1; k <= n; k++) {
            sum = sum + k;
        }
        return sum - (i + j);

    }
}
