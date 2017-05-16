package com.kwave.java.extend.city.hospital;

import com.kwave.java.extend.city.design.People;

public class Nurse extends People {

	@Override
	public void move(String direction) {
		// TODO Auto-generated method stub
		super.move(direction);
	}

	public void move_nurse(String value){
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
