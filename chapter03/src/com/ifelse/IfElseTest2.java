package com.ifelse;
/*
����if-else���O�M�ϥ�

�ר�:
����L��J�T�Ӿ�Ƥ��O�s�J�ܶqnum1�Bnum2�Bnum3�A��L�̶i��Ƨ�(�ϥ� if-else if-else)�A�åB�q�p��j��X�C

�ݮi�A�A���{�q�j��p���ƦC��?

�q�}�o�g��W�ӻ��Aif-else �O�M�@�뤣�|�W�L�T�h

�p�G�bif-else���c���A����y�y�u���@�y�A�i�H�ٲ�"{}"�A������ĳ�ٲ��A�H�K����ݭn�X�i�{���X�ɧѰO�ɤW"{}"�C
*/

class IfElseTest2 
{
	public static void main(String[] args) 
	{
		int num1 = 30;
		int num2 = 10;
		int num3 = 60;
		
		if(num1 >= num2){
			if(num3 >= num1){
				System.out.println(num2 + "," + num1 + "," + num3);
			} else if (num3 <= num2) {
				System.out.println(num3 + "," + num2 + "," + num1);
			}else{
				System.out.println(num2 + "," + num3 + "," + num1);
			}
		}else {//num1 < num2
			if(num1 >= num3) {
				System.out.println(num3 + "," + num1 + "," + num2);
			}else if(num2 <= num3){
				System.out.println(num1 + "," + num2 + "," + num3);
			} else{
				System.out.println(num1 + "," + num3 + "," + num2);
			}
		}

		//********************************
		boolean b = true;
		//�p�G�g��if(b=false)��sĶ�q�L�ܡH�p�G��A���G�O�H
		if(b == false) 	 //��ĳ�Gif(!b)
			System.out.println("a");  //true != false�A�����榹��
		else if(b)
			System.out.println("b");  // b = true�A���榹��
		else if(!b)
			System.out.println("c");
		else
			System.out.println("d");
		//********************************
		if(b = false) 	 //��ĳ�Gif(!b)
			System.out.println("a");  // b�Q��Ȭ�false�A�G�����榹��
		else if(b)
			System.out.println("b");  // b�Q��Ȭ�false�A�G�����榹��
		else if(!b)
			System.out.println("c");  //���榹��
		else
			System.out.println("d");

		//�p�G�n�P�_���ܶq�Oboolean�A�i�H�����g if(b) --true �P if(!b) --false
		//����P�_������P�_���M��P�_�y�����G��true
	}
}
