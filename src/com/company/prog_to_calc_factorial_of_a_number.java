package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;
public class prog_to_calc_factorial_of_a_number {
    public static void main(String[] args) {
        int i=1,num,fact=1;
        Scanner X=new Scanner(System.in);
        System.out.println("enter any number: ");
        num= X.nextInt();
        while(i<=num){
            fact=(fact*i);
            i+=1;
        }
        System.out.println("factorial: "+fact);
    }
}
