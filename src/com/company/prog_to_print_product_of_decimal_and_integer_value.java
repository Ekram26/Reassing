package com.company;
import java.util.Scanner;

public class prog_to_print_product_of_decimal_and_integer_value {
    public static void main(String[] args) {
        int num1;float num2;
        Scanner X=new Scanner(System.in);
        System.out.println("enter the integer value: ");
        num1= X.nextInt();
        System.out.println("enter the decimal value: ");
        num2= X.nextFloat();
        float Prod = num1 * num2;
        System.out.println(Prod);
    }
}
