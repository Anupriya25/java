package org.anupriya.basic;

public class BinaryMultiplication {
    public void getBinaryProduct(String a ,String b ){
        String first,second;
        for(int i=b.length()-1;i<=0;i++){
            if(b.charAt(i)=='1'){
                first=a;
                second="0";

            }else{
                first="0";
                second=a+"0";
            }
        }
    }
}
