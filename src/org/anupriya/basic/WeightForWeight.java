package org.anupriya.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WeightForWeight {
    public static void main(String args[]) {
        //System.out.println(productDigits("9999"));
        orderWeight(Arrays.asList(11,11,2000,10003,22,123,1234000,44444444,9999));
    }

    public static void orderWeight(List<Integer> list) {
        List<Integer> weightedArray = new ArrayList<>();
        int temp;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (sumDigits(list.get(i)) < sumDigits(list.get(j))) {
                    temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                    // System.out.println(sumDigits(list.get(i))+" "+sumDigits(list.get(j)));

                }

            }
            System.out.println(list);

            //System.out.println(list);
            //weightedArray.add(sumDigits(list.get(i)));
        }
        //System.out.println(weightedArray);
       // System.out.println(list);

    }

    public static Integer sumDigits(int number) {
        int digits = String.valueOf(number).length();
        int sum = 0;

        if (digits > 1) {
            for (int i = 0; i < digits; i++) {
                sum = sum + Integer.parseInt(String.valueOf(String.valueOf(number).charAt(i)));
            }
            return sum;
            //return productDigits(String.valueOf(sum));
        } else {
            return number;
        }

    }

    public static String productDigits(String number) {
        int digits = number.length();
        int product = 1;

        if (digits > 1) {
            for (int i = 0; i < digits; i++) {
                product = product * Integer.parseInt(String.valueOf(number.charAt(i)));
            }
            System.out.println(String.valueOf(product));
            // return String.valueOf(product);
            return productDigits(String.valueOf(product));
        } else {
            return number;
        }

    }

    // do this by for loop


}
