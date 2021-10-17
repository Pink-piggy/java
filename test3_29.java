package haha;

import java.util.Scanner;

public class test3_29 {
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 System.out.print("Enter r1's center x-,y-coordinates,and radius: ");
		 double x1 = input.nextDouble();
		 double y1 = input.nextDouble();
		 double r1 = input.nextDouble();
		 System.out.print("Enter r2's center x-,y-coordinates,and radius: ");
		 double x2 = input.nextDouble();
		 double y2 = input.nextDouble();
		 double r2 = input.nextDouble();
		 
	     double h = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
	     
	     if(h < Math.abs(r1-r2)) {	            
	    	 System.out.println("circle2 is inside circle1");
	     }else if(h > Math.abs(r1-r2) && h < r1 + r2)	           
	    	 System.out.println("circle2 overlaps circle1");	        
	     else	            
	    	 System.out.println("circle2 does not onverlap circle1");
	}
}
