/*
���չB��Ū��ϥ�4: �޿�B���

1.  &	&&	|	||	!(�D)	^(��)
2.	����
	>�޿�B��Űw�諸���Oboolean�������ܶq�i��ާ@
	>�޿�B��ŹB�⪺���G�]�Oboolean����
	>�޿�B��ű`�ϥΦb����P�_���c�B�`�����c��

*/

class LogicTest 
{
	public static void main(String[] args) 
	{

		/*
		�Ϥ�: &	&&
		
		1.�۳q�I:	��F�����O"�B"�����Y�A�u����Ÿ����k���䪺�����ȧ���true�ɡA���G�~��true�C
		
		2.����L�{�t��:  
			1) �p�G�Ÿ�����Otrue�A�h &	&& ���|����Ÿ��k�䪺�ާ@
			2) �p�G�Ÿ�����Ofalse�A�h & �|����Ÿ��k�䪺�ާ@�A�� && ���|����Ÿ��k�䪺�ާ@

		3. �}�o���A�ڭ̱��˨ϥ� &&
		*/

		//�m��1
		//�� && �Ÿ��������false �h������Ÿ��k�䪺�ާ@�A���L���~��������P�_

		boolean b1 = true;
		b1 = false; //�令false����
		int num1 = 10;

		if(b1 & (num1++ > 0)){
			System.out.println("�ɫe�����");
		}else{
			System.out.println("�ڥs���w��");
		}
		System.out.println("num1 = "+ num1); 

		//***

		boolean b2 = true;
		b2 = false; //�令false����
		int num2 = 10;
		if(b2 && (num2++ > 0)){
			System.out.println("�ɫe�����");
		}else{
			System.out.println("�ڥs���w��");
		}
		System.out.println("num2 = "+ num2); 

		//***************************************************************
		/*
		�Ϥ�: |	�M  ||
		
		1.�۳q�I:	��F�����O"��"�����Y�A�u�n�Ÿ�����s�btrue�����p�ɡA���G�N��true�C
		
		2.����L�{�t��:  
			1) �p�G�Ÿ�����Ofalse�A�h |	||  ���|����Ÿ��k�䪺�ާ@
			2) �p�G�Ÿ�����Otrue�A�h | �|�~�����Ÿ��k�䪺�ާ@�A�� || ���|����Ÿ��k�䪺�ާ@

		3. �}�o���A�ڭ̱��˨ϥ� ||
		*/

		//�m��2
		boolean b3 = false;
		b3 = true; //�令true����
		int num3 = 10;

		if(b3 | (num3++ > 0)){
			System.out.println("�ɫe�����");
		}else{
			System.out.println("�ڥs���w��");
		}
		System.out.println("num3 = "+ num3); 

		//***

		boolean b4 = false;
		b4 = true; //�令true����
		int num4 = 10;
		if(b4 || (num4++ > 0)){
			System.out.println("�ɫe�����");
		}else{
			System.out.println("�ڥs���w��");
		}
		System.out.println("num4 = "+ num4);
	}
}
