package haha;

import java.util.Scanner;

public class Test8_17 {
    public static void main(String[] args) {
        //1. 主方法：接收用户从控制台的输入，并赋值给新建的两个int对象（分别用于保存银行个数和最低安全资产数）
        Scanner input = new Scanner(System.in);
        System.out.print("请输入银行数量和银行安全的最低资产数：");
        int n = input.nextInt();
        double limit = input.nextDouble();
        //2. 主方法：声明一个二维数组borrowers，表示贷款，长度为 银行个数n * 银行个数n
        System.out.println("请输入数据：");
        double[][] borrowers = new double[n][n];
        int[] bank = new int[n];
        double[] balance = new double[n];
        //3. 主方法：创建一个临时double变量temp用于保存数值
        int temp = 0;
        //4. 主方法：赋值
        for (int i = 0 ; i < n ; i++){
            balance[i] = input.nextDouble();
            bank[i] = input.nextInt();
            for (int j = 0 ; j < bank[i] ; j++){
                borrowers[i][input.nextInt()] = input.nextDouble();
            }
        }
        //4. 主方法：输出 不含不安全银行id、is或are的部分
        System.out.print("Unsafe banks ");
        int count = 0;
        String str = "";
        //5. 主方法：找总资产（列1、3、5元素和）少于201的银行id + 6. 继续遍历数组找id
        double[] sum = new double[n];
        for (int num = 0 ; num < n ; num++) {
            for (int i = 0; i < n; i++) {
                sum[i] = balance[i];
                for (int j = 0; j < n; j++) {
                    sum[i] += borrowers[i][j];
                }
            }
            for (int i = 0; i < n; i++) {
                if (sum[i] < 201 && balance[i] != 0) {
                    count++;
                    str += i + " ";
                    for (int j = 0; j < n; j++) {
                        borrowers[j][i] = 0;
                        balance[i] = 0;
                    }
                }
            }
        }
        if (count == 1){
            System.out.print("is " + str);
        } else {
            System.out.print("are " + str);
        }
    }
}
