package org.anupriya.basic;

public class Fibonacci {
    public static void main (String args[]){
        System.out.println(7);
    }
    public int series(int n){
        if(n==1|| n==2){
            return 1;
        }
        return (n-1) +(n-2);
    }
}
