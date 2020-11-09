package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerUtils {


    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {

// Find the sum of first N
        // integers using the formula
        int sum = (n) * (n + 1) / 2;

        int r = (int)(Math.log(n) /
                Math.log(5)) + 1;

        // Find the sum of numbers
        // which are exact power of
        // 2 by using the formula
        int expSum = (int)(Math.pow(5, r)) - 1;

        // Print the final Sum
        return (sum - expSum);
//        int result = 0;
//
//        for (int x = 1; x <= n; x++)
//            result += SumOfN(x);
//
//        return result;
    }

    /**
     * @param n integer value input by client
     * @return the product of all integers between 0 and not including `n`
     */
    public static Integer getProductOfN(Integer n) {
        return null;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {
        return null;
    }
}
