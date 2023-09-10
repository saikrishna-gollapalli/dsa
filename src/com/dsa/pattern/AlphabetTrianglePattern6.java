package com.dsa.pattern;

public class AlphabetTrianglePattern6 {

    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        char ch = 'A';
        while (row <= n) {
            int col = 1;
            while (col <= row) {
                System.out.print(ch + " ");
                ch = (char) (ch+1);
                col++;
            }
            System.out.println();
            row++;
        }

    }
}
