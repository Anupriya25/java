package org.anupriya.basic;

import java.util.*;

public class Printer {
    public static void main(String args[]) {
        reverseSortString();
    }


    static void reverseSortString() {
        final List<String> stringList = new ArrayList<>(Arrays.asList("ss", "fdd", "bga", "tre"));
        Comparator<String> comparator = new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return -1 * o1.compareTo(o2);
            }
        };
        stringList.sort(comparator);
        System.out.println(stringList);
    }



}
