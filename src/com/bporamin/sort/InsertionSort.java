package com.bporamin.sort;

import com.bporamin.Common;

/**
 * Created by FanG on 3/14/2017.
 */
public class InsertionSort {

    public static void main(String[] args) {

        int[] data = {20, 15, 12, 30, -5, 72, 456, 1};
        System.out.println("Before Sort");
        Common.show(data);
        System.out.println("After Sort");
        Common.show(insertionSort(data));

    }

    public static int[] insertionSort(int[] data) {

        for (int current = 1; current < data.length; current++) {
            int temp = data[current];
            int lastSorted;
            for (lastSorted = current - 1; lastSorted >= 0 && data[lastSorted] > temp; lastSorted--)
                // Move
                data[lastSorted + 1] = data[lastSorted];
            // Insert
            data[lastSorted + 1] = temp;
        }

        return data;
    }

}
