package org.anupriya.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StockList {
    public static void main(String args[]) {
        System.out.println(stockSummary(new String[]{"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"}, new String[]{"A", "B","C","D"}));
    }

    public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        String newWord = "";
        String result = "";
        for (int i = 0; i < lstOf1stLetter.length; i++) {
            int count = 0;

            for (String aLstOfArt : lstOfArt) {
                if (aLstOfArt.startsWith(lstOf1stLetter[i])) {
                    String[] words = aLstOfArt.split("\\s+");
                    count = count + Integer.valueOf(words[1]);
                    newWord = "(" + lstOf1stLetter[i] + " : " + count + ")";
                    if (i < lstOf1stLetter.length - 1) {
                        newWord += " - ";
                    }
                }
            }
            result = result + newWord;
        }

        return result;
    }

}