package haha;

import java.util.Scanner;

public class eighth {
	public static void main(String[] args) {
		final double PI = 3.14159;
		Scanner input = new Scanner(System.in);
		 
		System.out.print("Enter a number for raidus: ");
		double radius = input.nextDouble();
		 
		double area = radius * radius * PI;
		System.out.println("The area for the circle of raidus " + radius + " is " + area);
	}
}
