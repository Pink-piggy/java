package haha;

public class Test5_25 {
    public static void main(String[] args) {
        for( int i = 10000; i <= 100000 ; i += 10000 ){
            double formula = 0;
            for ( int n = 1 ; n <= i / 2; n++ ){
            	formula += Math.pow(-1, n+1)/(2*n-1);
            }
            formula = 4 * formula ;
            System.out.printf("当i=%d时，结果为%f\n", i, formula);
        }
    }
}

