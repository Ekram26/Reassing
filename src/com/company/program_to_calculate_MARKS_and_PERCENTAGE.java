package com.company;

public class program_to_calculate_MARKS_and_PERCENTAGE {
    public static void main(String[] args) {

        float x=78f,y=45f,z=62f;
        float	scored;
        float total=300f;
        scored= x+y+z;
        float percentage;
        System.out.println("total scores is: "+scored);
        percentage =(scored/total)*100;

        System.out.println("percentage is: "+percentage);
    }
}
