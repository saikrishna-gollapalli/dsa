package com.dsa.pattern;

public class NumberPattern2 {
    public static void main(String[] args) {
        int n = 4;
        int row = 1;
        while (row <= n) {
            int space = n - row;
            while (space >= 1) {
                System.out.print(" ");
                space--;
            }
            int col = 1;
            while (col <= row) {
                System.out.print(row);
                col++;
            }
            System.out.println();
            row++;
        }
    }
}
