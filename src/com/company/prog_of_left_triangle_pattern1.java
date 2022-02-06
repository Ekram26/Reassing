package com.company;

import java.util.Scanner;

public class prog_of_left_triangle_pattern1 {
    public static void main(String[] args) {
        int num = 1;
        System.out.println("enter the number that you want to print the pattern: ");
        Scanner X = new Scanner(System.in);
        num = X.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = i; j <= num; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("  ");
        }
    }        }