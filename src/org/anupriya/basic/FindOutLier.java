package org.anupriya.basic;

public class FindOutLier {
    public static void main(String args[]) {
        System.out.println(find(new int[]{Integer.MAX_VALUE, 0, 1}));
    }

    static int find(int[] integers) {
        int odd = 0,even=0,s=0;
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] % 2 != 0) {
                odd++;
            } else {
                even++;
            }
        }

            if(odd>integers.length/2) {
                for (int integer : integers) {

                    if (integer % 2 == 0) {
                        s = integer;
                    }


                }
            }else{
                for (int integer : integers) {

                    if (integer % 2 != 0) {
                        s = integer;
                    }


                }
            }
        return s;
    }
}
