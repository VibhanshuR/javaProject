package com.company;
import java.util.*;


public class tut62_linked_list {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();


        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(1,8);//add 8 at 1th place

        System.out.println(l1);

        l1.remove(3);//deleting value from index 3


        System.out.println(l1);
        System.out.println("L1 list contains 7 : " + l1.contains(7));
    }
}
