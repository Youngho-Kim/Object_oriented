package com.kwave.java.obj;

public class Father extends Fix implements Cook{ // 인터페이스 상속
	public String lastname;
	public String name;
	
	public int age;
	public int money;
	public String house;
	public String car;
	public String wife = "you";
	
	public void process9(){
		// 코드 9줄
	}
	
	public void goDestination(){
		process9();
		System.out.println("코드 9줄 결과");
//		System.out.println("회사를 출근합니다");
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
		System.out.println("분해 하였습니다.");
	}

	@Override
	public void replacePart() {
		// TODO Auto-generated method stub
		System.out.println("교체 하였습니다.");
		
	}

	@Override
	public void clean() {
		// TODO Auto-generated method stub
		System.out.println("청소 하였습니다.");
		
	}

	@Override
	public void assemble() {
		// TODO Auto-generated method stub
		System.out.println("조립완료.");
		
	}

	
	
	
}
