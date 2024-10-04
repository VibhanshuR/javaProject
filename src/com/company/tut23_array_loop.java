package com.company;

public class tut23_array_loop
{
    public static void main(String[] args) {
        float [] marks = {98.5f, 45.5f, 79.5f, 99.5f, 80.5f};
        String [] students ={"Harry", "Rohan", "Shubham", "Lovish"};
        System.out.println(students.length);
        System.out.println(students[2]);
        System.out.println();

        int [] marks_of_student = {98, 45, 79, 99, 80};
//        System.out.println("Printing using for loop");
//        for(int i=0;i<marks.length;i++) {
//            System.out.println(marks_of_student[i]);
        //}

            System.out.println("Printing using for loop in reverse order");
            for(int j=marks.length -1;j>=0;j--)
            {
                System.out.println(marks_of_student[j]);
            }
        }
    }

