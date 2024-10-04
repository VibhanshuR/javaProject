package com.company;

public class tut41_constructor_rectangle
{
   static class Cylinder {
        private int radius;
        private int height;

        public Cylinder(int radius, int height) {
            this.radius = radius;
            this.height = height;
        }

        public double surfaceArea() {
            return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
        }

        public double volume() {
            return Math.PI * radius * radius * height;
        }
    }
    public static void main(String[] args) {

        Cylinder c=new Cylinder(4,5);
        System.out.println(c.surfaceArea());
        System.out.println(c.volume());

    }
}
