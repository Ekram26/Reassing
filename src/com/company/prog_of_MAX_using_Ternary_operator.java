package com.company;

public class prog_of_MAX_using_Ternary_operator {
    public static void main(String[] args) {

        int n1 = 10, n2 = 20,
                n3 = 30, n4 = 40, n5 =50, max;


        max = (n1 > n2 && n1 > n3 && n1 > n4 && n1 > n5)?
                n1 : ((n2 > n3 && n2 > n4 && n2 > n5) ?
                n2 : (n3 > n4 && n3 > n5 ? n3 : n5));


        System.out.println("Largest number among " +
                n1 + ", " + n2 + ", "+ n3 +
                " , "  + n4 +  " and "   + n5 + " is " + max + ". " );
    }
}

