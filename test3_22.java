package haha;

import java.util.Scanner;

public class test3_22 {
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 System.out.print("Enter a point with tow coordinates: ");
		 double c1 = input.nextDouble();
		 double c2 = input.nextDouble();
		 
		 double h = Math.sqrt(1.0*c1*c1+c2*c2);
		 
		 if(h<=10) {
			 System.out.print("in");
		 }else {
			 System.out.print("not in");
		 }
	}
}
