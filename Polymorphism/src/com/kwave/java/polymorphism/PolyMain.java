package com.kwave.java.polymorphism;

public class PolyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Father son = new Son();	
		// �θ� Ÿ������ �޴� ������ ������ ���̱� ���ؼ�.(�ٽ� ��ɸ� ����ϱ� ���ؼ�)
		// ���� ��ü�� �� ���� �Ǿ� ������ �װ͸� ���� �Ǳ� ������.

		son.setName("��Ͼ� ");
		System.out.print(son.getName());
		System.out.println(son.name);
		son.setAge(17);
		
		
//		son.goSchool();
		Father daughter = new Daughter();
		daughter.setAge(17);
	}

}
