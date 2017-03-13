package com.bporamin;

import java.util.Arrays;

/**
 * Created by FanG on 3/13/2017.
 */
public class BinarySearch {

    public static void main(String[] args) {

        int search = 72;
        int[] data = {20, 15, 12, 30, -5, 72, 456};
        Arrays.sort(data);

        int result = binarySearch(data, search);
        if (result != -1)
            System.out.println("Found search data:" + search + " at index" + result);
        else
            System.out.println("Did not find data:" + search);

    }

    public static int binarySearch(int[] data, int search) {
        int loIndex = 0;
        int hiIndex = data.length - 1;
        int midIndex = 0;
        while (loIndex <= hiIndex) {

            midIndex = (loIndex + hiIndex) / 2;

            if (search < data[midIndex])
                hiIndex = midIndex - 1;
            else if (search > data[midIndex])
                loIndex = midIndex + 1;
            else
                break;

        }

        if (loIndex <= hiIndex)
            return midIndex;
        else
            return -1;

    }

}
