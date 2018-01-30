package org.anupriya.basic;

import java.util.Arrays;

public class Tortoise {
    public static void main(String args[]) {
     System.out.println(Arrays.toString(race(720, 850, 70)));
    }

    public static float[] race(int v1, int v2, int g) {
        // your code
        float t1=g/v2;

        float x = (g+ (v1*t1))/v2;

        float[] time = new float[3];
        time[0] = x;
        time[1] = x * 60;
        time[2] = x * 3600;
        return time;
    }

}
