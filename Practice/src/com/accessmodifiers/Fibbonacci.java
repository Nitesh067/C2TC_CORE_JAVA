package com.accessmodifiers;
import java.util.Scanner;
public class Fibbonacci {
	public static void main(String args[]) {
		int a=-1,b=1,c=1,i,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to get the Fibbonacci deries");
		n=sc.nextInt();
		sc.close();
		for(i=0;i<=n;i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
		
	}
	

}
