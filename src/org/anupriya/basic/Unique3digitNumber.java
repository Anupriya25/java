package org.anupriya.basic;

public class Unique3digitNumber {
    public static void main(String[] args) {

        Unique3digitNumber obj = new Unique3digitNumber();
        int[] ints = {1, 3, 2, 6, 9, 5, 0};
        obj.calculateNo(ints);
    }

    public void calculateNo(int[] numberArr) {
        for (int i = 0; i < numberArr.length; i++) {

            if (numberArr[i] == 0) {
                continue;
            }
            for (int j = 0; j < numberArr.length; j++) {
                if (j != i) {
                    for (int k = 0; k < numberArr.length; k++) {
                        if (k != i && j != k) {
//                            if (numberArr[i] != 0) {
                            System.out.println(String.valueOf(numberArr[i]) + String.valueOf(numberArr[j]) + String.valueOf(numberArr[k]));
//                            }

                        }

                    }
                }
            }
        }

    }
}
