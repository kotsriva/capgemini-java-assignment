package com.capgemini.java.conditional;

import java.util.Scanner;

public class MovieCalculation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the no of ticket:");
		int ticket=sc.nextInt();
		if (ticket<5 || ticket>40) {
			System.out.println("Minimum 0f 5 and Maximum of 40");
			return;
		}
		System.out.println("Do you want refreshment:");
		char refreshment=sc.next().charAt(0);
		System.out.println("Do yopu have coupon code:");
		char coupon=sc.next().charAt(0);
		System.out.println("Enter the circle");
		char circle=sc.next().charAt(0);
		double ticketprice;
		if(circle == 'K') {
			ticketprice=75;
		}
		else if(circle == 'Q') {
			ticketprice=150;
		}
		else {
			System.out.println("Invalid Input");
			return;
		}
		double totalCost=ticket*ticketprice;
		if (refreshment == 'Y') {
			totalCost+=ticket*50;
		}
		if(ticket>20) {
			totalCost-=totalCost*0.10;
		}
		if(coupon == 'Y') {
			totalCost-=totalCost*0.02;
		}
		System.out.printf("Ticket cost: %.2f\n",totalCost);
		
	}

}
