package org.anupriya.basic;

import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the string : ");
        String str = in.nextLine();
        // String str= String.valueOf(x);
        boolean isPalindrome = true;
        int mid = str.length() / 2;
        //System.out.println("mid value"+mid);

        for (int i = 0; i < mid; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                isPalindrome = false;
                break;
                // System.out.println(str.charAt(i)+" "+str.charAt(str.length() - 1 - i));
            }/*else{
                isPalindrome=false;
            }*/
        }
        System.out.println(isPalindrome);
    }
}
