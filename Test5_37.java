package haha;

import java.util.Scanner;

public class Test5_37 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("������һ��ʮ����������");
        int decimal = input.nextInt();

        int remainder = 0, binary = 0;
        for (int i = 1;decimal > 0;i *= 10){
            remainder = decimal % 2;
            decimal /= 2;
            binary += remainder * i;
        }

        System.out.println(binary);
    }
}

