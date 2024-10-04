package com.company;

 class add
{
     int sum(int a)
    {
        return a;
    }
    int sum(int a,int b){
        return (a+b);
    }
     int sum(int a,int b,int c){
        return (a+b+c);
    }
}

public class tut30_methord_overloading2
{
    public static void main(String[] args) {

        add a=new add();
        System.out.println(a.sum(4,5));
        System.out.println(a.sum(4,5,8));
    }
}
