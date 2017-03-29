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
        int[] numbers03 = {1, 3, 6, 10, 15};
        series03(numbers03);
        int[] numbers04 = {500, 475, 425, 350, 250};
        series04(numbers04);
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

    public static void series03(int[] numbers) {
        System.out.println("The differences between two consecutive numbers are 2, 3, 4, 5, 6, ... ");
        Common.printNumbers(numbers);
        System.out.println("... next number is " + sequenceIncrease(numbers.length + 1));
        for (int i = 1; i <= 10; i++) {
            System.out.print(sequenceIncrease(i) + ",");
        }
    }

    public static int sequenceIncrease(int n) {
        if (n == 1)
            return 1;
        else
            return sequenceIncrease(n - 1) + n;
    }

    public static void series04(int[] numbers) {
        System.out.println("The differences between two consecutive numbers are 25, 50, 75, 100, 125, ... ");
        Common.printNumbers(numbers);
        System.out.print("... number is 500,");
        for (int i = 1; i <= 10; i++) {
            System.out.print(decreaseMultiply(25, i) + ",");
        }
    }

    public static int decreaseMultiply(int multiply, int n) {
        if (n == 1)
            return 500 - multiply * n;
        else
            return 500 - decreaseMultiply(multiply, n - 1);
    }

}
