package com.company;
import java.util.Scanner;
public class prog_to_convert_FAHRENHEIT_to_CELCIUS {
    public static void main(String[] args) {
        System.out.println("enter temperature: ");
        Scanner sc=new Scanner(System.in);
        float f=sc.nextFloat();
        float celsius;

        celsius=(f-32)* 5/9;

        System.out.print("degree in celcius is: "+celsius);
    }
}
