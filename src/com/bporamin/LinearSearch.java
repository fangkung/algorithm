package com.bporamin;

/**
 * Created by Fang on 3/13/2017.
 */
public class LinearSearch {

    public static void main(String[] args) {

        int search = 72;
        int[] data = {20, 15, 12, 30, -5, 72, 456};
        int result = linearSearch(data, search);

        if (result != -1)
            System.out.println("Found " + search + " at index : " + result);
        else
            System.out.println("Did not find : " + search);

    }

    public static int linearSearch(int[] data, int search) {

        for (int index = 0; index < data.length; index++)
            if (data[index] == search)
                return index;

        return -1;
    }
}
