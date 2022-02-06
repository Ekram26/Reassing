package com.company;

import java.util.Scanner;

public class prog_to_convert_fahrenheit_to_celsius {
    public static void main(String[] args) {
        float temp;
        Scanner X=new Scanner(System.in);
        System.out.println("enter the temperature in fahrenheit: ");
        temp= X.nextFloat();
        temp=((temp-32)*5)/9;
        System.out.println("Temperature in celsius is: "+temp);
    }
}
