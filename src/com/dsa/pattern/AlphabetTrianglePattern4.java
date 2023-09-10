package com.dsa.pattern;

public class AlphabetTrianglePattern4 {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int row = 1;

        while (row <= n) {
            int col = 1;
            char ch = (char) ('A' + row - 1);
            while (col <= n) {
                //char ch = (char) ('A'+row+col-2); // formula without initialize ch in row while loop
                System.out.print(ch + " ");
                ch = (char) (ch + 1);
                col++;
            }
            System.out.println();
            row++;
        }

    }
}
