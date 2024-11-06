package com.capgemini.java.conditional;

public class EvenOdd {

	public static void main(String[] args) {
		
		evenodd(2);

	}
	public static void evenodd(int a) {
		if(a%2==0) {
			System.out.println("Number is Even");
		}
		else {
			System.out.println("Number is Odd");
		}
	}

}
