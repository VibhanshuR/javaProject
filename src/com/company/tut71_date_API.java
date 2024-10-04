package com.company;
import java.time.*;

public class tut71_date_API
{
    public static void main(String[] args) {

        Clock cl = Clock.systemDefaultZone();
        System.out.println(cl.getZone());

        Clock c3 = Clock.systemUTC();

        System.out.println(c3.instant());

    }
}
