package haha;

import java.util.Scanner;

public class Test8_6 {
    public static void main(String[] args) {
      
        double[][] a = new double[3][3];
        double[][] b = new double[3][3];
        double[][] c = new double[3][3];
       
        Scanner input = new Scanner(System.in);
        System.out.print("Enter matrix1: ");
        for (int i = 0; i < 3 ; i++){
            for (int j = 0 ; j < 3; j++){
                a[i][j] = input.nextDouble();
            }
        }
       
        System.out.print("Enter matrix2: ");
        for (int i = 0; i < 3 ; i++){
            for (int j = 0 ; j < 3; j++){
                b[i][j] = input.nextDouble();
            }
        }
        c = multiplyMatrix(a, b);
 
        System.out.println("The multipication of the matrices is");
        
        output(a, b ,c);
    }
    public static double[][] multiplyMatrix(double[][] a, double[][] b){
        
        double[][] c = new double[3][3];
        
        
        for (int i = 0 ; i < 3 ; i++){
            for (int j = 0 ; j < 3 ; j++){
                for (int n = 0; n < 3 ; n++){
                    c[i][j] += a[i][n] * b[n][j];
                }
            }
        }
        
        return c;
    }
    public static void output(double[][] a, double[][] b, double[][] c){
       
        for (int i = 0 ; i < 3; i++){
            
            for (int j = 0 ; j < 3 ; j++){
                System.out.print(a[i][j] + " ");
            }
            
            if ( i == 1 ){
                System.out.print("\t*\t");
            }
            else{
                System.out.print("\t\t");
            }
            
            for (int j = 0 ; j < 3 ; j++){
                System.out.print(b[i][j] + " ");
            }
           
            if ( i == 1 ){
                System.out.print(" =\t");
            }
            else{
                System.out.print("\t");
            }
            
            for (int j = 0 ; j < 3 ; j++){
                System.out.printf("%.1f ", c[i][j]);
            }
            System.out.println();
        }
    }
}

