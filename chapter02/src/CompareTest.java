/*
���չB��Ū��ϥ�3: ����B���

1. ==	!=	>	<	>=	<=instanceof

2.����
	> instanceof �b����ɦV���h�A�ʪ���m����
	> ==	!=	>	<	>=	<= �A�Ω�򥻼ƾ�����(�Ӹ`: >	<	>=	<=���A�Ω�boolean����)
	> �B�⵲�G��boolean
	> �F��: ==	!=  �i�H�A�Ω�ޥμƾ�����
	> �Ϥ�: =	�P	==
*/

class CompareTest 
{
	public static void main(String[] args) 
	{
		int m1 = 10;
		int m2 = 20;
		boolean compare1 = m1> m2;
		System.out.println(compare1); //false
		//�ϧO "=" �P "=="
		System.out.println(m1 == m2); //false
		System.out.println(m1 = m2);  //20
		
		boolean b1 = false;
		boolean b2 = true;
		System.out.println(b1 == b2); //false
		System.out.println(b1 = b2); //true
	}
}
