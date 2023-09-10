package com.dsa.pattern;

public class TrianglePattern1 {

    public static void main(String[] args) {
        int n = 4;
        int row = 1;
        while (row <= n) {
            //print space - 1st triangle
            int space = n-row;
            while (space >= 1) {
                System.out.print(" ");
                space--;
            }
            //print second triangle
            int j = 1;
            while (j <= row) {
                System.out.print(j);
                j++;
            }
            //print third triangle
            int start = row - 1;
            while (start >= 1) {
                System.out.print(start);
                start--;
            }
            System.out.println();
            row++;
        }
    }
}
