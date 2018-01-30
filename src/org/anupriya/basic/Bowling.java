package org.anupriya.basic;

public class Bowling {
    public static void main(String args[]) {
        bowlingPins(5);
    }

    public static void bowlingPins(int arr) {
        String a [][]=new String[4][7];
        for (int i = 4;  i >0; i--) {
            for (int j = 0; j < 7; j++) {
                int mid=7/2;
                a[i][j]=" ";
                a[i][mid]= String.valueOf(9);
                        System.out.print(a[i][j]);
            }
            System.out.print("\n");

        }
    }
}
