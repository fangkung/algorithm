package com.bporamin.leetcode;

import java.util.HashMap;

/**
 * Created by FanG on 3/17/2017.
 */
public class Solutions {

    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] result = twoSum(nums, target);
        System.out.println("twoSum : " + result[0]+","+result[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++){

            Integer diff = (Integer)(target - nums[i]);
            if(hash.containsKey(diff)){
                int toReturn[] = {hash.get(diff), i};
                return toReturn;
            }

            hash.put(nums[i], i);

        }

        return null;
    }

}
