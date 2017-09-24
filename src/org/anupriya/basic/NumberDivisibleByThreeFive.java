package org.anupriya.basic;

public class NumberDivisibleByThreeFive {
    public static void main(String args[]){
    printNumbers();
    }
 public static void printNumbers(){
        for(int i=1;i<=100;i++){
          if(i%3==0){
              System.out.println(i);
          }
        }
 }
}
