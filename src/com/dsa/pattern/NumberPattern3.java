package com.dsa.pattern;

public class NumberPattern3 {
    public static void main(String[] args) {
        int n = 4;
        int row = 1;
        while (row <= n) {
            int space = row - 1;
            while (space >= 1) {
                System.out.print(" ");
                space--;
            }
            int col = row;
            while (col <= n) {
                System.out.print(col);
                col++;
            }
            System.out.println();
            row++;
        }
    }
}
