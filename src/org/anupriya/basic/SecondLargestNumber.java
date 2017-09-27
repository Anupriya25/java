package org.anupriya.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecondLargestNumber {
    public static void main(String args[]) {
//        List<Integer> list = new ArrayList<>();
//        list.add(12);
//        list.add(9);
//        list.add(167);
//        list.add(8);
//        list.add(54);
//        list.add(33);
        final List<Integer> integerList = Arrays.asList(1, 3);
        secondBigNumber(integerList);
    }

    public static void secondBigNumber(List<Integer> numberList) {
        int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < numberList.size(); i++) {
            final Integer integer = numberList.get(i);
            if (integer > max) {
                secondMax = max;
                max = integer;
                System.out.println("Max: " + max);
                System.out.println("Min: " + secondMax);

            } else {
                if (secondMax < integer) {
                    secondMax = integer;
                    System.out.println("Max: " + max);
                    System.out.println("Min: " + secondMax);
                }
            }
        }
        System.out.println("The second maximum number:" + secondMax);
    }
}

