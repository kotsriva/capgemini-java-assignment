package com.capgemini.java.conditional;

public class FibonacciSeries {

	public static void main(String[] args) {
		int t1=0;
		int t2=1;
		int i=0;
		System.out.print(t1+" "+t2+" ");
		while(i<15) {
			int t3=t1+t2;
			System.out.print(t3+" ");
			t1=t2;
			t2=t3;
			i++;
		}

	
			
	}

}
