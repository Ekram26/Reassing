package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;
public class prog_to_swap_two_num_by_giving_user_input {
    public static void main(String[] args) {
        int a,b,c;
        Scanner X=new Scanner(System.in);
        System.out.println("enter first number: ");
        a= X.nextInt();
        System.out.println("enter second number: ");
        b= X.nextInt();
        c=a;
        a=b;
        b=c;
        System.out.println("number after swapping: "+a);
        System.out.println("number after swapping: "+b);
    }
}
