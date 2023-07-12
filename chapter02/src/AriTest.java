/*
測試運算符的使用1: 算術運算符

1.  +(正) -(負) +(加) -(減) *(乘) /(除) %(取餘)   
	(前)++   (後)++   (前)--   (後)--  +(連接)
*/

class AriTest 
{
	public static void main(String[] args) 
	{
		//除法:		/
		int m1 = 12;
		int n1 = 5;
		int k1 = m1 / n1;
		System.out.println(k1);  //result: 2

		System.out.println(m1 / n1 * n1);  //result: 10

		//*********************************************************************************
		//取模或取餘:		%
		int i1 = 12;
		int j1 = 5;
		System.out.println(i1 % j1);  //result: 2

		//開發中，經常用來判斷某個數num1能否整除另一個數num2。   num1 % num2 == 0
		//比如判斷num1是否為偶數:  num1 % 2 == 0

		//結論: 取模以後，結果與被模數的正負相同
		//模數 % 被模數
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
		//(前)++ : 先自增1，後運算(賦值)
		//(後)++ : 先運算(賦值)，後自增1
		int a1 = 10;
		int b1 = ++a1;
		System.out.println("a1 = " + a1 + ",b1 = " + b1);  //result: a1 = 11,b1 = 11

		int a2 = 10;
		int b2 = a2++;
		System.out.println("a2 = " + a2 + ",b2 = " + b2);  //result: a2 = 11,b2 = 10

		//練習1:
		int i = 10;
		i++;
		//++i;  此時兩者相同
		System.out.println(i); //result: 11

		//練習2:
		short s1 = 10;
		/*編譯不通過
		s1 = s1 + 1;
		方式1----
		s1 = (short)(s1 + 1);
		*/

		//方式2----同樣結果，代碼短，節省內存，效果更好
		s1++;

		System.out.println(s1);

		//*********************************************************************************
		//(前)-- : 先自減1，後運算(賦值)
		//(後)-- : 先運算(賦值)，後自減1
		//同上略過

		//++或++不會改變變量的數據類型

		//*********************************************************************************
		//+ :如果看作連接符，只適用於String與其他類型的變量間的運算，且運算結果也是String

	}
}
