package com.company;
import java.util.Scanner;

public class tut3_operators {
    public static void main(String[] args) {

        Scanner it=new Scanner(System.in);

        System.out.println("enter number 1");
        int a= it.nextInt();
        System.out.println("enter number 2");
        int b= it.nextInt();

        // 1. Arithmetic Operators
        System.out.println("the addition is "+(a+b));
        System.out.println("the subtraction is "+(a-b));
        System.out.println("the multiplication is "+(a*b));
        System.out.println("the division is "+(a/b));


        // 2. Assignment Operators
        int c = 9;//= is known as assingment operator
        c *= 3;
        System.out.println(c);

        // 3. Comparison Operators

        System.out.println(a<b);
        System.out.println(a>b);
        System.out.println(a<=b);
        System.out.println(a>=b);

        // 4. Logical Operators

        System.out.println(a>b && 90>b);
        System.out.println(a<b || 64<98);


    }
}

