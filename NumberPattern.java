package com.capgemini.java.conditional;

import java.util.Scanner;

public class NumberPattern {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter N Value:");
		int n=sc.nextInt();
		for(int i=1;i<n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}