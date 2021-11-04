package haha;

public class Test5_32 {
    public static void main(String[] args) {
        
        int lottery1 = (int) (Math.random() * 10);
        int lottery2 = 0;
        
        for (int i = 0; i <= 9;i++){
            if(i != lottery1){
                lottery2 = i;
                break;
            }
        }

        System.out.println(lottery1 * 10 + lottery2);
    }
}

