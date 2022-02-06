package com.company;
import java.util.Scanner;
public class prog_to_calc_sum_of_num_till_n {
    public static void main(String[] args) {
        int i=1,num,sum=0;
        Scanner X=new Scanner(System.in);
        System.out.println("enter any number: ");
        num= X.nextInt();
        while(i<=num){
            sum+=i;
            i+=1;
        }
        System.out.println("submission: "+sum);

    }
}
