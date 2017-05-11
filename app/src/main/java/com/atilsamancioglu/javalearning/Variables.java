package com.atilsamancioglu.javalearning;

/**
 * Created by atilsamancioglu on 01/05/2017.
 */

public class Variables {

    public static void main(String[] args) {

        //Integer - int

        int x = 5;
        int y = 4;

        int age = 19;

        int result = age * 4 / 3;

        System.out.println(result);

        //Double - Float

        double pi = 3.14;

        final double r = 5.0;

        System.out.println(2*pi*r);

        double a = 19.0;

        System.out.println(a*4/3);

        float z = 3.0f;


        //String
        String name = "James";
        String surname = "Hetfield";

        String fullname = name + " " + surname;

        System.out.println(name);
        System.out.println(surname);
        System.out.println(fullname);

        //Boolean

        boolean isAlive = true;
        isAlive = false;

        System.out.println(isAlive);

    }

}
