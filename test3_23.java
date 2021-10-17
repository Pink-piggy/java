package haha;

import java.util.Scanner;

public class test3_23 {
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 System.out.print("Enter a point with tow coordinates: ");
		 double c1 = input.nextDouble();
		 double c2 = input.nextDouble();
		 
		 if(c1 <= 5 && c2 <= 5.0/2) {
			 System.out.print("in");
		 }else {
			 System.out.print("not in");
		 }
	}
}
