package haha;

import java.util.Arrays;
import java.util.Scanner;

public class Test7_19 {
    public static void main(String[] args) {
        //1. ����������ȡ�û����루����list���ȣ�
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the list: ");
        int length = input.nextInt();
        //2. ������������һ������+��ȡ�û����루��list��ֵ��
        int[] list = new int[length];
        System.out.print("Enter the contents of the list: ");
        for (int i = 0 ; i < length ; i++){
            list[i] = input.nextInt();
        }
        //2+ ������鳤�Ⱥ�Ԫ��
        System.out.print("The list has " + length + " integers ");
        for (int i = 0 ; i < length ; i++){
            System.out.print(list[i] + " ");
        }
        //3. �����������÷���isSorted������ոո�ֵ�õ����飬����boolean����ֵ
        boolean bool = isSorted(list);
        //4. �����������ݷ���ֵ������
        if (bool)
            System.out.print("\nThe list is already sorted");
        else
            System.out.print("\nThe list is not sorted");
    }
    // isSorted�������жϴ���������Ƿ��Ѿ��ź���
    public static boolean isSorted(int[] list){
        //5. isSorted��������ȡ��������鳤��Ϊlength
        int length = list.length;
        //6. isSorted����������2�����飬���ȵ���length
        int[] list_copy = new int[length];
        int[] list_copy_reverse = new int[length];
        //7. isSorted����������������鸴�Ƹ��ո��������������飨˳��ͬ��
        for (int i = 0 ; i < length ; i ++){
            list_copy[i] = list[i];
            list_copy_reverse[i] = list[length - i - 1];
        }
        //8. isSorted��������list��������ֱ�ӵ���Arrays���sort������
        Arrays.sort(list);
        //9. isSorted���������������������ȱȽϣ�equals(lis1, list2)������ֱ���������ֵ
        return Arrays.equals(list, list_copy) || Arrays.equals(list, list_copy_reverse);
    }
}

