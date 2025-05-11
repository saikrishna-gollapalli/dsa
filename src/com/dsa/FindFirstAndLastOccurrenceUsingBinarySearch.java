package com.dsa;

import java.util.ArrayList;
import java.util.Arrays;

public class FindFirstAndLastOccurrenceUsingBinarySearch {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        int[] array = {0,0,1,1,2,2,2,2};
        arr.add(0);
        arr.add(0);
        arr.add(1);
        arr.add(1);
        arr.add(2);
        arr.add(2);
        arr.add(2);
        arr.add(2);
        int[] result = firstAndLastPosition(arr, arr.size(), 2);
        System.out.println(Arrays.toString(result));
    }

    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
        int[] result = new int[2];
        result[0] = firstPositionIndex(arr, n, k);
        result[1] = lastPositionIndex(arr, n, k);
        return result;
    }

    private static int firstPositionIndex(ArrayList<Integer>  arr, int size, int key) {
        int start = 0, end = size-1, ans = -1;
        int mid = start + (end-start)/2;
        while (start <= end) {
            if (arr.get(mid) == key) {
                ans = mid;
                end = mid - 1;
            } else if (key > arr.get(mid)) {
                start = mid + 1;
            } else if (key < arr.get(mid)) {
                end = mid - 1;
            }
            mid = start + (end-start)/2;
        }
        return ans;
    }

    private static int lastPositionIndex(ArrayList<Integer>  arr, int size, int key) {
        int start = 0, end = size-1, ans = -1;
        int mid = start + (end-start)/2;
        while (start <= end) {
            if (arr.get(mid) == key) {
                ans = mid;
                start = mid + 1;
            } else if (key > arr.get(mid)) {
                start = mid + 1;
            } else if (key < arr.get(mid)) {
                end = mid - 1;
            }
            mid = start + (end-start)/2;
        }
        return ans;
    }

};

