package com.bridgelabz.workshop_1;

import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number one :");
        int n1= sc.nextInt();
        System.out.println("Enter number Two :");
        int n2= sc.nextInt();
        System.out.println("Enter number Three :");
        int n3= sc.nextInt();

        if(n1>n2 && n1>n3)
            System.out.println("Number one is largest ");
        else if(n2>n3)
            System.out.println("Number Two is largest ");
        else
            System.out.println("Number Three is largest ");

    }
}
