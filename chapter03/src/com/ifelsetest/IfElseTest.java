package com.ifelsetest;/*
���䵲�c1: if-else����P�_���c

1. �榡
	1) �榡�@: 
		if(�����F��){
			�y�y;
		}

	2) �榡�G:  "�G��@"
		if((�����F��){
			�y�y1;
		}else{
			�y�y2;
		}
	
	3) �榡�T:  "�h��@"
		if((�����F��1){
			�y�y1;
		}else if(�����F��2){
			�y�y2;
		}else if{
		...
		}else if(�����F��n){
			�y�yn;
		}else{
			�y�yn+1;
		}
*/

class IfElseTest 
{
	public static void main(String[] args) 
	{

		/*
		�ר�1: ���~�H�߫ߪ����`�d��O�C����60-100���C
			   ���ˮɡA�p�G�߫ߤ��b���d�򤺡A�h���ܻݭn���i�@�B���ˬd�C
		*/

		int heartBeats = 60;
		//���~�g�k -- if(60 <= heartBeats <= 100)
		if(heartBeats < 60 || heartBeats > 100){
			System.out.println("�z�ݭn���i�@�B���ˬd!");
		}else{
			System.out.println("���˵���!");
		}

		//�ר�2: �w�q�@�Ӿ�ơA�P�_�O�����٬O�_�ơC

		int num1 = 365;
		if (num1 %2 == 0){
			System.out.println(num1 + " �O����");
		}else{
			System.out.println(num1 + " �O���");
		}
	}
}
