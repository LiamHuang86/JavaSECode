/*
���ձj�������ഫ

�W�h: 
1. �p�G�n�N�e�q�j���ܶq�ഫ���e�q�p�������A�ݭn�ϥαj�������ഫ�C
2. �j�������ഫ�ݭn�ϥαj���: ()�A�æb()�����W�n�ഫ���ؼмƾ������C

byte �B short �B char <--- int <--- long <--- float <--- double

3. �j�������ഫ���j��p���L�{�A�i��|�X�{��׬y�������D�C
*/

class VariableTest4 
{
	public static void main(String[] args) 
	{
		double d1 = 12 ;//�۰���������

		//�sĶ����
		//int i1 = d1;
		
		int i2 = (int)d1;
		System.out.println(i2);

		long l1 = 123;
		//�sĶ����
		//short s1 = l1;
		short s2 = (short)l1;
		
		System.out.println(s2);

		//�m��
		int i3 = 12;
		float f2 = i3; //�۰���������
		System.out.println(f2); //result: 12.0

		float f3 = (float)i3; //�sĶ�i�H�q�L�A�u���L()�i�H�ٲ��Ӥw�C

		//��׷l���ר�1:
		double d2 = 12.9;
		int i4 = (int)d2;
		System.out.println(i4); //result: 12   �᭱0.9�l���F

		//��׷l���ר�2:
		int i5 = 128;
		byte b1 = (byte)i5;  //�y�k�W�S�����D�A�sĶ�q�L
		System.out.println(b1);  //result: -128  �Q�i���Q�I�_�A�ܬ�1�}�Y�A�ҥH�e�{�t�ơC

		//��ڶ}�o�|��:
		byte b2 = 12;
		method(b2);  //�۰���������

		long l2 = 12L;
		//�sĶ���q�L
		//method(l2);
		method((int)l2); //�j�������ഫ
	} 
	public static void method(int num)  //int num = b2  �۰���������
	{
		System.out.println("num = " + num);
	}
}
