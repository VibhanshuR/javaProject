package com.company;

import org.w3c.dom.ls.LSOutput;
public class tut100_practise {
    static int fibo(int n){
        if(n==0 || n==1){
            return 1;
        }
        else {
            System.out.println(n-1);
            System.out.println(n-2);
            return fibo(n - 1) + fibo(n - 2);
        }
    }
    public static void main(String[] args) {
       System.out.println(fibo(5));


    }
}
