package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerArrayUtils {
    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] intArray) {
        Integer[] sum = intArray;
        int number = sum.length;

        int answer = 0;
        for (int i = 0; i < number; i++) {
            answer += sum[i];
        }
        return answer;
    }


    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray) {
        Integer[] sum = intArray;
        int number = sum.length;

        int result = 1;
        for (int i = 0; i < number; i++){

            result = result * sum[i];
    }
        return result;
    }

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static Double getAverage(Integer[] intArray) {
        Integer[] sum = intArray;
        int number = sum.length;

        double count = 0;
        for (int i = 0; i < number; i++)
        {

            int answer = 0;
            for (int j = 0; j < number; j++)
            {

                if (i == j)
                    continue;

                else
                    answer += sum[j];
            }

            if (answer % sum[i] == 0)
                count++;
        }

        // Return the count
        return count;

//        double answer = 0;
//        for (int i = 0; i < number; i++) {
//
//            if (sum[i] == 0)
//                return -1.0;
//
//            if (i == 0)
//                answer += sum[i];
//            else
//
//                answer += sum[i] / sum[i];
//        }
//
//        return answer;
    }
}

