package com.dsa;

import java.util.ArrayList;

public class BinarySearch {

    public static void main(String[] args) {
        int[] array = {1,3,5,6,9,14,22,25};
        int resultIndex = binarySearch(array, 23);
        System.out.println("Index of 22 is : " + resultIndex);
    }

    public static int binarySearch(int[] inputArray, int key) {
        int startIndex = 0, end = inputArray.length-1;
        int endIndex = inputArray.length-1;
        int mid = (startIndex + endIndex)/2;
        while (startIndex <= endIndex) {
            if (inputArray[mid] == key)
                return mid;
            if (key > inputArray[mid]) {
                startIndex = mid + 1;
            } else {
                endIndex = mid - 1;
            }
            mid = (startIndex + endIndex)/2;
        }
        return -1;
    }
}
