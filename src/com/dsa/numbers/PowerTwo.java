package com.dsa.numbers;

public class PowerTwo {

    public static void main(String[] args) {
       PowerTwo powerTwo = new PowerTwo();
       boolean result = powerTwo.isPowerTwo(20);
       System.out.println(result);
    }

    private boolean isPowerTwo(int n) {
        for (int i=0; i<=30; i++) {
            int ans = (int) Math.pow(2, i);
            if ( ans == n); {
                return true;
            }
        }
        return false;
    }
}
