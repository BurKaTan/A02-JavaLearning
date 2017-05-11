package com.atilsamancioglu.javalearning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by atilsamancioglu on 01/05/2017.
 */

public class Arrays {

    public static void main(String[] args) {

        //Arrays

        String[] myArray = new String[4];

        myArray[0] = "James";
        myArray[1] = "Lars";
        myArray[2] = "Kirk";
        myArray[3] = "Rob";

        System.out.println(myArray[3]);

        int[] myNumberArray = {10,20,30,40,50};

        System.out.println(myNumberArray[3]);

        //List

        ArrayList<String> myMusician = new ArrayList<String>();

        myMusician.add("James");
        myMusician.add("Lars");
        myMusician.add(1, "Kirk");
        myMusician.add("Rob");

        System.out.println(myMusician.get(0));
        System.out.println(myMusician.get(1));
        System.out.println(myMusician.get(2));
        System.out.println(myMusician.get(3));


        //Set

        HashSet<String> mySet = new HashSet<String>();

        mySet.add("Rob");
        mySet.add("Rob");

        System.out.println(mySet.size());


        //Map

        HashMap<String, String> myHashMap = new HashMap<String, String>();

        myHashMap.put("name", "James");
        myHashMap.put("instrument", "Guitar");

        System.out.println(myHashMap.get("name"));



    }

}
