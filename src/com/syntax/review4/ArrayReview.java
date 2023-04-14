package com.syntax.review4;

public class ArrayReview {
    public static void main(String[] args) {
        int aa = 10;
        int[] arr = new int[3];
        arr[0] = 10;
        arr[1] = 11;
        arr[2] = 12;

        for(int a:arr)
            System.out.println(a);

        System.out.println(arr[1]);

        System.out.println("array----------------");


        String[]planets={"Earth", "Mars", "Jupiter", "Saturn", "Neptune"};

        System.out.println("  Enhanced for loop   ");

        //Enhanced for loop is used ONLY with arrays and collections

        for(String planet:planets){
            System.out.println(planet);

        }



        // System.out.println(planets[0]);
       // System.out.println(planets[1]);
       // System.out.println(planets[2]);

        for (int i = 0; i <planets.length; i++) {

            System.out.print(planets[i]+" ");
        }


    }
}