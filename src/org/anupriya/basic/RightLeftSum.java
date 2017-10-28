package org.anupriya.basic;

public class RightLeftSum {
    public static void main(String args[]) {
        int[] array = {1,1,-1};

        System.out.println("The index is :" + getRightLeftSum(array));
    }

    public static int getRightLeftSum(int[] arr) {
        int index = -1;
        int sumLeft,sumRight;
        for (int i = 0; i < arr.length; i++) {
            sumLeft = 0;
            sumRight = 0;

            for (int j = i + 1; j < arr.length; j++) {
                sumRight = sumRight + arr[j];

            }

            for (int k = i - 1; k >= 0; k--) {
                sumLeft = sumLeft + arr[k];

            }

            if (sumLeft == sumRight) {
                index = i;
            }


        }

        return index;
    }

}

