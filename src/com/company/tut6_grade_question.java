package com.company;
import java.util.Scanner;


public class tut6_grade_question {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char grade = 'B';
        grade = (char)(grade + 8);
        System.out.println(grade);

        // Decrypting the grade

        grade = (char)(grade - 8);
        System.out.println(grade);

        int a = sc.nextInt();
        System.out.println("write number a");
        System.out.println(a>8);
    }
}

