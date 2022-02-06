package com.company;
import java.util.Scanner;
public class prog_to_write_table_of_any_number {
    public static void main(String[] args) {
        int num;
        System.out.println("enter any number: ");
        Scanner X=new Scanner(System.in);
        num= X.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(num+"*"+i+"="+num*i);
        }



    }
}
