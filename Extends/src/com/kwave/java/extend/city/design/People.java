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
	// 공통적인 기능은 최상위 함수로 옮겨준다.
	// 움직이는 방향을 입력받아 프린트 문을 뿌려준다. 
		System.out.println(direction+"방향으로 움직인다.");
	}

	public String getName() {
		return name;
	}

	public void setName(String value){
		name = value;
	}
	
	
}
