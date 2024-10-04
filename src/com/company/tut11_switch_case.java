package com.company;
import java.util.Scanner;

public class tut11_switch_case
{
    public static void main(String[] args) {
        Scanner it=new Scanner(System.in);

        System.out.println("enter the day");
        int day= it.nextInt();

        switch (day) {
            case(1):
                System.out.println("monday");
                break;
            case(2):
                System.out.println("tuesday");
                break;
            case (3):
                System.out.println("wednesday");
                break;
            case (4):
                System.out.println("thrusday");
                break;
            case (5):
                System.out.println("friday");
                break;
            case (6):
                System.out.println("saturday");
                break;
            case (7):
                System.out.println("sunday");
                break;
            default:
                System.out.println("you gone mad");
        }
        //or it can be written as in this manner also
        //no need to break also
//        switch (day){
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//        }



    }
}
