package com.company;

import java.util.Scanner;

public class Rainfall {


    public static void main(String[] args) {
        double width, height, rainfall;
        Scanner keyboard = new Scanner(System.in);

        System.out.print(" Enter the width of the roof: ");
        width = keyboard.nextDouble();

        System.out.print ( "Enter the length: ");
        height = keyboard.nextDouble();

        System.out.print ("Enter the rainfall: ");
        rainfall = keyboard.nextDouble();

        double totalRainfall = (width * 12) * (height * 12)* rainfall/231;
        System.out.print ( "ToatalRainfall: " + totalRainfall);



    }
}
