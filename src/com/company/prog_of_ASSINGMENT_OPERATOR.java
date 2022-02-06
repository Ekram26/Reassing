package com.company;
import java.util.Scanner;
public class prog_of_ASSINGMENT_OPERATOR {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the numbers: ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int m1=sc.nextInt();
        int m2=sc.nextInt();
        int s1=sc.nextInt();
        int s2=sc.nextInt();


        n1+=n2;
        n2-=n1;
        m1*=m2;
        m2/=m1;
        s1=s2;
        s1%=s2;
        System.out.println(n1+"  "+n2+"  "+m1+"  " +m2+"  "+s1+"  "+s2);

    }
}




