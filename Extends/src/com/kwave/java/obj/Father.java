package com.kwave.java.obj;

public class Father extends Fix implements Cook{ // �������̽� ���
	public String lastname;
	public String name;
	
	public int age;
	public int money;
	public String house;
	public String car;
	public String wife = "you";
	
	public void process9(){
		// �ڵ� 9��
	}
	
	public void goDestination(){
		process9();
		System.out.println("�ڵ� 9�� ���");
//		System.out.println("ȸ�縦 ����մϴ�");
	}

	@Override
	public void boil() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void grill() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fry() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void oven() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void steam() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disassemble() {
		// TODO Auto-generated method stub
		System.out.println("���� �Ͽ����ϴ�.");
	}

	@Override
	public void replacePart() {
		// TODO Auto-generated method stub
		System.out.println("��ü �Ͽ����ϴ�.");
		
	}

	@Override
	public void clean() {
		// TODO Auto-generated method stub
		System.out.println("û�� �Ͽ����ϴ�.");
		
	}

	@Override
	public void assemble() {
		// TODO Auto-generated method stub
		System.out.println("�����Ϸ�.");
		
	}

	
	
	
}
