/*
���վ㫬�M�B�I���ܶq���ϥ�

*/

class VariableTest1 
{
	public static void main(String[] args) 
	{
	//1.���վ㫬�ܶq���ϥ�
		//byte(1�Ӧ줸��=8bit) \ short(2�Ӧ줸��) \ int(4�Ӧ줸��) \ long(8�Ӧ줸��)

		byte b1 = 12;
		byte b2 = 127;

		//�sĶ���q�L�A�]���W�X�Fbyte���s�x�d��
		//byte b3 = 128;

		short s1 = 1234;

		int i1 = 123234123;

		//(1)�n��long�����ܶq�ɡA�ݭn���ѫ��A���'l'��'L'�C
		long l1 = 123123123L;

		//(2)�}�o���A�j�a�w�q�㫬�ܶq�ɡA�S���S���p���ܡA�q�`���n����int�����C


	//2.���կB�I�����ܶq���ϥ�
		//float(����) \ double(�����)
		double d1 = 12.3;
		//(1)�n��float�����ܶq�ɡA�ݭn���ѫ��A���'f'��'F'�C
		float f1=12.3f;

		//(2)�}�o���A�j�a�w�q�B�I���ܶq�ɡA�S���S���p���ܡA�q�`���n����double�����A�]����ק󰪡C

		//(3)float������ƽd��n�j��long��������ƽd��C���O���פ����C

	//���կB�I���ܶq�����
		//����1----
		System.out.println(0.1+0.2); //��ڬ�0.3�A���B�浲�G�o��0.30000000000000004

		//����2----
		
		float ff1 = 123123123f;
		float ff2 = ff1 + 1;
		System.out.println(ff1);
		System.out.println(ff2);
		System.out.println(ff1 == ff2); // == �P�_����ܶq�O�_�۵�
		//����: �z�פW���۵��A���]����פ����A�ҥH�P�_��true(�۵�)

		//�G�B�I����float�Bdouble���ƾڤ��A�X�b���e�\�ˤJ�~�t�����ĭp����C
		//�p�G�ݭn��T���Ʀr�p��ΫO�d���w��ƪ���סA�ݭn�ϥ�BigDecimal���C
	}
}
