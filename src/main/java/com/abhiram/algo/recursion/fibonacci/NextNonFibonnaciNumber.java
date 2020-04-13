package com.abhiram.algo.recursion.fibonacci;

//Input: N = 4
//Output: 6
//6 is the next non-fibonacci number after 4
public class NextNonFibonnaciNumber extends Fibonacci {

    public static void main(String[] args) {
        int n = 6;
        int nextNonFibNumber = findNonFibonacciNumber(n);
        System.out.println("Next Non-Fibonacci number = " + nextNonFibNumber);
    }

    static int findNonFibonacciNumber(int n) {
        if (n <= 3) {
            return 4;
        }
        if (n > 3 && isFibonacci(n + 1)) {
            return n + 2;
        }
        return n + 1;
    }
}
