package com.capgemini.java.conditional;

import java.util.Scanner;

public class SumofDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter  a number:");
		int number=sc.nextInt();
		int sum=0;
		int rem=0;
		while(number>0) {
			rem=number%10;
			sum+=rem;
			number/=10;
			
		}
		System.out.print("Sum of digits:"+sum);
		}

}
