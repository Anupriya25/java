package org.anupriya.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Consecutives {
    public static void main(String args[]) {
        System.out.println(sumConsecutives(new ArrayList(Arrays.asList(1, 4, 4, 4, 0, 4, 3, 3, 1))));
    }

    public static List<Integer> sumConsecutives(List<Integer> s) {
        // your code
        List<Integer> newList = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < s.size(); i++) {
            sum = s.get(i);
            for (int j = i + 1; j < s.size(); j++) {
                System.out.println(i + " " + " " + j);
                if (Objects.equals(s.get(i), s.get(j))) {
                    sum = sum + s.get(j);
                } else {
                    i = j - 1;
                    break;
                }


            }

            newList.add(sum);

        }
        return newList;
    }

}
