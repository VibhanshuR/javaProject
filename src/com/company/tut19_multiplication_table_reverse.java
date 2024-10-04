package com.company;

public class tut19_multiplication_table_reverse
{
    public static void main(String[] args) {

        int n = 10;
        int sum=0;
        for(int i=10;i>=1;i--){
            System.out.printf("%d X %d = %d\n", n, i, n*i);
            sum +=(n*i);
        }
        System.out.println(sum);
    }
}
