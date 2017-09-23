package org.anupriya.basic;

public class PrimeNumber {
    public static void main(String args[]){
        System.out.println("Enter the number");
       // int number = Integer.parseInt(System.console().readLine());
        System.out.println(isPrime(1));
    }
 public static boolean isPrime(int number){
        int sqrt= (int) Math.sqrt(number);
        boolean result=true;
           if(number==1){
               return false;
           }
            for (int i = 2; i <= sqrt; i++) {
                if (number % i == 0) {
                    result = false;
                    break;
                }
            }



        return result;

        }

    }

