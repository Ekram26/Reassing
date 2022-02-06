package com.company;
import java.util.Scanner;
public class prog_to_check_prime_number {
    public static void main(String[] args) {
        int num,count=0;
        System.out.println("enter any number: ");
        Scanner X=new Scanner(System.in);
        num= X.nextInt();
        for (int i=1;i<=num;i++)
        {
            if(num%i==0)
                count++;
        }
        if(count==2)
        {
            System.out.println("prime number: ");
        }else
            System.out.println("not prime number: ");

    }
}
