package org.anupriya.basic;

public class ReverseString {
    public static void main(String args[]) {
        System.out.println((reverseString("Care about what other people think and you will always be their prisoner")));
    }

    public static String reverseString(String str) {
        int len = str.length();
        String s = "";
        for (int i = len - 1; i >= 0; i--) {
            s = s + str.charAt(i);
        }
        return s;
    }

}
