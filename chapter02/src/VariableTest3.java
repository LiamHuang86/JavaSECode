/*
���հ򥻼ƾ������ܶq�����B��W�h�C

1.�o�̴���i�H���B�⪺�򥻼ƾ�������7�ءA���]�t���L�����C

2.�B��W�h�]�A:
	(1)�۰���������
	(2)�j�������ഫ

3.��VariableTest3.java�ΨӴ��զ۰���������

�W�h: ��e�q�p���ܶq�P�e�q�j���ܶq���B��ɡA���G�۰��ഫ���e�q�j���ƾ������C

	byte �B short �B char ---> int ---> long ---> float ---> double

	�S�O��: byte�Bshort�Bchar�������ܶq�������B��A���G��int�����C

����: ���ɪ��e�q�p�Τj�A�ëD���e�Ϊ����s�Ŷ����j�p�A�ӬO����ܼƾڪ��d�򪺤j�p�C
	long(8�줸��)�Bfloat(4�줸��)�A��float��ƽd���long�j�C
.
*/

class VariableTest3 
{
	public static void main(String[] args) 
	{
		int i1 = 10;
		int i2 = i1;

		long l1 = i1;

		float f1 = l1;

		byte b1 = 12;
		int i3 = b1 + i1;  //byte ---> int�A�sĶ�q�L
		/*�sĶ���q�L
		byte b2 = b1 + i1;

		******************************************************
		�S�����p1: byte�Bshort�������B��
		*/
		byte b3 = 12;
		short s1 = 10;
		//�sĶ���q�L
		//short s2 = b3 + s1;

		int i4 = b3 + s1;

		/*�sĶ���q�L
		byte b4 = 10;
		byte b5 = b3 + b4;

		����:byte�Bshort�������ܶq�������B��A���G��int�����C

		*******************************************************
		�S���p2: char
		*/
		char c1 = 'a';
		//�sĶ���q�L
		//char c2 = c1 + b3;
		int i5 = c1 + b3;

		//*****************************************************
		//�m��1:
		long l2 = 123L;
		long l3 = 123; //�z�Ѭ�: �۰��������� (int ---> long   O)

		//long l4 = 123123123123;  //123123123123�z�Ѭ�int�����A�]���W�X�Fint�������d��A�ҥH�����C 
		long l4 = 123123123123L;   //���ɪ�123123123123L�N�O�ϥ�8�Ӧ줸�զs�x��long�������ȡC

		//�m��2:
		float f2 = 12.3F;
		//float f3 = 12.3;    //�S������q�{��double�A���j��p���p�A�������p��j���۰ʴ��ɳW�h�A�ҥH�����C
		//(double ---> float   X)

		//�m��3:
		//�W�w1----�㫬�`�q�W�w��int�����C
		byte b5 = 10;
		//byte b6 = b5 +1;
		int ii1 = b5 +1;

		//�W�w2----�B�I���`�q�A�W�w�Odouble�����C
		double dd1 = b5 + 12.3;

		/*�m��4: ���������򤣤��\�ܶq�W�O�Ʀr�C
		int 123L = 12;   //���B123L���ܶq�W�C
		long l6 = 123L;  //���B�S���ƭȡA�ɭP�V�c�B�٬ޡC
		*/
	}
}
