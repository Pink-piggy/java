package haha;

import java.util.Scanner;

public class Test8_17 {
    public static void main(String[] args) {
        //1. �������������û��ӿ���̨�����룬����ֵ���½�������int���󣨷ֱ����ڱ������и�������Ͱ�ȫ�ʲ�����
        Scanner input = new Scanner(System.in);
        System.out.print("�������������������а�ȫ������ʲ�����");
        int n = input.nextInt();
        double limit = input.nextDouble();
        //2. ������������һ����ά����borrowers����ʾ�������Ϊ ���и���n * ���и���n
        System.out.println("���������ݣ�");
        double[][] borrowers = new double[n][n];
        int[] bank = new int[n];
        double[] balance = new double[n];
        //3. ������������һ����ʱdouble����temp���ڱ�����ֵ
        int temp = 0;
        //4. ����������ֵ
        for (int i = 0 ; i < n ; i++){
            balance[i] = input.nextDouble();
            bank[i] = input.nextInt();
            for (int j = 0 ; j < bank[i] ; j++){
                borrowers[i][input.nextInt()] = input.nextDouble();
            }
        }
        //4. ����������� ��������ȫ����id��is��are�Ĳ���
        System.out.print("Unsafe banks ");
        int count = 0;
        String str = "";
        //5. �������������ʲ�����1��3��5Ԫ�غͣ�����201������id + 6. ��������������id
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
