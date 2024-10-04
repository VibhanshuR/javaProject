package com.company;
import java.util.*;

public class tut68_date2
{
    public static void main(String[] args) {
        Date d= new Date();
        System.out.println("The current date is : "+ d.getDate());
        System.out.println("The current year is : "+ d.getYear()); //22

        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getSeconds());

    }
}
