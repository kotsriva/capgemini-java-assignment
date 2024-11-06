package com.capgemini.java.conditional;

import java.util.Scanner;


public class DiceGame {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value 1:");
		int num1=sc.nextInt();
		System.out.println("Enter value 2:");
		int num2=sc.nextInt();
		if(num2>6) {
			System.out.println("Invalid Input");;
		}
		else {
			int a;
			if(num1>=0 && num2<=6) {
				if((num1+num2)<8) {
					{
						 a=8-(num1+num2);
						 System.out.println("The points scored is"+" "+a);
					}
				}
					else {
						a=((num1+num2)-8)*2;
						System.out.println("The points scored is"+" "+a);
					}
				}
			}
		}
			

	}


