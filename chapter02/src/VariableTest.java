/*
�����ܶq���򥻨ϥ�

1. -���s�����@�Ӧs�x�ϰ�A�Ӱϰ쪺�ƾڥi�H�b�P�@�����d�򤺤��_�ܤ�

2. -�ܶq���c���]�t�T�ӭn��: �ƾ������B�ܶq�W�B�s�x����

3. -Java���ܶq�n�����榡: �ƾ����� �ܶq�W = �ܶq��

4. -Java�����ܶq���Ӽƾ������Ӥ���:
	>�򥻼ƾ�����(8��):
		�㫬: byte \ short \ int \ long
		�B�I: float \ double
		�r�ū�: char
		���L��: boolean

	>�ޥμƾ�����:
		��(class)
		�Ʋ�(array)
		���f(interface)

		�T�|(enum)
		����(annotation)
		����(record)

5.�w�q�ܶq�ɡA�ܶq�W�n��u���ѲũR�W���W�h�P�W�d�C

6.����: 
	(1)�ܶq������@�ΰ�C�ܶq�u�b�@�ΰ줺���ġA�X�F�@�ΰ�N���ĤF�C
	(2)�b�P�@�ӧ@�ΰ줤�A�����n���P�W���ܶq
	(3)�w�q�n�ܶq�H��A�N�i�H�q�L�ܶq�W���覡�A���ܶq�i��եΩιB��C
	(4)�ܶq�Ȧb��ȮɡA���������ܶq���ƾ������A�åB�b�ƾ��������Ī��d���ܤơC

*/

class VariableTest 
{
	public static void main(String[] args) 
	{   //�]�q�ܶq�̪񪺤j�A�����ܶq���@�ΰ�

		//�覡1
		int age = 10;  //�w�q�ܶq���覡: �n���P��l�ƦX��

		//�覡2
		char gender;   //�ܶq���n��

		gender = '�k'; //�ܶq�����(�Ϊ�l��)

		gender = '�k'; //�ĤG����Ȥ��O��l��

		System.out.println(age);

		System.out.println("age=" + age); //+���B���s����

		//char gender = '�k';

		gender = '�k'; //�S���ƾ���������u�O���s��ȡA�i�H�sĶ�q�L�C

		//�ѩ�number�e�S���n���ƾ������A�Y��enumber�S�����e�w�q�A�ҥH�sĶ���q�L�C
		//number = 10;

		byte b1 = 127;

		//b1�W�X�F�ܶq�ƾ��������d��
		//b1 = 128;
	}

	public static void main123(String[] args)
		{

		char gender = '�k';

		System.out.println("gender=" + gender);
		}
}
