package com.basic.java;

import java.util.Scanner;

public class Reversenumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a number:");
		int num = sc.nextInt();
		System.out.println("Reverse number is:"+num);
		
		int a=0;
		int i=0;
		int j=0;
		a=num;
		while (a>0) {
			i=a%10;
			j=(j*10)+i;
			a=a/10;
			
		}
		System.out.println(j);
		
		
	}

}
