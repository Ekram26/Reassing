package com.company;
import java.util.Scanner;
public class prog_FEB_4_____7 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int first,second,third;;
        int sum;
        first=n/100;
        n=n%100;
        second=n/10;
        third=n%10;
        sum= first+second+third;
        System.out.println(sum);
    }
}

