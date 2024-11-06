package com.capgemini.java.conditional;

import java.util.Scanner;

public class BillGeneration {

	public static void main(String[] args) {
		billShow(100,20,10);
		//Show(100,20,10);
	}

	public static void billShow(int up,int upi,int uc) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the no of pizzas bought:");
	float Qpizza=sc.nextFloat();
	System.out.print("Enter the no of puffs bought:");
	float Qpuffs=sc.nextFloat();
	System.out.print("Enter the no of cooldrinks bought:");
	float Qcooldrinks=sc.nextFloat();
	System.out.println("Bill Details");
	System.out.println("SI NO \t\t Particulars \t Unit price \t Qty \t cost");
	System.out.println("----------------------------------------------------------------------------");
	float pizzaCost=up*Qpizza;
	float puffCost=upi*Qpuffs;
	float coolDrinksCost=uc*Qcooldrinks;
	float total=pizzaCost+puffCost+coolDrinksCost;
	for (int i=1;i<=3;i++) {
		if(i==1) {
		//float pizzaCost=up*Qpizza;
		   System.out.printf("0%d \t\t pizza \t\t %.2f \t  %.0f \t %6.2f\n",i,(float)up,Qpizza,pizzaCost);
		}
		
		else if(i==2) {
			//float puffCost=upi*Qpuffs;
			System.out.printf("0%d \t\t puffs \t\t %.2f \t\t  %.0f \t %7.2f\n",i,(float)upi,Qpuffs,puffCost);
		}
		else {
			//float coolDrinksCost=uc*Qcooldrinks;	
			System.out.printf("0%d \t\t cooldrinks \t %.2f \t\t  %2.0f \t %7.2f\n",i,(float)uc,Qcooldrinks,coolDrinksCost);
		}
	}
	System.out.println("----------------------------------------------------------------------------------");

	System.out.printf("TOTAL \t\t\t\t\t\t\t %.2f \n",total);
	System.out.println("-----------------------------------------------------------------------------------");
	System.out.println("ENJOY THE SHOW!!!");



	}

	}

