package com.capgemini.java.conditional;

import java.util.Scanner;

public class EvenNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enetr First Number:");
		int a=sc.nextInt();
		System.out.print("Enter Second Number:");
		int b=sc.nextInt();
		if(a<b) {
			System.out.printf("Even Number Between %d and %d are:",a,b);
			for (int i=0;i<b;i++) {
				if(i>a) {
					if(i%2==0) {
						System.out.print(i+" ");
					}
				}
			
			}
		}
		else { 
			System.out.println("second number should be greaterthan first number");
			
		}

}
}
