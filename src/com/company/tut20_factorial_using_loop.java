package com.company;

public class tut20_factorial_using_loop
{
    public static void main(String[] args) {

        // What is factorial n = n * n-1 * n-2 ..... 1
        // 5! = 5*4*3*2*1 = 120
        int n = 5;
        int factorial = 1;
        for( int i=1;i<=n;i++)
        {
            factorial *= i;

        }
        System.out.println(factorial);
    }
}
