package com.dsa.pattern;

public class StarPattern3 {

    public static void main(String[] args) {
        int n = 4;
        int row = 1;
        while (row <= n) {
            //print space
            int space = row - 1;
            while (space >= 1) {
                System.out.print(" ");
                space = space -1 ;
            }
            //print star
            int col = n - row + 1;
            while (col >= 1) {
                System.out.print("*");
                col--;
           }
            System.out.println();
            row++;
        }
    }
}
