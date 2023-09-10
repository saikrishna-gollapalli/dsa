package com.dsa.pattern;

public class AlphabetTrianglePattern3 {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int row = 1;
        char ch = 'A';
        while (row <= n) {
            int col = 1;
            while (col <= n) {
                System.out.print(ch + " ");
                ch = (char) (ch + 1);
                col++;
            }
            System.out.println();
            row++;
        }

    }
}
