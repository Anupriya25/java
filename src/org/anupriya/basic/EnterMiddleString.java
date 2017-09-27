package org.anupriya.basic;

import java.util.ArrayList;
import java.util.Arrays;

public class EnterMiddleString {
    public static void main(String args[]) {
        String str = "Python 3.0";
        String[] newStr = str.split(" ");


     // System.out.println(str.substring(0,7)+"Tutorial");
       newStr[newStr.length/2]="Tutorial";
        System.out.println(Arrays.toString(newStr));

    }


}
