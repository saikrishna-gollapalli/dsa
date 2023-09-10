package com.dsa.pattern;

public class AlphabetTrianglePattern7 {

    public static void main(String[] args) {
        int n = 4;
        int row = 1;
        while (row <= n) {
            int col = 1;
            char ch =(char)('A'+n-row);
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
