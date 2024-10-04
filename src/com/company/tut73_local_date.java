package com.company;
import java.time.*;

public class tut73_local_date
{
    public static void main(String[] args) {

        LocalDate d = LocalDate.now();
        System.out.println(d);

        LocalDate d9 = LocalDate.parse("2021-05-27");
        LocalDate d1= LocalDate.parse("2021-05-26");
        LocalDate d2= LocalDate.parse("2021-05-26");

        System.out.println(d1.equals(d9));
        System.out.println(d2.equals(d1));
        System.out.println(d9.withYear(2001));
    }
}
