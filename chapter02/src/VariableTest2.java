/*
���զr�������P���L�������ϥ�

*/

class VariableTest2 
{
	public static void main(String[] args) 
	{
	//1.�r������: char(2�Ӧ줸��)

		//��ܧΦ�1: �ϥΤ@��''��ܡA����"��"�B"�Ȧ��@�Ӧr��"�C
		char c1 = 'a';
		char c2 = '�x';
		char c3 = '1';
		char c4 = '%';
		char c5 = '�^';

		//�sĶ���q�L
		//char c6 = '';
		//char c = 'ab';

		//��ܧΦ�2: �����ϥ�Unicode�ȨӪ�ܦr�ű`�q�C
		char c8 = '\u0036'; //�Q���i������r��6
		System.out.println(c8);

		//��ܧΦ�3: �ϥ���q�r��
		char c9 = '\n';
		char c10 = '\t';
		System.out.println("hello" + c9 + "world");

		//��ܧΦ�4: �ϥΨ���r�Ź������ƭ� (��pASCII�X)
		char c11 = 97;
		System.out.print(c11); //result: a  (ASCII�X���r�Ŷ�) a > 97 ; A > 65 ; 0 > 48

		char c12 = '1';
		char c13 = 1; //��̹������P

	//2.���L����: boolean
		//(1)�u����Ө���: true�Bfalse

		boolean bo1 = true;
		boolean bo2 = false;

		//�sĶ���q�L
		//boolean bo3 = 0;

		//(2)�`�ϥΦb�y�{����y�y���A��p: ����P�_�B�`�����c�C
		boolean isMarried = true;

		if(isMarried)
		{
			System.out.println("�ܿ�Ѥ���ѥ[�樭����F!"); //true���� (1)
		}
		else
		{
			System.out.println("�i�H�h�ʹX�Ӥk�B�ͤF"); //false���� (0)
		}

		//(3)�F��: �ڭ̤��ͥ��L�����e�Ϊ����s�Ŷ��j�p�C
		//���O�A�u���b���s�����t���ܡA�ϥΪ��O4�Ӧ줸��(���Pint 0 , 1)�C

	}
}
