package Unit11;

import java.util.Scanner;

public class TheFirstAppropriateMethodToSolveThePackingProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the number of objects: ");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		System.out.print("Enter the weights of objects: ");
		double[] w=new double[100];
		double[] isPacked=new double[100];
		int[] con=new int[10];
		int totalW=10;
		int f=n;
		for(int i=0;i<n;i++) {
			w[i]=input.nextDouble();
			isPacked[i]=0;
			con[i]=0;
		}
		for(int j=0;j<n;j++) {
			if(f>0) {
				System.out.print("Container "+(j+1)+" contains objects with weight ");
			}
			for(int i=0;i<n;i++) {
				if(w[i]>10) {
					System.out.print("Cannot paking all objects");
				}else {
					if(isPacked[i]==0&&con[j]+w[i]<totalW) {
						con[j]+=w[i];
						isPacked[i]=1;
						System.out.print(w[i]+" ");
						//System.out.print(",con["+j+"] = "+con[j]);
						f--;
					}
				}
			}
			System.out.println();
		}
	}
}

