package com.company;
import java.util.Scanner;
public class prog_to_print_given_character_is_vowel_or_consonat {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter a alphabet :");
        char str=s.next().charAt(0);
        String vowel=(str=='a'||str=='e'||str=='i'||str=='o'||str=='u'||str=='A'||str=='E'||str=='I'||str=='O'||str=='U')? " given alpabet is Vowel":" given alphabet is consonent";
        System.out.println(vowel);
    }

}
