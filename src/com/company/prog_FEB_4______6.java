package com.company;
import java.util.Scanner;
public class prog_FEB_4______6 {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int first,second,third,fourth;
            int first1,second2,third3,fourth4;
            first=n/1000;
            n=n%1000;
            first1=first+2;
            second=n/100;
            n=n%100;
            second2=second+2;
            third=n/10;
            third3=third+2;

            fourth=n%10;
            fourth4=fourth+2;


            System.out.println(first1+""+second2+""+third3+""+fourth4);



        }
    }

