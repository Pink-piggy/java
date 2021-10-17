package haha;

import java.util.Scanner;

public class test3_21 {
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 
		 System.out.print("Enter year: ");
		 int year = input.nextInt();
		 System.out.print("Enter month: ");
		 int m = input.nextInt();
		 System.out.print("Enter the day of the month: ");
		 int q = input.nextInt();
		 
		 if(m == 1 || m == 2) {
			 m += 12;
			 year -= 1;
		 }
			
		 int j = year / 100;
		 int k = year % 100;
		 int h = (q + 26 * (m+1) / 10 + k + k / 4 + j /4 + 5 *j) % 7;
		 
		 switch(h) {
		 case 0:System.out.println("Staurday");break;
		 case 1:System.out.println("Sunday");break;
		 case 2:System.out.println("Monday");break;
		 case 3:System.out.println("Tuesday");break;
		 case 4:System.out.println("Wednesday");break;
		 case 5:System.out.println("Thursday");break;
		 case 6:System.out.println("Friday");break;
		 }
	}
}
