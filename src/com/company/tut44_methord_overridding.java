package com.company;

class A{
    public void meth1(){
        System.out.println("I am method 1 of class A");
    }
}

class B extends A{
    @Override
    public void meth1(){
        System.out.println("I am method 1 of class B");
    }


}
public class tut44_methord_overridding {
    public static void main(String[] args) {

        A a = new A();
        a.meth1();

        B b = new B();
        b.meth1();
    }
}
