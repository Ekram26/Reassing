package com.company;

import java.util.Scanner;

public class prog_to_convert_inches_to_meters {


    public static void main(String[] args) {
        double inch,meter;
        Scanner X=new Scanner(System.in);
        System.out.println("enter the value in inches: ");
        inch= X.nextDouble();
        meter=(inch*0.0254);
        System.out.println("value in meter is: "+meter);
    }
}
