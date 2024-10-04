package com.company;

public class tut16_break_and_continue_statements
{
    public static void main(String[] args) {
        //*********************BREAK STATEMENT*******************************

        for(int i=10;i>0;i--){
            if(i==7){
                break;   //break the loop
            }
            System.out.println(i);
        }

        //*****************CONTINUE STATEMENT***************************

//        for(int i=7;i>0;i--){
//            if(i==3){
//                continue;//continue skips 3 and continue rest statement
//            }
//            System.out.println(i);
//        }
    }
}
