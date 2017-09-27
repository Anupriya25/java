package org.anupriya.basic;

public class GCD {
    public static void main(String args[]) {
        getGCD(455, 42);
    }

    public static void getGCD(int num1, int num2) {
        int remainder = 0;

        if (num1 > num2 && num2 >0) {
            remainder = num1 % num2;
        }

        while (remainder >= 0) {
            System.out.println("number1:"+" " + num1);
            System.out.println("number2:"+" " + num2);

            remainder = num1 % num2;
            if(remainder==0){
                break;
            }
           /* num1 = num2;
            num2 = remainder;
*/
           getGCD(num2,remainder);


          // System.out.println("The GCD of two numbers is:" + num2);

        }

        System.out.println("The GCD of two numbers is:" + num2);

    }
}


//            if (num1 > num2 && num2 > 0) {
//                System.out.println(remainder);
//                quotient = (int) (num1 - remainder) / num2;
//
//            /*if (num1 == num2 * quotient + remainder) {
//                if (remainder == 0) {
//                    System.out.println("The GCD of two numbers is:" + num2);
//                    break;
//                }
//            */
//                num1 = num2;
//                num2 = remainder;
//
//            }



