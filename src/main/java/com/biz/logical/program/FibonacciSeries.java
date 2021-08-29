package com.biz.logical.program;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n1=0,n2=1;
        Scanner sc=new Scanner(System.in);//taking input from user
        System.out.println("Enter no of count");
        int count=sc.nextInt();
        System.out.print(n1+" "+n2);//print default value
        for (int i=2;i<count;i++){//run loop up to count
            int n3=n1+n2;
            System.out.print(" "+n3);//print the result
            n1=n2;
            n2=n3;
        }
    }
}
