package com.dsa.pattern;

public class HardTrianglePattern2 {

    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        while (row <= n) {
            //print space - 1st triangle
            int start = 1;
            while (start <= (n - row + 1)) {
                System.out.print(start);
                start++;
            }
            int star = row - 1;
            while (star >= 1) {
                System.out.print("**");
                star--;
            }
            int k = n-row+1;
            while(k >= 1) {
                System.out.print(k);
                k--;
            }
            System.out.println();
            row++;
        }
    }
}
