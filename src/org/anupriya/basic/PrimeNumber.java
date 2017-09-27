package org.anupriya.basic;

public class PrimeNumber {
    public static void main(String args[]){
        System.out.println("Enter the number");
       // int number = Integer.parseInt(System.console().readLine());
      //  System.out.println(isPrime(1));
    sumPrimeNumber();
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

   public static void sumPrimeNumber(){
     int sum=0;
     for(int i=1;i<=100;i++){
         if(isPrime(i)){
             System.out.println("prime number is: "+ i);

             sum=sum+i;

             System.out.println("Sum"+sum);

         }
     }
     System.out.println("the sum of 100 prime numbers is:"+sum);
   }
    }

