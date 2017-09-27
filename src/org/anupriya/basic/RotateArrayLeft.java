package org.anupriya.basic;


import java.util.Arrays;
import java.util.List;

public class RotateArrayLeft {
    public static void main(String args[]) {
        List<Integer> array = Arrays.asList(20,10,98,56,34,31,9);
      rotateList(array,3);
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
  static   void rotateList(List<Integer> array, int rotateBy) {
        int temp;
        temp = array.get(0);
        //array.set(0,array.get(array.size()-1));
        //array.set(array.size()-1,temp);
/*
        for(int j =1;j<=rotateBy;j++) {
*/




            for (int i = 0; i <= array.size() -2- rotateBy; i++) {

                int another = array.get(i + 1);
                array.set(i, another);
                // array.set(array.get(i+1),);
              //  System.out.println(array);

            }
       // }
        array.set(array.size() - 1, temp);
        System.out.println("The final array is:" + array);

    }

}
