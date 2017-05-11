package com.atilsamancioglu.javalearning;

/**
 * Created by atilsamancioglu on 03/05/2017.
 */

public class OperatorsAndFlows {

    public static void main(String[] args) {

        int x = 5;
        System.out.println(x);
        x = x + 1;
        System.out.println(x);
        x++;
        System.out.println(x);
        x--;
        System.out.println(x);
        x = x * 5;
        System.out.println(x);

        int y = 4;

        System.out.println(x>y);
        System.out.println(y>x);
        y = 30;
        System.out.println(y>=x);
        System.out.println(y==x);
        y = 29;
        System.out.println(y!=x);

        // and &&
        // or ||
        y = 30;


        //if flows

        if (x > y) {
            System.out.println("x is bigger");
        } else if (y > x) {
            System.out.println("y is bigger");
        } else {
            System.out.println("x = y");
        }

        //switch

        int day = 1;
        String dayString = "";

        if (day == 1) {
            dayString = "Monday";
        } else if (day == 2) {
            dayString = "Tuesday";
        } else if (day == 3) {
            dayString = "Wednesday";
        }

        switch (day) {

            case 1:
                dayString = "Monday";
                break;
            case 2:
                dayString = "Tuesyday";
                break;
            case 3:
                dayString = "Wednesday";
                break;
            default:
                dayString = "Sunday";
                break;

        }




    }

}
