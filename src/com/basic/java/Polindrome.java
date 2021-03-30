package com.basic.java;

import java.util.Scanner;

public class Polindrome {
	public static void main(String[] args) {
		Scanner f=new Scanner(System.in);
		System.out.println("enther a number:");
		int poly = f.nextInt();
		System.out.println("The polindrome number is:"+poly);
		
	int a=0;
	int i=0;
	int j=0;
	a=poly;
	while (a>0) {
	i=a%10;
	j=(j*10)+i;
	a=a/10;
	
	}if (poly==j) {
		System.out.println("polindrome numer is:"+j);
		
	}else {
		System.out.println("Not a polindrome");
	}
	
	

}
}