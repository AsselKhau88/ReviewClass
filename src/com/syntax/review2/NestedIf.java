package com.syntax.review2;

public class NestedIf {
    public static void main(String[] args) {

        /*
        Declare 2 variables for DL and a car

        if you have DL then, I will check if you have a car
        */

        boolean driverLicense=true;
        boolean car=false;
        if (driverLicense) {
            System.out.println("Lets check if you have a  car");
            if (car) {
                System.out.println("you can drive to work");
            } else {
                System.out.println("You will need to take a bus or user");
            }
        }else{
            System.out.println("You should get a DL");
        }


    }
}
