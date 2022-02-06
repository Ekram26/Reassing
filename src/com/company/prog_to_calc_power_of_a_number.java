package com.company;
import java.util.Scanner;
public class prog_to_calc_power_of_a_number {
    public static void main(String[] args) {
        int num,pow,result=1;
        Scanner X=new Scanner(System.in);
        System.out.println("enter any number");
        num= X.nextInt();
        System.out.println("enter power of the number: ");
        pow=X.nextInt();
        for(int i=1;i<=pow;i++)
        {
            result=(num*result);
        }
        System.out.println("power: "+result);

    }
}
