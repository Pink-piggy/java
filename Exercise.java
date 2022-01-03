package Unit11;

import java.util.Scanner;
public class Exercise {
	public static void main(String[] args) {
	     Scanner input = new Scanner(System.in);
	     int n=1;     
	     System.out.println("Enter a number: ");
	     int m=input.nextInt();
	     int temp=0;
	     int temp1=1;
	    for(int i=1;temp1==1;i++) {
	        if(i*i==m*n) {temp=n; temp1=0;}
	        else 
	            for(int t=n;t<=m;t++)
	                if(t*m==i*i) {temp=t; temp1=0;};
	    }
	    System.out.println(temp);
	    input.close();
	    }
}

