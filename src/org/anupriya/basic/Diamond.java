package org.anupriya.basic;

public class Diamond {
    public static void main(String args[]) {
        print(7);
    }
    public static void print(int n) {
        for (int i = 1; i <= n; i=i+2) {
            for(int k=n/2;k>0;k--){
                System.out.print(" ");

            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }

            System.out.println();

        }
    }
}
