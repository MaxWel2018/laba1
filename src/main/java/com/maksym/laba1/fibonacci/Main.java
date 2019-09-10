package com.maksym.laba1.fibonacci;

public class Main {
    public static void main(String[] args) {
        Fibonacci fibonacci = new LoopFibonacci();
        System.out.println("0 -"+fibonacci.fibonacci(0));
        System.out.println("1 - "+fibonacci.fibonacci(1));
        System.out.println("2 - "+fibonacci.fibonacci(2));
        System.out.println("3 - " +fibonacci.fibonacci(3));
    }

}
