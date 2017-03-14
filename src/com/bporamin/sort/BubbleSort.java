package com.bporamin.sort;

import com.bporamin.Common;

/**
 * Created by FanG on 3/13/2017.
 */
public class BubbleSort {

    public static void main(String[] args) {

        int[] data = {20, 15, 12, 30, -5, 72, 456};
        System.out.println("Before Sort");
        Common.show(data);
        System.out.println("After Sort");
        Common.show(bubbleSort(data));

    }

    public static int[] bubbleSort(int[] data) {
        boolean swapped;
        do {
            swapped = false;

            for (int index = 0; index < data.length - 1; index++) {
                if (data[index] > data[index + 1]) {
                    Common.swapElement(data, index, index + 1);
                    swapped = true;
                }
            }

        } while (swapped);

        return data;
    }

}
