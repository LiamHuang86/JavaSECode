/*
���չB��Ū��ϥ�1: ��N�B���

1.  +(��) -(�t) +(�[) -(��) *(��) /(��) %(���l)   
	(�e)++   (��)++   (�e)--   (��)--  +(�s��)
*/

class AriTest 
{
	public static void main(String[] args) 
	{
		//���k:		/
		int m1 = 12;
		int n1 = 5;
		int k1 = m1 / n1;
		System.out.println(k1);  //result: 2

		System.out.println(m1 / n1 * n1);  //result: 10

		//*********************************************************************************
		//���ҩΨ��l:		%
		int i1 = 12;
		int j1 = 5;
		System.out.println(i1 % j1);  //result: 2

		//�}�o���A�g�`�ΨӧP�_�Y�Ӽ�num1��_�㰣�t�@�Ӽ�num2�C   num1 % num2 == 0
		//��p�P�_num1�O�_������:  num1 % 2 == 0

		//����: ���ҥH��A���G�P�Q�Ҽƪ����t�ۦP
		//�Ҽ� % �Q�Ҽ�
		int i2 = -12;
		int j2 = 5;
		System.out.println(i2 % j2);  //result: -2

		int i3 = 12;
		int j3 = -5;
		System.out.println(i3 % j3);  //result: 2

		int i4 = -12;
		int j4 = -5;
		System.out.println(i4 % j4);  //result: -2


		//*********************************************************************************
		//(�e)++ : ���ۼW1�A��B��(���)
		//(��)++ : ���B��(���)�A��ۼW1
		int a1 = 10;
		int b1 = ++a1;
		System.out.println("a1 = " + a1 + ",b1 = " + b1);  //result: a1 = 11,b1 = 11

		int a2 = 10;
		int b2 = a2++;
		System.out.println("a2 = " + a2 + ",b2 = " + b2);  //result: a2 = 11,b2 = 10

		//�m��1:
		int i = 10;
		i++;
		//++i;  ���ɨ�̬ۦP
		System.out.println(i); //result: 11

		//�m��2:
		short s1 = 10;
		/*�sĶ���q�L
		s1 = s1 + 1;
		�覡1----
		s1 = (short)(s1 + 1);
		*/

		//�覡2----�P�˵��G�A�N�X�u�A�`�٤��s�A�ĪG��n
		s1++;

		System.out.println(s1);

		//*********************************************************************************
		//(�e)-- : ���۴�1�A��B��(���)
		//(��)-- : ���B��(���)�A��۴�1
		//�P�W���L

		//++��++���|�����ܶq���ƾ�����

		//*********************************************************************************
		//+ :�p�G�ݧ@�s���šA�u�A�Ω�String�P��L�������ܶq�����B��A�B�B�⵲�G�]�OString

	}
}
