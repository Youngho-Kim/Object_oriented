package com.kwave.java.polymorphism;

public class Son extends Father{

//	private String name;
	public void goSchool(){
		System.out.println("학교에 갑니다.");
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.name = ("s"+name);
	}

	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return super.getAge();
	}

	@Override
	public void setAge(int age) {
		// TODO Auto-generated method stub
		super.setAge(age);
	}
	
	
	
}
