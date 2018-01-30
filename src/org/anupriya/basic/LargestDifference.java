package org.anupriya.basic;

public class LargestDifference {
    public static void main(String args[]){
     System.out.println(largestDifference(new int[]{9,4,1,10,3,4,0,-1,-2}));
    }
    public static int largestDifference(int[] data) {
       int diff=0;
        for (int i=0;i<data.length;i++) {
            for (int j = data.length-1; j >= 0; j--) {
               if(data[i]<=data[j]){
                   System.out.println(i+"  "+j);
                   diff=j-i;
               }
            }
        }
        //code here
        return diff;

    }

}
