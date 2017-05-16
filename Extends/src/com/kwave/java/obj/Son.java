package com.kwave.java.obj;

public class Son extends Father{

	public String girlfriend;

	
	@Override
	public void process9() {
		// TODO Auto-generated method stub

	}




	@Override
	public void goDestination() {
		// TODO Auto-generated method stub
//		super.goDestination(); // 부모의 클래스에서 갖고 옴
		// super를 활성화 시키면 작업처리된다.
		// 혹시나 원하지 않을 경우 주석처리한다
//		System.out.println("PC방을 갑니다.");
		
		super.process9();	// 부모꺼 실행
		process9();	// 내꺼 실행
		
		// 내가 할일 작성
	}
	
	public void process9(int aaa) {
		// TODO Auto-generated method stub

	}
	public void process9(String a) {
		// TODO Auto-generated method stub

	}
	public void process9(int a, int b) {
		// TODO Auto-generated method stub

	}
	
	
	
	
}
