package com.kwave.java.mybbs;

import java.util.Scanner;

import com.kwave.java.mybbs.presenter.BbsPresenter;

public class MybbsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		���� �Ѱ�. �ϴ� �������̹Ƿ� ����� ������ ���� �ϱ�
		String name;
		int number = 0;
		System.out.println("�ȳ��ϼ���. �Խ����Դϴ�.");
		System.out.print("�̸��� �Է����ּ���");
		Scanner scan = new Scanner(System.in);
		name = scan.next();
		System.out.println("---------------------------------------------");
		
		System.out.println(name + "�� �ȳ��ϼ���.");
		System.out.println("���Ͻô� ����� �Է����ּ���.");
		System.out.println("----------");
		System.out.println("1. ��Ϻ���");
		System.out.println("2. �� ����");
		System.out.println("3. �󼼺���");
		System.out.println("4. �����ϱ�");
		System.out.println("5. �����ϱ�");
		System.out.println("6. ������");
		System.out.println("---------");
		
		
		
		Scanner scan1 = new Scanner(System.in);
		number = scan1.nextInt();
		
		switch (number)
		  {
		  case 1 :		// ��� ����
		   System.out.println("��Ϻ���~");
		  break;

		  case 2 :		// �۾���
		   System.out.println("�۾���");
		  break;

		  case 3 :		// �� ����
		   System.out.println("�󼼺���");
		  break;

		  case 4 :		// �����ϱ�
		   System.out.println("�����ϱ�");
		  break;

		  case 5 :		// �����ϱ�
		   System.out.println("�����ϱ�");
		  break;
		  
		  case 6 :		// ������
			   System.out.println("������");
			  break;
			  

		  } 
*/

		
		BbsPresenter presenter = new BbsPresenter();
		presenter.start();
		
		
		
		
		
		
	}

}
