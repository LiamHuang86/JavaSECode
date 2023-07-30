package com.switchcase;

/**
 * ClassName: SwitchCaseTest
 * Package: com.switchcase
 * Description: ���䵲�c switch-case���ϥ� (��ܵ��c)
 *
 * @Author ������
 * @Create 2023/7/19 �U�� 01:20
 * @Version 1.0
 */

/*
* 1. �y�k�榡
*
* switch(��F��){
*       case �`�q 1:
*           //����y�y 1
*           //break;
*       case �`�q 2:
*           //����y�y 2
*           //break;
*      ...
*      default:
*           //����y�y n+1
*           //break;
* }
*
* 2. ����L�{:
* �ھڪ�F�������ȡA�̦��ǰtcase�y�y�A�@���P�Y�@��case�����`�q�۵��A����N���榹case��������y�y�C
* ���槹������y�y����----
*       ���p1>>
*           �J��break�A�h����break��A���X��e��switch-case���c
*       ���p2>>
*           �S�J��break�A�h�~��������L��case��������y�y ----> case ��z
*           ...
*           ����J��break�A�Ϊ̰��槹�᭱�Ҧ���case��default�����y�y��A�h�X��e��switch-case���c
*
* 3. ����:
*   1)  switch������F���u��O�S�w���ƾ������C
*   �p�U: byte \ short \ char \ int \ �T�|(JDK5.0�s�W) \ String(JDK7.0�s�W)
*   2) case�᳣�O��۱`�q�A�ϥΪ�F���P�o�Ǳ`�q���۵����P�_�A����i��d�򪺧P�_�C
*   3) �}�o���ϥ�switch-case�ɡA�q�`case�ǰt�����p�������C
*   4) break: �i�H�ϥΦbswitch-case���A�@�����榹break����r�A�N���X��e��switch-case���c�C
*   5) default: ������if-else����else���c�Cdefault�O�i�H�ھڻݭn�ϥΩάٲ����A�����P��else�A������m�O�F�����C
* */
public class SwitchCaseTest {
    public static void main(String[] args) {

        int num = 1;
        switch(num){

            case 0:
                System.out.println("Zero");
            case 1:
                System.out.println("One");
            case 2:
                System.out.println("Two");
            case 3:
                System.out.println("Three");
            default:
                System.out.println("Other");
        } // result: One Two Three Other �����X��eswitch-case���c

        //********************************************************

        switch(num) {

            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Other");
                break;//default�b�̫�A�[���[break���i�H
        } //result: One  ������ܫ�Abreak���X��eswitch-case���c

        //�t��: Sting
        String season = "summer";
        switch (season) {
            case "spring":
                System.out.println("�K�x��}");
                break;
            case "summer":
                System.out.println("�L�骢��");
                break;
            case "autumn":
                System.out.println("���n");
                break;
            case "winter":
                System.out.println("�V���J�J");
                break;
            default:
                System.out.println("�u�`��J���~");
                break;  //break�����z
        }

        /*���~���Ҥl: �sĶ���q�L!
        int number = 20;
        switch(number){
            case number > 0: (���P�_�������L��)
                System.out.println("����");
                break;
            case number < 0:
                System.out.println("�t��");
                break;
            default:
                System.out.println("�s");
                break;
        }
         */
    }
}
