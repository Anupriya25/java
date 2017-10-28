package org.anupriya.basic;

public class MiddleLetters {
    public static void main(String args[]){
    System.out.println(getMiddle("A"));
    }
    public static String getMiddle(String word) {
        int len = word.length();
        return len % 2 == 0 ? word.substring((len / 2) - 1, (len / 2) + 1) : word.substring((len / 2), (len / 2) + 1);
    }
}
