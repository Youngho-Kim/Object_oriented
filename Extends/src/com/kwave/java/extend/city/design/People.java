package com.kwave.java.extend.city.design;

import com.kwave.java.extend.city.hospital.Patient;

public class People {

	private String gender;
	private String name;	
	private int age;
	private String skinColor;
	private String hairColor;
	private int height;
	private int weight;

	public void move(String direction){
	// �������� ����� �ֻ��� �Լ��� �Ű��ش�.
	// �����̴� ������ �Է¹޾� ����Ʈ ���� �ѷ��ش�. 
		System.out.println(direction+"�������� �����δ�.");
	}

	public String getName() {
		return name;
	}

	public void setName(String value){
		name = value;
	}
	
	
}
