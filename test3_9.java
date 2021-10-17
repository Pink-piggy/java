package haha;

import java.util.Scanner;

public class test3_9 {
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 
		 System.out.println("Enter the first 9 digits of an ISBN as integer: ");
		 int n = input.nextInt();
		 int d1= n / 100000000;
		 int d2 = (n / 10000000) % 10;
		 int d3 = (n / 1000000) % 10;
		 int d4 = (n / 100000) % 10;
		 int d5 = (n / 10000) % 10;
		 int d6 = (n / 1000) % 10;
		 int d7 = (n / 100) % 10;
		 int d8 = (n / 10) % 10;
		 int d9 = n % 10;
		 int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
		 
		 if(d10 == 10) {
			 System.out.println("The ISBN-10 number is "+n+"X");
		 }else {
			 System.out.println("The ISBN-10 number is "+n+d10);
		 }
	
	}
}
