package com.forloop;

/**
 * ClassName: ForTest2
 * Package: com.loop
 * Description: ���P��ƹB��(��1�T��ơA��T�ӼƦr�ߤ�M)�A�Ҧp" 153 = 1*1*1 + 3*3*3 + 5*5*5"
 *
 * @Author ������
 * @Create 2023/8/3 �W�� 05:22
 * @Version 1.0
 */
public class ForTest2 {
    public static void main(String[] args) {

        for(int i = 100;i < 1000;i++){

            //�B�J�@: ����
            int a = i % 10;
            int b = i / 10 % 10;
            int c = i / 100 % 10;
            //�B�J�G: �P�_���c�A�Ʀr�O�_�������P��ƪ��W�h
            if(i == a*a*a + b*b*b + c*c*c){
                System.out.println(i);
            }
        }
    }
}
