package com.kwave.java.extend.city.hospital;

import com.kwave.java.extend.city.design.People;

public class Nurse extends People {

	@Override
	public void move(String direction) {
		// TODO Auto-generated method stub
		// People Ŭ�������� move �޼ҵ带 ������ �Ͽ� ����ϱ� ���� �������̵���
		super.move(direction);
	}

	public void move_nurse(String value){
		// �Է� ���� ��ȣ���� �̸��� �ѷ���
		// �������̵��� move �޼ҵ忡 ������ �����Ͽ� ���
		System.out.print(value);
		move("Left");
		System.out.print(value);
		move("Right");
		System.out.print(value);
		move("Up");
		System.out.print(value);
		move("Down");
	}
}
