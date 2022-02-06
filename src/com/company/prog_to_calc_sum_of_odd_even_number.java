package com.company;
import java.util.Scanner;
public class prog_to_calc_sum_of_odd_even_number {
    public static void main(String[] args) {
        int i,num,sum=0;
        Scanner X=new Scanner(System.in);
        System.out.println("enter any number: ");
        num= X.nextInt();
        if(num%2==0)
        {
            for(i=0;i<=num;i=i+2)
            {
                sum=sum+i;
            }
            System.out.println("sum of even number is: "+sum);
        }else
        {
            for(i=1;i<=num;i=i+2)
            {
                sum=sum+i;
            }
            System.out.println("sum of odd number is: "+sum);
        }
        }
    }