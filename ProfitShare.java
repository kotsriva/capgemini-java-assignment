package com.capgemini.java.conditional;

import java.util.Scanner;

public class ProfitShare {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int totalProfit=sc.nextInt();
		int r=sc.nextInt();
		//System.out.println(r);
		int g=sc.nextInt();
		//System.out.println(g);
		int s=sc.nextInt();
		//System.out.println(s);
		int sum=r+g+s;
		//System.out.println(sum);
		float rProfit=totalProfit*r/sum;
		float gProfit=totalProfit*g/sum;
		float sProfit=totalProfit*s/sum;
		System.out.printf("%.2f \n",rProfit);
		System.out.printf("%.2f \n",gProfit);
		System.out.printf("%.2f \n",sProfit);
		
	}

}
