package com.company;

public class tut66_time
{
    public static void main(String[] args) {

//        This long number holds the number of miliseconds passed since 1 jan 1970

        System.out.println(System.currentTimeMillis()/1000/3600/24/365);

        System.out.println("The maximum value of long is :" + Long.MAX_VALUE);
        System.out.println("The value of current time in ms : " + System.currentTimeMillis());
    }
}
