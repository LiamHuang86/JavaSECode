/*
1. �w�q�� LogicExer
2. �w�q main��k
3. �w�q�@��int�����ܶqa,�ܶqb,����Ȭ�20
4. �w�qboolean�����ܶqbo1 , �P�_++a �O�_�Q3�㰣,�åBa++ �O�_�Q7�㰣,�N���G��ȵ�bo1
5. ��Xa����,bo1����
6. �w�qboolean�����ܶqbo2 , �P�_b++ �O�_�Q3�㰣,�åB++b �O�_�Q7�㰣,�N���G��ȵ�bo2
7. ��Xb����,bo2����
*/

class LogicExer 
{
	public static void main(String[] args) 
	{
		int a = 20;
		int b = 20;
		boolean bo1 = (++a % 3 == 0) && (a++ % 7 == 0);
			System.out.println("a = " + a + ",bo1 = " + bo1);
		boolean bo2 = (b++ % 3 == 0) && (++b % 7 == 0);
			System.out.println("b = " + b + ",bo2 = " + bo2);

		//�����D�ѪR:

		boolean x = true;
        boolean y = false;
        short z = 42;
        
        if ((z++ == 42) && (y = true)) {    //�`�N(y = true)�O��ȡA���O" == "�A�ҥH y �O true�C z = 43
            z++;  //z = 44
        }
        if ((x = false) || (++z == 45)) {   //z = 45  �Atrue�C
            z++;  //z = 46
        }

        System.out.println("z=" + z);  //result: z = 46 
	
	}
}

