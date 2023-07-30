package com.scanner;

import java.util.Scanner;

/**
 * ClassName: ScannerTest
 * Package: com.scanner
 * Description:
 *
 * @Author ������
 * @Create 2023/7/18 �W�� 08:58
 * @Version 1.0
 */

/*
* �p��q��L������P����(�򥻼ƾ������BString����)���ܶq: �ϥ�Scanner��
*
* 1. �ϥ�Scanner������P�������B�J
* �B�J1: �ɥ] import java.util.Scanner
* �B�J2: ����(�γЫ�)�@��Scanner�������
* �B�J3: �ե�Scanner��������k�A������w�������ܶq
* �B�J4: �����귽�A�ե�Scanner����close()
*
* 2. �ר�: �p�����U�Y��ͺ����A�n�D���J�ӤH�����H���C�p�U�G
*
* �п�J�A�����W�B�A���~�֡B�A���魫�B�A�O�_�樭�B�A���ʧO�����p�C
*
* 3. Scanner�������ѤF��� byte / short / int / long / float / double / boolean / String
*    �����ܶq����k�C
*    �`�N: �S��������� char �����ܶq����k�A�ݭn�ϥ� next().charAt(0) ����r�ꤤ���Ĥ@�Ӧr�šC
* */

public class ScannerTest {
    public static void main(String[] args) {

        //�B�J2: ����(�γЫ�)�@��Scanner�������
        Scanner scan = new Scanner(System.in);

        System.out.println("�w��Ө�A�ӧک���ͺ�!");

        System.out.print("�п�J�A�����W: ");
        //�B�J3: �ե�Scanner��������k�A������w�������ܶq
        String name = scan.next();

        System.out.print("�п�J�A���~��: ");
        int age = scan.nextInt();
        System.out.print("�п�J�A���魫: ");
        double weight = scan.nextDouble();
        System.out.print("�O�_���樭(�樭-true�A�D�樭-false): ");
        boolean isSingle = scan.nextBoolean();
        System.out.print("�п�J�A���ʧO(�k / �k): ");
        char gender = scan.next().charAt(0);


        System.out.println("���W = " + name);
        System.out.println("�~�� = " + age);
        System.out.println("�魫 = " + weight);
        System.out.println("�O�_�樭 = " + isSingle);
        System.out.println("�ʧO = " + gender);

        System.out.println("���U�����A�w��!");

        //�B�J4: �����귽�A�ե�Scanner����close()
        scan.close();
    }
}
