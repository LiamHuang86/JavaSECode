/*
�򥻼ƾ������PString���B��

�@�B����String���z��
	1. String���A�ݩ�ޥμƾ������A�U�٦r��C
	2. String�������ܶq�A�i�H�ϥΤ@��""���覡�i���ȡC
	3. Sring�n�����r�ꤺ���A�i�H�]�t0�ӡB1�өΦh�Ӧr�šC

�G�BString�P�򥻼ƾ������ܶq�����B��
	1.�o���򥻼ƾ������O�]�tboolean�b����8�ءC
	2.String�P�򥻼ƾ������ܶq���u�వ�s���B��A�ϥ�"+"��ܡC
	3.�B�⪺���G�u��OString����
*/

class StringTest 
{
	public static void main(String[] args) 
	{
		String str1 = "Hello World";
		System.out.println(str1);

		String str2 = "";
		String str3 = "a"; //char c1 = 'a'; �S���ۦP�I

		//���ճs���B��
		int num1 = 10;
		boolean b1 = true;
		String str4 = "hello";

		System.out.println(str4 + b1); //result: hellotrue

		String str5 = str4 + b1;
		String str6 = str4 + b1 + num1;

		System.out.println(str5); //result: hellotrue
		System.out.println(str6); //result: hellotrue10

		//String str7 = b1 + num1 + str4; �sĶ���q�L
		//�����k��B��ѥ��ܥk�A�YString�S���b�̥���A���ɪ�"+"�N��[�k�A�ӫD�s���C
		//�p����b1�b�̥���A�|�O���boolean�h�i��[�k�B��C

		//�p��NString�������ܶq�ഫ���򥻼ƾ�����?
		String str8 = "abc"; //����Ҽ{�ഫ���򥻼ƾ��������C

		int num2 = 10;
		String str9 = num2+ ""; //"10"
		//int num3 = (int)str9; �sĶ����L
		
		//�p���{�O?  �ϥ�Integer��
		int num3 = Integer.parseInt(str9);
		System.out.println(num3+1);


	}
}
