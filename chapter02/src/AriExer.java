/*
�H�N���X�@�ӤT��ƪ���ơA���L��ܥ����Ӧ�ơA�Q��ơA�ʦ�ƪ��ȡC
�榡�p�U�G
�Ʀrxxx�����p�p�U�G
�Ӧ�ơG
�Q��ơG
�ʦ�ơG

*/

class AriExer 
{
	public static void main(String[] args) 
	{
		//���X�T����
		int num = 864;

		//�ʦ��
		int num100 = num / 100;
		
		//�Q���
		int num10 = num % 800 / 10;

		//���L��ܭӦ��
		int num1 = num % 10;
		

		
		
		 
		//���L�ӡB�Q�B�ʦ��
		System.out.println("�Ӧ�Ƭ�: " + num1);
		System.out.println("�Q��Ƭ�: " + num10);
		System.out.println("�ʦ�Ƭ�: " + num100);


		//�B�~���m��1:
		System.out.println("5+5="+5+5); //result: "5+5=55"
		System.out.println("5+5="+(5+5)); //result: 10   ()�����B��

		//�B�~���m��2:
		byte bb1 = 127;
		bb1++;
		System.out.println("bb1 = " + bb1);
		//++��++���|�����ܶq���ƾ������Aresult: -128

		//�B�~���m��3:
		//int i = 1;
		//int j = i++ + ++i * i++;   
		//�����B���u���Ű���[��B��(��ƹB���)
		//����N�B��Ū��u���ŤS�����ȹB���(=)�A�G����i���|������ȵ�j�A�ӬO���i��B��C

		//System.out.println("j = " + j); //j = 1+3*3  result j=10  i=4

		//�B�~���m��4:
		int i = 2;
		int j = i++;
		System.out.println("j���Ȭ�: " + j); //result: j = 2

		int m = 2;
		m = m++;  //����ȡA�~���W �Ӧ��ɪ��ܶq�W��m���Q��Ȭ�m
		//����++���ʧ@����mj=3���B��A���ݤU�@�����

		//�אּ m = ++m; �Χאּ m++; ���ɵ��G�|�Om = 3
		System.out.println(m); //result: m = 2 
	}
}
