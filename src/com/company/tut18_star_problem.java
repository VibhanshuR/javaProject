package com.company;

public class tut18_star_problem {
    public static void main(String[] args) {

        int n = 4;
        for (int i=n; i>0; i--)//rows
        {
            for(int j=0;j<i;j++)//for columns
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
