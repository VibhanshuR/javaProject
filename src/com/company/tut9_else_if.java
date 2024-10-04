package com.company;
import java.util.Scanner;

public class tut9_else_if {
    public static void main(String[] args) {
        Scanner it=new Scanner(System.in);
        System.out.println("enter number a");
        int a= it.nextInt();

        if (a>18) {
            System.out.println("you can drive");
        }
        else if(a<18){
            System.out.println("You are underage!");
        }
        else{
            System.out.println("you dont have lincense: go make it ");
        }

    }
}
