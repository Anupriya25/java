package org.anupriya.basic;

import java.util.ArrayList;
import java.util.List;

public class InPlace {
    public static void main(String args[]) {
        List<String> newString = new ArrayList<>();
        newString.add("a");
        newString.add("b");
        newString.add("c");
        newString.add("d");
        newString.add("e");
        newString.add("f");
        newString.add("g");

        System.out.println(reverseString(newString));
    }

    public static List<String> reverseString(List<String> str) {
        String temp;

        for (int i = 0; i < str.size(); i++) {


            int j = str.size() - 1 - i;
            System.out.println(j);

            

            while (j >= 0) {
                if (i >= j) {
                    break;
                }
                temp = str.get(i);
                str.set(i, str.get(j));
                str.set(j, temp);
                System.out.println(str);

                j--;
            }


        }
        return str;
    }

}

