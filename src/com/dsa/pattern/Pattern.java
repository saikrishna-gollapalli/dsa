package com.dsa.pattern;

public class Pattern {
    public static void main(String[] args) {
        int n = 6;
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                System.out.print(j);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
