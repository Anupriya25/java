package org.anupriya.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class Abbreviator {
    public static void main(String args[]) {
        System.out.println(abbreviate("elephant-rides are really fun!"));
    }

    public static String abbreviate(String string) {
        String s = String.valueOf(string.charAt(0));
        List<String> myList = new ArrayList<>();
        String specialChar = null;
        for (int i = 1; i < string.length(); i++) {
            if (Character.isLetter(string.charAt(i))) {
                s = s + String.valueOf(string.charAt(i));
            } else {
                specialChar
                        = String.valueOf(string.charAt(i));
                myList.add(s);
                myList.add(specialChar);
                s = "";

            }
        }
        if (!s.isEmpty()) {
            myList.add(s);
        }


        StringBuilder stringBuilder = new StringBuilder();
        for (String words : myList) {
            if (words.matches("[a-zA-Z]+") && words.length() > 3) {
                words = String.valueOf(words.charAt(0)) + String.valueOf(words.length() - 2) + String.valueOf(words.charAt(words.length() - 1));

            }
            stringBuilder.append(words);
        }

        return String.valueOf(stringBuilder);
    }

}
