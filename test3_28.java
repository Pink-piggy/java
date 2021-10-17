package haha;

import java.util.Scanner;

public class test3_28 {
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 System.out.print("Enter r1's center x-,y-coordinates,width,and height: ");
		 double x1 = input.nextDouble();
		 double y1 = input.nextDouble();
		 double w1 = input.nextDouble();
		 double h1 = input.nextDouble();
		 System.out.print("Enter r2's center x-,y-coordinates,width,and height: ");
		 double x2 = input.nextDouble();
		 double y2 = input.nextDouble();
		 double w2 = input.nextDouble();
		 double h2 = input.nextDouble();
		 
	     double x0 = Math.abs(x2 - x1);
	     double y0 = Math.abs(y2 - y1);
	     
	     if(((w1 / 2 -w2 / 2) >= x0) && ((h1 / 2 -h2 / 2) >= y0)) {	            
	    	 System.out.println("r2 is inside r1");
	     }else if(((w1 - w2) / 2) < x0 && x0 < ((w1 + w2) / 2) && ((h1 - h2) / 2) < y0 && y0 < ((h1 + h2) / 2))	           
	    	 System.out.println("r2 overlaps r1");	        
	     else	            
	    	 System.out.println("r2 does not overlap r1");
	}
}
