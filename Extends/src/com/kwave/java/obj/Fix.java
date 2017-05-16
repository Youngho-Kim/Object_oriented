package com.kwave.java.obj;

public abstract class Fix {

	// �߻�Ŭ���� Ư¡
	// 1. �������̽��� �����ѵ�
	// 2. �������̽� + Ŭ����
	
	
	public void process(){
		disassemble();
		replacePart();
		runLogic();
		clean();
		assemble();
	}
	
	private void runLogic(){
		// ��  ������ �ٲ�� �ȵǰ� ���������θ� �����.
		System.out.println("���������θ� ���");
	}
	public abstract void disassemble();
	
	public abstract void replacePart();
	
	public abstract void clean();
	
	public abstract void assemble();
}
