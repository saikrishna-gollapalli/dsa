package com.dsa;

public class FindPeakElementInMountainArray {

    public static void main(String[] args) {
        FindPeakElementInMountainArray fpea = new FindPeakElementInMountainArray();
        int[] arr = {0,1,3,2,0};
        int result = fpea.peakIndexInMountainArray(arr);
        System.out.println("Peak Index of array :: " + result);
    }
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0, end = arr.length-1;
        int mid = start + (end-start)/2;
        while (start < end) {
            if (arr[mid] < arr[mid+1]) {
                start = mid+1;
            } else {
                end = mid;
            }
            mid = start + (end-start)/2;
        }
        return end;
    }
}
