package com.dsa.pattern;

public class NumberPattern {
    public static void main(String[] args) {
        int n = 4;
        int row = 1;
        while (row <= n) {
            int space = row - 1;
            while (space >= 1) {
                System.out.print(" ");
                space--;
            }
            int col = n - row + 1;
            while (col >= 1) {
                System.out.print(row);
                col--;
            }
            System.out.println();
            row++;
        }
    }
}
