package com.bridgelabz;

import java.util.Arrays;
import java.util.Scanner;

public class Angaram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() != str2.length()) {
            System.out.println("Strings are not anagram");
        }
        else {


            char[] string1 = str1.toCharArray();
            char[] string2 = str2.toCharArray();


            Arrays.sort(string1);
            Arrays.sort(string2);


            if(Arrays.equals(string1, string2)) {
                System.out.println("Strings are anagram");
            }
            else {
                System.out.println("Strings are not anagram");
            }
        }
    }
}
