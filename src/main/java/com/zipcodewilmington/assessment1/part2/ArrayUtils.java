package com.zipcodewilmington.assessment1.part2;

import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        int count = 0;
        for (int i = 0; i < objectArray.length; i++) {
            if (objectArray[i].equals(objectToCount)) {
                count++;
            }
        }

        return count;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
        int count = 0;
        int contents = getNumberOfOccurrences(objectArray, objectToRemove);
        Object[] answer = new Object[objectArray.length - contents];
        for (Object s : objectArray) {
            if (s != objectToRemove) {
                answer[count] = s;
                count++;
            }
        }
        return answer;

    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        int count = 1, mostCount;
        Object mostUsed = objectArray[0];
        Object most = 0;
        for (int i = 0; i < (objectArray.length - 1); i++)
        {
            most = objectArray[i];
            mostCount = 0;
            for (int j = 1; j < objectArray.length; j++)
            {
                if (most == objectArray[j])
                    mostCount++;
            }
            if (mostCount > count)
            {
                mostUsed = most;
                count = mostCount;
            }
        }
        return mostUsed;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        int minium = 1, miniumCount;
        Object leastUsed = objectArray[0];
        Object least = 0;
        for (int i = 0; i < (objectArray.length - 1); i++)
        {
            least = objectArray[i];
            miniumCount = 0;
            for (int j = 1; j < objectArray.length; j++)
            {
                if (least == objectArray[j])
                    miniumCount++;
            }
            if (miniumCount > minium)
            {
                leastUsed = least;
                minium = miniumCount;
            }
        }
        return leastUsed;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        return null;
    }
}
