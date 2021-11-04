package haha;

import java.util.Scanner;

public class Test5_36 {
    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first 9 digits of an ISBN as integer: ");
        int i = input.nextInt();
        int temp = i;
        
        int count = 0, result = 0;
        for (int m = 100000000; m >= 1; m /= 10){
            ++count;
            result = count * i / m;
            i %= m;
        }

        int d10 = result % 11;

        String str;
        if(d10 < 10) {
            str = "" + temp + d10;
        }else{
            str = "" + temp + "X";
        }
        System.out.println("The ISBN-10 number is " + str);
    }
}

