package com.dsa.pattern;

public class AlphabetTrianglePattern {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int row = 1;
        while (row <= n) {
            int col = 1;
            while (col <= n) {
                char ch = (char) ('A'+(row-1));
                System.out.print(ch + " ");
                col++;
            }
            System.out.println();
            row++;
        }

    }
}
