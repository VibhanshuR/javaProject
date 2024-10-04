package com.company;
import java.util.Scanner;

public class tut17_sum_even_nos
{
    public static void main(String[] args) {

        Scanner it=new Scanner(System.in);
        int sum=0;
        System.out.println("enter the number for sum for even no");
        int n= it.nextInt();
        for(int i=0;i<n;i++){
            sum = sum + (2*i);
        }
        System.out.print("Sum of even numbers is: ");
        System.out.println(sum);
    }
}
