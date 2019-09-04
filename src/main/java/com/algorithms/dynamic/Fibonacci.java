package com.algorithms.dynamic;

public class Fibonacci {
    int[] fib;

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        fibonacci.fibOf(10);
        fibonacci.fibIteration(10);
        fibonacci.fibIterationWithoutArray(10);
    }

    private void fibIterationWithoutArray(int n) {
        int a=0;
        int b=1;
        int sum;
        System.out.println(a);
        System.out.println(b);
        for (int i=2;i<n;i++) {
            sum = a+b;
            a=b;
            b=sum;
            System.out.println(sum);
        }
    }


    private void fibIteration(int n) {
        fib[0] = 0;
        fib[1] = 1;
        System.out.println(fib[0]);
        System.out.println(fib[1]);
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 2] + fib[i - 1];
            System.out.println(fib[i]);
        }
    }

    private void fibOf(int n) {
        fib = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println(byRecursion(i));
        }
    }

    private int byRecursion(int i) {
        if (i == 0 || i == 1)
            return i;
        if (fib[i] != 0)
            return fib[i];
        return fib[i] = byRecursion(i - 1) + byRecursion(i - 2);
    }
}
