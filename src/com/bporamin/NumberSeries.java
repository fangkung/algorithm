package com.bporamin;

/**
 * Created by FanG on 3/28/2017.
 */
public class NumberSeries {

    public static void main(String[] args) {
        int[] numbers01 = {4, 8, 16, 32, 64};
        series01(numbers01);
        int[] numbers02 = {2, 3, 5, 7, 11, 13, 17, 19};
        series02(numbers02);
    }

    public static void series01(int[] numbers) {
        System.out.println("Each number is multiplied by 2 to get the next number.");
        Common.printNumbers(numbers);
        System.out.println("... next number is " + multiply2(numbers[numbers.length - 1]));
    }

    public static int multiply2(int n) {
        return n * 2;
    }

    public static void series02(int[] numbers) {
        System.out.println("These are the prime numbers.");
        Common.printNumbers(numbers);
        System.out.println("... next number is " + getPrime(numbers[numbers.length - 1] + 1));
    }

    public static int getPrime(int n) {
        if (isPrime(n))
            return n;
        else
            return getPrime(n + 1);
    }

    public static boolean isPrime(int n) {
        if (n == 1 | n == 2)
            return true;
        if (n % 2 == 0)
            return false;
        for (int i = 3; i < n; i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

}
