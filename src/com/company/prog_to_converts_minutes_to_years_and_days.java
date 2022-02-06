package com.company;
import java.util.Scanner;

public class prog_to_converts_minutes_to_years_and_days {
    public static void main(String[] args) {
        double mint;
        Scanner X=new Scanner(System.in);
        System.out.println("enter total minutes: ");
        mint= X.nextDouble();
        long years=(long) (mint/(60*24*365));
        long days=(long) (mint/60/24)%365;
        System.out.println("is approx "+ years +" years & "+ days +" days");


    }
}
