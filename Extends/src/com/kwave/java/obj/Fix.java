package com.kwave.java.obj;

public abstract class Fix {

	// 추상클래스 특징
	// 1. 인터페이스와 동일한데
	// 2. 인터페이스 + 클래스
	
	
	public void process(){
		disassemble();
		replacePart();
		runLogic();
		clean();
		assemble();
	}
	
	private void runLogic(){
		// 이  로직은 바뀌면 안되고 내부적으로만 써야함.
		System.out.println("내부적으로만 사용");
	}
	public abstract void disassemble();
	
	public abstract void replacePart();
	
	public abstract void clean();
	
	public abstract void assemble();
}
