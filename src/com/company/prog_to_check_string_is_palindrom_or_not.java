package com.company;

import java.util.Scanner;

public class prog_to_check_string_is_palindrom_or_not {
    public static void main(String[] args) {
        Scanner X=new Scanner(System.in);
        System.out.println("enter any string that you want to print: ");
        String S= X.next();
        StringBuffer S1=new StringBuffer(S);
        String reverse=S1.reverse().toString();
        if(S.equals(reverse)){
            System.out.println(S +" is palindrome ");
        }else
        {
            System.out.println(S +" is not palindrome ");
        }

    }
}

