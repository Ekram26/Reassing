package com.company;

import java.util.Scanner;

public class prog_to_print_ASCII_value_any_character {
    public static void main(String[] args) {
        char ch;
        Scanner X=new Scanner(System.in);
        System.out.println("enter any character: ");
        ch=X.next().charAt(0);
        int a=ch;
        System.out.println("ASCII value of "+ch+" is:"+a);

    }
}
