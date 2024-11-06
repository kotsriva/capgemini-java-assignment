package com.capgemini.java.conditional;

public class SequenceSeven {

	public static void main(String[] args) {
		int n=50;
		int i=1;
		int count=0;
		while(i<n) {
			if(count==15) {
				break;
			}
			else {
			System.out.print(i+" ");
			i=i+3;
			count+=1;
			}
		}

	}

}
