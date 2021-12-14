package haha;

import java.util.Arrays;

public class Test8_4 {
    public static void main(String[] args) {
        
        int[][] emplayees_workhours = {
                {2, 4, 3, 4, 5, 8, 8},
                {7, 3, 4, 3, 3, 4, 4},
                {3, 3, 4, 3, 3, 2, 2},
                {9, 3, 4, 7, 3, 4, 1},
                {3, 5, 4, 3, 6, 3, 8},
                {3, 4, 4, 6, 3, 4, 4},
                {3, 7, 4, 8, 3, 8, 4},
                {6, 3, 5, 9, 2, 7, 9},
        };
        int raw = emplayees_workhours.length;
        int col = emplayees_workhours[0].length;
        
        int[] emplayee_workhours_sum = new int[raw];
        
        int sum = 0;
      
        for (int a = 0 ; a < raw ; a++){
            
            sum = 0;
            for (int b = 0 ; b < col ; b++){
               
                sum += emplayees_workhours[a][b];
            }
            
            emplayee_workhours_sum[a] = sum;
        }
       
        int[] copy = new int[raw];
       
        System.arraycopy(emplayee_workhours_sum, 0 , copy, 0, raw);
       
        Arrays.sort(copy);
        
        for (int a = copy.length - 1 ; a >= 0 ; a--){
            
            for (int b = 0 ; b < emplayee_workhours_sum.length ; b++){
                if (copy[a] == emplayee_workhours_sum[b]){
                    System.out.println("Employee " + b + " һ�ܹ���" + copy[a] + "Сʱ");
                    emplayee_workhours_sum[b] = 0;
                }
            }
        }
    }
}

