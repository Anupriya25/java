package org.anupriya.basic;

import java.io.File;

public class FileSize {
    public static void main(String args[]) {
        String[] file = new File("/Users/anupriya/Documents/Zoom").list();
        for (String s : file) {
            System.out.println(s);
        }
//        System.out.println("file"+file);
    }
}
