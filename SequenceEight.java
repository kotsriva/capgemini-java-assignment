package com.capgemini.java.conditional;

public class SequenceEight {

	public static void main(String[] args) {
		int t1=1;
		int t2=1;
		int i=0;
		System.out.print(t1+" ");
		while(i<15) {
			int t3=t1+t2;
			System.out.print(t3+" ");
			t1=t3;
			t2=t3;
			i++;
		}
	}

}
