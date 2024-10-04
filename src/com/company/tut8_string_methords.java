package com.company;

public class tut8_string_methords {

    public static void main(String[] args) {
        String name = "Harry";

        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());



        System.out.println(name.substring(1));
        System.out.println(name.substring(1,4));

        System.out.println(name.replace('r', 'p'));
        System.out.println(name.replace("r", "ier"));

        System.out.println(name.startsWith("Har"));
        System.out.println(name.endsWith("dd"));

        System.out.println(name.charAt(4));

        String modifiedName = "Harryrryrry";
        System.out.println(modifiedName.indexOf("rry"));
        System.out.println(modifiedName.indexOf("rry", 4));
        System.out.println(modifiedName.lastIndexOf("rry", 7));

        System.out.println(name.equals("Harry"));
        System.out.println(name.equalsIgnoreCase("HarRY"));

        String nonTrimmedString = "     Harry     ";
        System.out.println(nonTrimmedString);
        System.out.println(nonTrimmedString.trim());

        System.out.println("I am escape sequence\tdouble quote");




    }
}
