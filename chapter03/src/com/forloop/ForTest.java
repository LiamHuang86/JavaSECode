package com.forloop;

/**
 * ClassName: ForTest
 * Package: com.loop
 * Description:  �`�����c���@ : for�`��
 *
 * 1. Java���W�d�F3�ش`�����c: for�Bwhile�Bdo-while
 * 2. �Z�O�`�����c�A�N�@�w�|���|�ӭn��
 *   a) ��l��
 *   b) �����ˬd  ----> ����@�w�Oboolean�������ܶq�Ϊ�F��
 *   c) �`���D��
 *   d) ��s(���N)
 *
 * 3. for�`�����榡
 *
 * for(a;b;d){
 *     c
 * }
 *
 * ����L�{: a - b - c - d - b - c - d - b - ... - b(�̲״`�����󤣺����A�h���������c�C)
 *
 * @Author ������
 * @Create 2023/8/3 �W�� 04:35
 * @Version 1.0
 */

public class ForTest {
    public static void main(String[] args) {

        //�ݨD1: ��X5��HelloWorld
        /*��k1--
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        */

        //��k2--
        for(int i = 1;i <= 5;i++){
            System.out.println("HelloWorld");
        }
        //�ݨD2: ���չ�ڹB�涶��
        int num = 1;
        for(System.out.println("a");num < 3; System.out.println("c"),num++){
            System.out.println("b");
        }
        //��X���G: abcbc

        //�ݨD3: �M��1-100���������ơA��������ƪ��ӼơA����Ҧ����ƪ��M
        int count = 0; //�������ƪ��Ӽ�
        int sum = 0; //�����Ҧ����ƪ��M
        for(int i  = 1;i <= 100;i++){
            if(i % 2 == 0){
                System.out.println(i);
                count++;
                sum += i;
            }


        }
        System.out.println("���ƭӼƬ�: " + count); //�g�b�`���~
        System.out.println("�Ҧ����ƪ��M��: " + sum);
    }
}
