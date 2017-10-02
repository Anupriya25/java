package org.anupriya.basic;


import java.util.*;


public class Mode {
    public static void main(String args[]) {
        List<Integer> list = Arrays.asList(2, 6, 4, 5, 0, 2, 1, 3, 2, 3, 11, 7, 19, 5);
        getListByIndexOf(list);
        //getListBySet(list);

    }

    static void getListByIndexOf(List<Integer> list) {
        List<Integer> newList = new ArrayList<>();
        List<Integer> frequency = new ArrayList<>();

        for (Integer aList : list) {
            if (newList.indexOf(aList) == -1) {
                newList.add(aList);
            }
        }
        for (int j = 0; j < newList.size(); j++) {
            int count = 0;
            for (Integer aList : list) {
                final Integer integer = newList.get(j);
                if (aList.equals(integer)) {
                    count++;

                }
            }
            frequency.add(j, count);
        }

        System.out.println("The mode of the list:" + " " + newList.get(frequency.indexOf(Collections.max(frequency))));
        System.out.println(newList);
        System.out.println("The frequency is :" + frequency);


    }

    static void getList(List<Integer> list) {
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            boolean exists = false;
            //check the existence of the element in the list
            Integer integer = list.get(i);
            for (Integer aNewList : newList) {
                if (integer.equals(aNewList)) {
                    exists = true;
                    break;
                }

            }
            if (!exists) {
                newList.add(i, integer);
                System.out.println(newList);
            }

        }
    }

    static void getListBySet(List<Integer> list) {
        Set newList = new HashSet();

        newList.addAll(list);
        System.out.println(newList);


        //System.out.println(newList);
    }

    static void getFrequency(List<Integer> list, int number) {
        for (int i = 0; i < list.size(); i++) {
            if (number == list.get(i)) {

            }
        }
    }
}