package com.dsa.numbers;

public class ReverseInteger {

    public static void main(String[] args) {
        ReverseInteger reverseInteger = new ReverseInteger();
        int result = reverseInteger.reverse(1534236469);
        System.out.println(result);
    }

    public int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int reminder = x%10;
            if ((result > Integer.MAX_VALUE/10) || (result<Integer.MIN_VALUE/10) ) {
                return 0;
            }
            result = (result*10) + reminder;
            x = x/10;
        }
        return result;
    }
}
