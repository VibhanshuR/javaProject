package com.company;
import java.util.*;

//in hash-set duplicate element will be ignored

public class tut65_hashSET
{
    public static void main(String[] args) {

        HashSet<Integer> myHashSet = new HashSet<>(6, 0.5f);
        myHashSet.add(6);
        myHashSet.add(8);
        myHashSet.add(3);
        myHashSet.add(11);
        myHashSet.add(11); // This element will be ignored

        System.out.println("The size of myHashSet is : " + myHashSet.size());

        System.out.println(myHashSet);

        myHashSet.remove(3); //deletes 3 from the hashset
        System.out.println(myHashSet);

        myHashSet.clear(); //deletes all the elements from the hashset
        System.out.println(myHashSet);

    }
}
