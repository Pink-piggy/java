package haha;

import java.util.Scanner;

public class Test5_45 {
    public static void main(String[] args) {
        // 1. 获取用户输入的10个数据
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");

        double user_input = 0, n = 0;
        // sum0所有数的和，sum1所有数的平方的和
        double sum0 = 0, sum1 = 0;
        for (int i = 1; i <= 10; i++){
            user_input = input.nextDouble();
            n++;
            sum0 += user_input;
            sum1 += Math.pow(user_input, 2);
        }

        // 计算平均值
        double mean = sum0 / n;
        double deviation = Math.sqrt((sum1 - Math.pow(sum0, 2) / n) / (n-1));

        // 输出结果
        System.out.println("The means is " + mean);
        System.out.printf("The standard deviation is %.5f" , deviation);
    }
}

