package com.random;

/**
 * ClassName: RandomTest
 * Package: com.random
 * Description: �p������@���H����
 *
 * @Author ������
 * @Create 2023/7/19 �U�� 12:57
 * @Version 1.0
 */

/*
* 1.�i�H�ϥ�Java���Ѫ� API: Math�� �� random()��k
*
* 2.random()�եΥH��A�|��^�@��[0.0,1.0)�d��double�������H���ܼ�
*
* 3.�p������@��[0,100]�d���H�����?
*   �p������@��[0,100]�d���H�����?
*
* 4.�ݨD: ����@��[a,b]�d���H�����?
*   (int)(Math.random() * (b - a + 1)) + a;
* */
public class RandomTest {
    public static void main(String[] args) {

        double d1 = Math.random();

        System.out.println("d1 = " + d1);

        int num1 = (int)(Math.random() * 100);
        //[0.0,1.0) --> [0.0,101.0) -->[0,100]
        System.out.println("num1 = " + num1);

        int num2 = (int)(Math.random() * 99) + 1;
        //[0.0,1.0) --> [0.0,101.0) --> [0,99] --> [1,100]
        System.out.println("num2 = " + num2);
    }
}
