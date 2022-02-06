package com.company;
import java.util.Scanner;
public class prog_to_reverse_a_number {
    public static void main(String[] args) {
        int rem=0,num=0;
        Scanner X=new Scanner(System.in);
        System.out.println("enter any number: ");
        num= X.nextInt();
        while(num>0){
            rem=num%10;
            System.out.print(rem);
            num=num/10;
        }
    }
}
