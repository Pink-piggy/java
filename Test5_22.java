package haha;

import java.util.Scanner;

public class Test5_22 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Loan Amount: ");
        double amount = input.nextDouble();
        System.out.println("Number of Years: ");
        int years = input.nextInt();
        System.out.println("Annual Interest Rate: ");
        double interestRate = input.nextDouble();

        
        double monthlyPayment = (amount * interestRate / 1200) / (1 - 1 / Math.pow(1 + interestRate / 1200, years * 12));
        double totalPayment = monthlyPayment * years * 12;
        System.out.printf("Monthly Payment: %.2f\n",monthlyPayment);
        System.out.printf("Total Payment: %.2f\n",totalPayment);

        
        System.out.println("Payment#\tInterest\tPrincipal\ttBalance");

        
        double interest = 0.0, principal = 0.0;
        for(int i = 1;i <= years * 12;i++){
            interest = interestRate / 1200 * amount;
            principal = monthlyPayment - interest;
            amount -= principal;
            if(i == years * 12)
                principal += amount;
            System.out.print(i + "\t\t ");
            System.out.printf("%1.2f\t\t%6.2f\t\t%7.2f\n", interest, principal, amount);
        }

    }
}

