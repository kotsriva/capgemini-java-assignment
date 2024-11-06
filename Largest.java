package com.capgemini.java.conditional;

public class Largest {

	public static void main(String[] args) {
		largest(2,6,4);
		largest1(3,7,4);
		largest2(3,6,4);

	}
	//Nested if else
	public static void largest(int a,int b,int c) {
		if (a>b) {
			if(a>c) {
				System.out.println("Largest:"+a);
			}
			else {
				System.out.println("Largest:"+c);
			}
		}
		else {
			if(b>c) {
				System.out.println("Largest:"+b);
			}
			else {
				System.out.println("Largest:"+c);
			}
		}
		
	}
	
	
	//else if ladder
	public static void largest1(int a,int b,int c) {
		if(a>b && a>c) {
			System.out.println("Largest:"+a);
		}
		else if(b>a && b>c) {
			System.out.println("Largest:"+b);
		}
		else {
			System.out.println("Largest:"+c);
		}
		
	}
	
	//terinary operator
	public static void largest2(int a,int b,int c) {
		int largest=(a>b)?(a>c)?a:c:(b>c)?b:c;
		System.out.println("Largest:"+largest);
	}
}
