package com.dsa.pattern;

public class NumberPattern4 {
    public static void main(String[] args) {
        int n = 4;
        int row = 1;
        int value = 1;
        while (row <= n) {
            int space = n - row;
            while (space >= 1) {
                System.out.print(" ");
                space--;
            }
            int col = 1;
            while (col <= row) {
                System.out.print(value++);
                col++;
            }
            System.out.println();
            row++;
        }
    }
}
