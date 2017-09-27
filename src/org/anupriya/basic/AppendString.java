package org.anupriya.basic;

public class AppendString {
    public static void main(String args[]){

    }

   public static String getString(String str,int beginIndex,int end){
        return str.substring(beginIndex,end) + str + str.substring(beginIndex,end);

   }
}
