package com.bporamin;

/**
 * Created by Fang on 3/12/2017.
 */
public class Palindrome {

    public static boolean isPalindrome(String word) {
        word = word.toLowerCase();
        int length = word.length();

        for (int i=0; i<(length/2); i++)
            if (word.charAt(i) != word.charAt(length-i-1))
                return false;
        return true;
    }

    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("Deleveled"));
    }

}
