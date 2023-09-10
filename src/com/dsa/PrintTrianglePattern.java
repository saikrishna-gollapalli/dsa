package com.dsa;

public class PrintTrianglePattern {

    public static void main(String[] args) {
        int n = 4;
        int i = 1;
        /*while (i <= n) {
            int j = 1;
            //int count = i;
            while (j <= i) {
                //System.out.print(count++ + " ");
                System.out.print(i+j-1 + " ");
                j++;
            }
            System.out.println();
            i++;
        }*/  //Print triangle as 1 / 23 / 345 / 4567


        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print(i-j+1 + " ");
                j++;
            }
            System.out.println();
            i++;
        }

    }
}
