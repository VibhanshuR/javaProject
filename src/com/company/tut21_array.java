package com.company;

public class tut21_array
{
    public static void main(String[] args) {
        // 1. Declaration and memory allocation
//         int [] marks = new int[5];
//         marks[0] = 100;
//         marks[1] = 60;
//         marks[2] = 70;
//         marks[3] = 90;
//         marks[4] = 86;

        // 2. Declaration, memory allocation and initialization together
        int [] marks = {98, 45, 79, 99, 80};

        // marks[5] = 96; - throws an error
        System.out.println(marks[4]);
    }
}
