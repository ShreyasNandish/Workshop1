package com.bridgelabz.workshop_1;

import java.util.Scanner;

public class ReverseNumber {
    public static int Reverse(int num)
    {
        int rev=0;
        while(num!=0)
        {
            int remainder=num%10;
            rev=rev*10+remainder;
            num=num/10;
        }
        //System.out.println("The reverse of given number is :"+rev);
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number :");
        int num= sc.nextInt();
        int reverse =Reverse(num);
        System.out.println("The reverse of the given number is :"+reverse);
    }
}
