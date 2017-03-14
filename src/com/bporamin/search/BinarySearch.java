package com.bporamin.search;

import com.bporamin.Common;

import java.util.Arrays;

/**
 * Created by FanG on 3/13/2017.
 */
public class BinarySearch {

    public static void main(String[] args) {

        int search = -3;
        int[] data = {20, 15, 12, 30, -5, 72, 456};
        Arrays.sort(data);
        Common.show(data);
//        int result = binarySearch(data, search);
        int result = recursiveBinarySearch(data, 0, data.length, search);
        if (result > -1)
            System.out.println("Found search data:" + search + " at index:" + result);
        else
            System.out.println("Did not find data:" + search);

    }

    public static int binarySearch(int[] data, int search) {
        int loIndex = 0;
        int hiIndex = data.length - 1;

        while (loIndex <= hiIndex) {

            int midIndex = (loIndex + hiIndex) / 2;

            if (search < data[midIndex])
                hiIndex = midIndex - 1;
            else if (search > data[midIndex])
                loIndex = midIndex + 1;
            else
                return midIndex;

        }
        return -1;
    }

    public static int recursiveBinarySearch(int[] data, int loIndax, int hiIndex, int search) {
        if (loIndax < hiIndex) {
            int midIndex = loIndax + (hiIndex - loIndax) / 2;
            if (search < data[midIndex])
                return recursiveBinarySearch(data, loIndax, midIndex, search);
            else if (search > data[midIndex])
                return recursiveBinarySearch(data, midIndex + 1, hiIndex, search);
            else
                return midIndex;
        }

        return -(loIndax + 1);
    }

}
