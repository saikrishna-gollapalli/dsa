package com.dsa.pattern;

public class AlphabetTrianglePattern5 {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int row = 1;

        while (row <= n) {
            int col = 1;
            while (col <= row) {
                char ch = (char) ('A' + row - 1);
                System.out.print(ch + " ");
                col++;
            }
            System.out.println();
            row++;
        }

    }
}
