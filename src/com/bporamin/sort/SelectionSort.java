package com.bporamin.sort;

import com.bporamin.Common;

/**
 * Created by FanG on 3/14/2017.
 */
public class SelectionSort {

    public static void main(String[] args) {

        int[] data = {20, 15, 12, 30, -5, 72, 34, 9, 456, 999};
        System.out.println("Before Sort");
        Common.show(data);
        System.out.println("After Sort");
        Common.show(selectionSort(data));

    }

    public static int[] selectionSort(int[] data) {

        for (int index = 0; index < data.length - 1; index++) {
            int minimum = index;
            for (int unSort = (index + 1); unSort < data.length - 1; unSort++) {
                if (data[unSort] < data[minimum])
                    minimum = unSort;
            }
            Common.swapElement(data, index, minimum);
        }

        return data;
    }

}
