package haha;

import java.util.Scanner;

public class test3_19 {
	public static void main(String[] args) {
		 System.out.println("Enter three sides: ");
		 Scanner input = new Scanner(System.in);
		 int side1=input.nextInt();
		 int side2=input.nextInt();
		 int side3=input.nextInt();
		 
		 if(side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
			 if(side1 > 0 && side2 > 0 && side3 > 0) {
				 System.out.println(side1 + side2 + side3);
			 }
		 }
		 else {
			 System.out.println("Illegal input value");
		 }
	}
}
