package com.kwave.java.obj;

public class Son extends Father{

	public String girlfriend;

	
	@Override
	public void process9() {
		// TODO Auto-generated method stub

	}




	@Override
	public void goDestination() {
		// TODO Auto-generated method stub
//		super.goDestination(); // �θ��� Ŭ�������� ���� ��
		// super�� Ȱ��ȭ ��Ű�� �۾�ó���ȴ�.
		// Ȥ�ó� ������ ���� ��� �ּ�ó���Ѵ�
//		System.out.println("PC���� ���ϴ�.");
		
		super.process9();	// �θ� ����
		process9();	// ���� ����
		
		// ���� ���� �ۼ�
	}
	
	public void process9(int aaa) {
		// TODO Auto-generated method stub

	}
	public void process9(String a) {
		// TODO Auto-generated method stub

	}
	public void process9(int a, int b) {
		// TODO Auto-generated method stub

	}
	
	
	
	
}
