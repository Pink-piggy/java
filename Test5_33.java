package haha;

public class Test5_33 {
    public static void main(String[] args) {
        int temp = 0;
        for (int i = 6; i <= 10000; i++){
            temp = 0;
            
            for (int n = 1; n < i;n++){
                if (i % n == 0){
                    temp += n;
                }
            }
            if (temp == i)
                System.out.println(i+"为完全数");
        }
    }
}

