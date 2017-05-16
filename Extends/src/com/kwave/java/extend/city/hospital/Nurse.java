package com.kwave.java.extend.city.hospital;

import com.kwave.java.extend.city.design.People;

public class Nurse extends People {

	@Override
	public void move(String direction) {
		// TODO Auto-generated method stub
		// People 클래스에서 move 메소드를 재정의 하여 사용하기 위해 오버라이드함
		super.move(direction);
	}

	public void move_nurse(String value){
		// 입력 값에 간호사의 이름을 뿌려줌
		// 오버라이드한 move 메소드에 방향을 설정하여 출력
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
