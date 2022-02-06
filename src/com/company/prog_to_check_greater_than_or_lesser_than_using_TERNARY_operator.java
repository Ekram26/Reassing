package com.company;

import java.util.Scanner;

public class prog_to_check_greater_than_or_lesser_than_using_TERNARY_operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number: ");

        int num= sc.nextInt();
        if(num>=10){
            System.out.println("number is greater than 10" );
        }
        else if (num>=5){
            System.out.println("number is greater than 5");

        }
        else {
            System.out.print("number is less than 5" );

        }

    }

}

