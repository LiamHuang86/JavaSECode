/*
�ר�1: �w�q��P�v�ý�Ȭ�3.14�A�{�b3�Ӷꪺ�b�|���O��1.2�B2.5�B6�A�D���̪����n�C
*/

class FloatDoubleExer 
{
	public static void main(String[] args) 
	{
		//�w�q��P�v�ܶq
		double pi = 3.14;

		//�w�q�T�Ӷꪺ�b�|
		double radius1 = 1.2;
		double radius2 = 2.5;
		int radius3 = 6;

		//��l�ƭ��n
		double area1 = pi * radius1 * radius1;
		double area2 = pi * radius2 * radius2;
		double area3 = pi * radius3 * radius3;  //��:����վ�pi�b�⦡������m�e��|�v�T�B�浲�G
		
		//��X
		System.out.println("��1���b�|��:" + radius1 + "���n��:" + area1);
		System.out.println("��2���b�|��:" + radius2 + "���n��:" + area2);
		System.out.println("��3���b�|��:" + radius3 + "���n��:" + area3);
	}
}
