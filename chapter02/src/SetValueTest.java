/*
���չB��Ū��ϥ�2: ��ȹB���

1. =�B+=�B -=�B*=�B /=�B%=
�����g�k�o�쵲�G���|�����ܶq�������ƾ������A�������j�������ഫ

2.����:
	>��"="�ⰼ�ƾ��������@�P�ɡA�i�H�ϥΦ۰��������ɩΨϥαj�������ഫ��h�i��B�z�C

*/

class SetValueTest 
{
	public static void main(String[] args) 
	{
		int i= 5;

		long l = 10; //�۰���������

		byte b = (byte)i; //�j�������ഫ

		//�ާ@�覡1:
		int a1 = 10;
		int b1 = 10;

		//�ާ@�覡2: �s����
		int a2;
		int b2;
		//�ΦX��: int a2,b2;
		a2 = b2 = 10;

		System.out.println(a2 + "," + b2);

		//�ާ@�覡3: ��`���覡
		//int a3 = 10;
		//int b3 = 20;

		int a3 = 10,b3 = 20;
		System.out.println(a3 + "," + b3);

		//**************************************************
		//���� += ���ϥ�
		int m1 = 10;
		m1 += 5; //������m1 = m1 + 5; result: 15
		System.out.println("m1 = " + m1);
		
		//�ϧO
		byte by1 = 10;
		by1 += 5; //�sĶ�q�L �A���g�k�o�쵲�G���|�����ܶq�������ƾ�����
		//by1 = by1 + 5; ���ާ@�νsĶ���� //by1 = (byte)(by1 + 5);���T�g�k 
		System.out.println("by1 = " + by1);

		//�m��1: �p���{�ܶq���ȼW�[2

		int n1 = 10;
		n1 += 2; 

		//�m��2: �p���{�ܶq���ȼW�[1
		int n2 = 10;
		n2 += 1; 
		//�� 
		int n3 = 10;
		n3++; 

		//�m��3:
		int i1 = 1;
		i1 *= 0.1;
		System.out.println(i1);//result: 0   int = 0.1�I�_��0
		i++;
		System.out.println(i1);//result: 1

		//�m��4:
		int m = 2;
		int n = 3;
		n *= m++; 	//n = n * m++;  n = 3*2  m++ = 2+1
		System.out.println("m=" + m);  //result: 3
		System.out.println("n=" + n);  //result: 6

	
	}
}
