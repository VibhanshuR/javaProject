package com.company;

public class tut32_recursion
{
     class recursion {
         static void fun2(int n){
            if(n>0){
                fun2(n-1);
                System.out.println(n);
            }
        }


        public static void main(String[] args){

            fun2(5);
        }
    }

}
