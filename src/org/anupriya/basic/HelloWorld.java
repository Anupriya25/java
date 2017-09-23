package org.anupriya.basic;

import java.util.ArrayList;
import java.util.List;

public class HelloWorld {

    public static boolean a = false;

    public static void main(String[] args) {

        System.out.println("hello world !!");
        System.out.println(a);

        System.out.println(getBinaryAddResult("11111", "11"));

    }

    public static String getBinaryAddResult(String first, String second) {
        if (first.length() > second.length()) {
            int len = first.length() - second.length();
            for (int i = 0; i < len; i++) {
                second = 0 + second;
            }
        }else{
            int len = second.length() - first.length();
            for (int i = 0; i < len; i++) {
                first = 0 + first;
            }
        }
        String[] carryList = new String[first.length() + 1];
        int carry = 0;

        for (int i = 0; i < carryList.length; i++) {
            carryList[i] = "0";
        }

        String result = "";

        for (int i = first.length(); i > 0; i--) {


            char fc = first.charAt(i - 1);
            char sc = second.charAt(i - 1);

            if (fc == '0' && sc == '0') {
                if (carry == 0) {
                    result = "0" + result;

                } else {
                    result = "1" + result;

                }
            } else if (fc == '1' && sc == '0') {
                if (carry == 0) {
                    result = "1" + result;

                } else {
                    result = "0" + result;
                    carry = 1;
                }

            } else if (fc == '0' && sc == '1') {
                if (carry == 0) {
                    result = "1" + result;

                } else {
                    result = "0" + result;
                    carry = 1;
                }

            } else if (fc == '1' && sc == '1') {

                if (carry == 0) {
                    carry = 1;
                    result = "0" + result;

                } else {
                    carry = 1;
                    // carryList[i - 1] = "1";
                    result = "1" + result;
                }


            }
        }
        if (carry == 1) {
            result = "1" + result;

        }

        return result;
    }


}
