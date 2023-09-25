package com.dsa.numbers;

public class PrimeNumber {
    public static void main(String[] args) {
        int number = 11;
        boolean isPrime = true;
        for(int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("PRIME NUMBER");
        } else {
            System.out.println("NOT PRIME NUMBER");
        }
    }
}
