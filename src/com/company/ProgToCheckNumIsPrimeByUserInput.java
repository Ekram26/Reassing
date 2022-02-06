package com.company;

import java.util.Scanner;

public class ProgToCheckNumIsPrimeByUserInput {
    public static void main(String[] args) {
        int num, count = 0;
        System.out.print("enter any number ");
        Scanner X = new Scanner(System.in);
        num = X.nextInt();
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
                count++;
        }
        if(count==2)
            System.out.println("prime number  ");
        else
            System.out.println("not a prime number  ");
        }
    }