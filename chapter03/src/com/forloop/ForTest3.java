package com.forloop;

/**
 * ClassName: ForTest3
 * Package: com.loop
 * Description: ��J��ӥ����m�Bn�A�D��"�̤j���]��"�P"�̤p������"�C
 *
 * ����:
 * 1.�ڭ̥i�H�b�`�����c���ϥ�break�C�@������break�N���X(�ε���)��e�`�����c�C
 * 2.�p�󵲧��@�Ӵ`�����c?
 *      Ans1--�`�����󤣺����C (�Y�`��������槹��false)
 *      Ans2--�b�`���D�餤����Fbreak�C
 *
 * @Author ������
 * @Create 2023/8/3 �W�� 05:42
 * @Version 1.0
 */
public class ForTest3 {
    public static void main(String[] args) {

        int m = 12;
        int n = 20;

        //���m,n�������p��
        int min = (m < n)? m : n;

        //�̤j���]��
        //�覡1:
        int result = 1;
        for(int i = 1;i <= min;i++) {
            if (m % i == 0 && n % i == 0) {
                //System.out.println(i);
                result = i;
            }
        }
        System.out.println(result);

        //�覡2:  ����
        for(int i = min;i > 0;i--){
            if(m % i == 0 && n % i == 0) {
                System.out.println(i);
                break; //�@������N���X��e�`�����c
            }
        }

        //�̤p������
        //��k1:
        int max = (m < n)? n : m;
        for(int i = max;i <= n * m;i++){
            if(i % m == 0 && i % n == 0){
                System.out.println("�̤p�����Ƭ�: "+ i);
                break;
            }
        }
        //��k2: �w���̤j���]�ƪ����p�U�A�i�H�ϥμڴX���o��k(m * n / i)

        System.out.println("�̤p�����Ƭ�: " + m * n / result);
    }
}
