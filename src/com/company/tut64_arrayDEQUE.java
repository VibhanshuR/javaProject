package com.company;
import java.util.*;

public class tut64_arrayDEQUE
{
    public static void main(String[] args) {

        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(6);
        ad1.add(56);
        ad1.add(9);
        ad1.addFirst(5);
        ad1.offerFirst(10);
        ad1.addLast(12);
        ad1.offerLast(13);

        System.out.println(ad1);


        System.out.println(ad1.getFirst());
        System.out.println(ad1.peekFirst());
        System.out.println(ad1.getLast());
        System.out.println(ad1.peekLast());

//        removeFirst() & pollFirst() methods are used to delete an element from the head of the queue.
//                removeFirst() throws an exception if the queue is empty.
//        pollFirst() returns null if the queue is empty.


        ad1.pollFirst(); //deletes 10
        ad1.removeFirst();//deletes 5
        System.out.println(ad1);
    }
}
