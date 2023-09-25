package com.dsa.numbers;

public class Fibonacci {

    public static void main(String[] args) {
        int a = 0, b = 1;
        System.out.print(a+", "+b+", ");
        for (int i = 1; i<=10; i++) {
            int nextNumber = a+b;
            a = b;
            b = nextNumber;
            System.out.print(nextNumber +", ");
        }
    }
}
