package com.basic.java;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		int a=0;
		int i = 0; 
		int j = 0;
		
		
		int num=153;
		a=num;
		while (a>0) {
			i=a%10;
			j=(i*i*i)+j;
			a=a/10; 
			
			
			
		}
		if (num==j) {
			System.out.println("Armstrong number="+j);
			
		}else {
			System.out.println("Not a armnstrong number");
		}
		
	}

}
