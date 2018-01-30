package org.anupriya.basic;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String args[]){
        int s,n,i,x,j;
        System.out.print ("Input number of rows : ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        s=n+4-1;
        for(i=1;i<=n;i++)
        {
            for(x=s;x!=0;x--)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
            s--;
        }
    }
}
