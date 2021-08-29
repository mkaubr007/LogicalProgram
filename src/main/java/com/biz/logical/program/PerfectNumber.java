package com.biz.logical.program;

import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        long n, sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        n=sc.nextLong();
        int i=1;
        while(i <= n/2)//executes until the condition becomes false
        {
            if(n % i == 0)
            {
                sum = sum + i;//calculates the sum of factors
            }
            i++;////after each iteration, increments the value of variable i by 1
        }
        if(sum==n)//compares sum with the number
        {
            System.out.println(n+" is a perfect number.");//prints if sum and n are equal
        } //end of if
        else
            System.out.println(n+" is not a perfect number.");//prints if sum and n are not equal
    }
}
