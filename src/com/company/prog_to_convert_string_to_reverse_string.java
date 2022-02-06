package com.company;

public class prog_to_convert_string_to_reverse_string {
    public static void main(String[] args) {
     /*   int len,i;
        String X="BIHAR";
        String X1=" ";
        len=X.length();
        for(i=len-1;i>=0;i--)
        {
            X1=X1+X.charAt(i);
        }
        System.out.println(X1); */
        // using some methods.

        StringBuffer X=new StringBuffer("PATNA");
        System.out.println(X.reverse());

        StringBuilder X1=new StringBuilder("SIWAN");
        System.out.println(X1.reverse());
    }
}
