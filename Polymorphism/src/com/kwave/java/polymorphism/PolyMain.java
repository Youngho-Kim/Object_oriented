package com.kwave.java.polymorphism;

public class PolyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Father son = new Son();	
		// 부모를 타입으로 받는 이유는 선택을 줄이기 위해서.(핵심 기능만 사용하기 위해서)
		// 상위 객체가 잘 정의 되어 있으면 그것만 쓰면 되기 때문에.

		son.setName("쥬니어 ");
		System.out.print(son.getName());
		System.out.println(son.name);
		son.setAge(17);
		
		
//		son.goSchool();
		Father daughter = new Daughter();
		daughter.setAge(17);
	}

}
