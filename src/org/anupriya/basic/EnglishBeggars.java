package org.anupriya.basic;

public class EnglishBeggars {
    public static void main(String args[]){
    System.out.println(beggars(new int[]{1, 2, 3, 4, 5},2));
    }
    public static int[] beggars(int[] values, int n) {
        // show me the code!
      int[] person=new int[n];
      for(int i=0;i<n;i++){
         person[i]=0;
      }
      for(int i=0;i<n;i++){
          person[i]=person[i]+values[i];
      }
     return person;
    }

}
