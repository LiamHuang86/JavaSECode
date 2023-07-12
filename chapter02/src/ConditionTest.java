/*
���չB��Ū��ϥ�6: ����B���

1. (�����F��)? ��F��1 : ��F��2;

2. ����:
	1) �����F�������G�Oboolean�����C
	2) �p�G�����F�������G�Otrue�A�h���� ��F��1�C�_�h�A���� ��F��2�C
	3) ��F��1 �M ��F��2 �ݭn���ۦP�����ί�ݮe�������C

3. ����:
	>�Z�O�i�H�ϥα���B��Ū���m�A���i�H��g��if-else�C
	>�Ϥ��A�ϥ�if-else���c�A���@�w���g������B��šC�]��if-else���c�W�i�H�D�`�����C
	>���Y�b��̳���ϥ�(���c²��)�����p�U�A���˨ϥα���B��šA�]������Ĳv�y����if-else�C

*/

class ConditionTest 
{
	public static void main(String[] args)
	{

		String info = (2 > 10)? "��F��1" : "��F��2";
		System.out.println(info);  //result: ��F��2

		double result = (2 > 1)? 1 : 2.0;
		System.out.println(result);  //result: 1.0
		
		//�m��1 -- �����ƪ����j��
		int num1 = 10;
		int num2 = 20;
		int max = (num1>num2)? num1 : num2;
		System.out.println("���j�Ȭ�: " + max); //result: ���j�Ȭ�: 20


		//�m��2

		int week = 2;

		week += 10;

		week %= 7;

		//�p�Gweek %= 7; ��0�A�h���g��C
		System.out.println("���ѬO�g�G�A�Q�ѫ�O�g" + ((week == 0)? "��" : week)); //�o�̨S���w�q�ܶq
		//result: ���ѬO�g�G�A�Q�ѫ�O�g5
	}
}
