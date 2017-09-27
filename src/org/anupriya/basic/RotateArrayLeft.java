package org.anupriya.basic;


import java.util.Arrays;
import java.util.List;

public class RotateArrayLeft {
    public static void main(String args[]) {
        List<Integer> array = Arrays.asList(20, 10, 98, 56, 34, 31, 9);
        //  rotateList(array, 3);
        rotateListNtimes(array, 5);
        /* int temp;
        temp = array.get(0);
        //array.set(0,array.get(array.size()-1));
        //array.set(array.size()-1,temp);

        for (int i = 0; i <= array.size() - 2; i++) {

            int another = array.get(i + 1);
            array.set(i, another);
            // array.set(array.get(i+1),);
            System.out.println(array);

        }
        array.set(array.size() - 1, temp);
        System.out.println("The final array is:" + array);
*/
    }

    /**
     * rotate the given list left  by rotateBy places
     *
     * @param array
     * @param rotateBy
     */
    static void rotateList(List<Integer> array, int rotateBy) {
        for (int k = 1; k <= rotateBy; k++) {
            int temp;
            temp = array.get(0);

            for (int i = 0; i <= array.size() - 2; i++) {

                int another = array.get(i + 1);
                array.set(i, another);

                //System.out.println(array);

            }


            array.set(array.size() - 1, temp);
            System.out.println("The final array is:" + array);

        }
    }

    static void rotateListNtimes(List<Integer> array, int rotateBy) {
        int[] a = new int[rotateBy];
        for (int i = 0; i < rotateBy; i++) {
            a[i] = array.get(i);


        }
        System.out.println(Arrays.toString(a));

        for (int i = 0; i <= array.size() - 1 - rotateBy; i++) {
            int another = array.get(i + rotateBy);
            array.set(i, another);

            System.out.println(array);

        }
        for (int i = 0; i < a.length; i++) {
            array.set(array.size() - rotateBy + i, a[i]);
        }
        System.out.println("The final array is:" + array);

    }

}
