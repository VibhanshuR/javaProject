package com.company;

public class tut34_fibonacchi_series
{
    static int fabo(int n){
        if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        }
        else{
            return fabo(n-2)+fabo(n-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(fabo(6));
    }
}
