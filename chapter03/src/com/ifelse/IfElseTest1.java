package com.ifelse;/*
�ר�3:
���p�P�ѥ[Java�ҸաA�L�M���˩����s�F���ӿաG
�p�G�G
���Z��100���ɡA���y�@���]���F
���Z��[80�A99]�ɡA���y�@���s�a�ۦ樮�F
���Z��[60,80)�ɡA���y���y�v���@��C�F
�䥦�ɡA�D�~�@�y�C

1. �����G�q�{���Z�O�b[0,100]�d��

2. �`�N:
	>������F�������O��`����`�����Y�ɡ]�Y�����S���涰�^�A����P�_�y�y�ΰ���y�y�����ǵL�ҿסC

	>������F�������O��`�]�t`�����Y�ɡA��`�p�W�j�U / �l�W���U`���A�_�h�d��p�������F���N���i��Q����C
*/

class IfElseTest1 
{
	public static void main(String[] args) 
	{
		int score = 59;

		//�g�k�@�G�q�{���Z�d��[0,100]�A�϶������A�i�H�N���else if��m���
        if(score == 100){
            System.out.println("���Z����!������o�@���]��!");
        }else if(score > 80 && score <= 99){    //���~���g�k�G}else if(80 < score <= 99){
            System.out.println("���y�@���s�a�ۦ樮");
        }else if(score >= 60 && score <= 80){
            System.out.println("���y���y�v�����@��C");
        }else{
        	System.out.println("�D�~�@�y");
        }
		//�g�k�G�G
        // �q�{���Z�d��[0,100]�A�϶��涰�A��m���Ǥ�����
		
		score = 100;

		if (score == 100){
			System.out.println("���Z����!������o�@���]��!");
		}else if(score >= 80){
			System.out.println("���y�@���s�a�ۦ樮!");
		}else if(score >= 60){
			System.out.println("���y���y�v���@��C!");
		}else{
			System.out.println("��~!");   //�p�Gelse���p�o�ͮɤ����ާ@�A��ꤹ�\�d��
		}
	}
}
