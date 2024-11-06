package com.capgemini.java.conditional;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("Enter number:");
		int number=a.nextInt();
		int reversed=0;
		while(number!=0) {
			int reminder=number%10;
			reversed=reversed*10+reminder;
			number=number/10;
		}
		System.out.println(reversed);
		

	}

}
