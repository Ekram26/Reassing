package com.company;
import java.util.Scanner;
public class prog_to_check_leap_year {
    public static void main(String[] args) {
        int year;
        Scanner X=new Scanner(System.in);
        System.out.println("enter any number: ");
        year= X.nextInt();
        if(year%100==0 && year%400==0 || year%100!=0 && year%4==0)
        {
            System.out.println("leap year: ");
        }else
        {
            System.out.println("not a leap year: ");
        }
    }
}
