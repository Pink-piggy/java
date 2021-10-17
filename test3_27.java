package haha;

import java.util.Scanner;

public class test3_27 {
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 System.out.print("Enter a point with tow coordinates: ");
		 double c1 = input.nextDouble();
		 double c2 = input.nextDouble();
		 
		 if( (c1 < 0 || c1 > 200) || (c2 < 0 || c2 > 100) || 1.0/2*c1+c2<0 || 1.0/2*c1+c2>100) {
			 System.out.print("not in");
		 }else {
			 System.out.print("in");
		 }
	}
}
