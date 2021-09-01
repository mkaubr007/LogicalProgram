package com.biz.logical.program;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number");
        int number=s.nextInt();
        int reverse=0;
        while(number != 0)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/10;
        }
        System.out.println("Reverse no is: "+reverse);
    }
}
