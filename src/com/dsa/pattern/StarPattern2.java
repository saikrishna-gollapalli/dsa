package com.dsa.pattern;

public class StarPattern2 {

    public static void main(String[] args) {
        int n = 4;
        int row = 1;
        while (row <= n) {
            //print star
            int col = n- row + 1;
            while (col >= 1) {
                System.out.print("*");
                col--;
            }
            System.out.println();
            row++;
        }
    }
}
