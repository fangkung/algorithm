package com.bporamin;

/**
 * Created by FanG on 3/14/2017.
 */
public class Common {

    public static void swapElement(int[] data, int left, int right) {
        int temp = data[left];
        data[left] = data[right];
        data[right] = temp;
    }

    public static void show(int[] data) {
        System.out.print(" data = {");
        for (int index = 0; index < data.length; index++) {
            System.out.print(data[index]);
            if (data.length - 1 > index)
                System.out.print(",");
        }
        System.out.println("}");
    }

}
