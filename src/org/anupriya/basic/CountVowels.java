package org.anupriya.basic;

import java.util.Arrays;
import java.util.List;

public class CountVowels {
    public static void main(String args[]) {
    System.out.println(getCount("mnbhjklfd"));
    }

    public static int getCount(String str) {
        int vowelsCount = 0;
        List<Character> vowel = Arrays.asList('a', 'e', 'i', 'o', 'u');
        for (int i = 0; i < vowel.size(); i++) {
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)==vowel.get(i)){
                    vowelsCount++;
                }

            }

        }
        return vowelsCount;
    }
}
