package com.scanner;

import java.util.Scanner;

/**
 * ClassName: ScannerTest2
 * Package: com.scanner
 * Description:
 *
 * @Author ������
 * @Create 2023/7/18 �W�� 09:40
 * @Version 1.0
 */
/*
* ���D----
* �j�a�����D�A�k�j��B�A�k�j����C
* ����k��a���n���k��A��M�n���X�@�w������G���G180cm�H�W�F�I�G�]�I1�d�U�H�W�F�ӡG�O�C
* �p�G�o�T�ӱ���P�ɺ����A�h�G���ڤ@�w�n�����L!!!��
* �p�G�T�ӱ��󦳬��u�����p�A�h�G�����a�A�S�����]�n�C��
* �p�G�T�ӱ��󳣤������A�h�G�����藍���I!!��������!!!��
*
* ���ܡG
* System.out.println(������: (cm));
* scanner.nextInt();
*
* System.out.println(���]�I: (�d�U));
* scanner.nextDouble();
*
* System.out.println(���ӧ_: (true/false));
* scanner.nextBoolean();    ��k1 -- boolean��������
*
* System.out.println(���ӧ_: (�O/�_));
* scanner.next();   "�O".equals(str)  ��k2 ---- String��������
* !! ���ϥ� isHandsome == "�O" �A���G�|�X��(�P�_��false)�C !!
* !! �ϥ� == �O�P�_��̬O�_���P�@�� �A �ϥ�.equals(str)�O�P�_���"���e"�O�_�@�P�C !!
* */
public class ScannerTest2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("�п�J����: ");
        double height = scan.nextDouble();

        System.out.print("�п�J�]�I(���-�ʸU): ");
        double wealth = scan.nextDouble();

        /*
        ��k1: boolean��������
        System.out.print("�O�_���o��(�O/�_): ");
        boolean isHandsome = scan.nextBoolean();
        */

        //��k2: String��������
        System.out.print("�O�_���o��(�O/�_): ");
        String isHandsome2 = scan.next();

        if (height >= 180 && wealth >= 10.0 && isHandsome2.equals("�O")){
            System.out.println("�ڤ@�w�n�����L!!!");
        }else if (height >= 180 || wealth >= 10.0 || isHandsome2.equals("�O")){
            System.out.println("���a�A�S�����]�n�C");
        }else{
            System.out.println("���藍���I!!��������!!!");
        }

    }
}
