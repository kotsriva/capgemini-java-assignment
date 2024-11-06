package com.capgemini.java.conditional;

import java.util.Scanner;

public class DisplayCharacters {

	public static void main(String[] args) {
		System.out.println("Enter 4 Numbers:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		System.out.printf("%d-%c \n",num,(char)num);
		System.out.printf("%d-%c \n",num1,(char)num1);
		System.out.printf("%d-%c \n",num2,(char)num2);
		System.out.printf("%d-%c \n ",num3,(char)num3);
	}

}
