package com.dsa.pattern;

public class StarPattern1 {

    public static void main(String[] args) {
        int n = 4;
        int row = 1;
        while (row <= n) {
            //print space
            int space = n - row;
            while (space >= 1) {
                System.out.print(" ");
                space--;
            }
            //print star
            int col = 1;
            while (col <= row) {
                System.out.print("*");
                col++;
            }
            System.out.println();
            row++;
        }
    }
}
